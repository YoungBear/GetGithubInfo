package com.example.getgithubinfo;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.EditText;
import android.widget.ListView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;
import com.example.getgithubinfo.adapter.UserInfoAdapter;
import com.example.getgithubinfo.model.UserInfo;
import com.example.getgithubinfo.model.UserSearchResult;
import com.example.getgithubinfo.net.GsonRequest;
import com.example.getgithubinfo.url.UrlValue;

import org.json.JSONArray;
import org.json.JSONException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends Activity {

    private static final String TAG = MainActivity.class.getSimpleName();
    public static final String SEARCH_TAG = "SEARCH_TAG";
    public static final String REPOS_TAG = "REPOS_TAG";

    private EditText mEditText;
    private ListView mListView;
    private UserInfoAdapter mAdapter;

    private List<UserInfo> mUserInfoList = new ArrayList<>();

    private RequestQueue mRequestQueue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRequestQueue = Volley.newRequestQueue(this.getApplicationContext());
        initViews();
    }

    private void initViews() {
        mEditText = (EditText) findViewById(R.id.et_username);
        mListView = (ListView) findViewById(R.id.list_view_users);

        mEditText.addTextChangedListener(new EditChangedListener());

    }

    @Override
    protected void onDestroy() {
        cancelAllRequest();
        super.onDestroy();
    }

    private void cancelAllRequest() {
        if (mRequestQueue != null) {
            mRequestQueue.cancelAll(SEARCH_TAG);
            mRequestQueue.cancelAll(REPOS_TAG);
        }
    }

    private void getUsers(String s) {
        mUserInfoList.clear();
        if (null != mAdapter) {
            mAdapter.notifyDataSetChanged();
        }
        if (TextUtils.isEmpty(s)) {
            cancelAllRequest();
            return;
        }

        String getUsersUrl = String.format(UrlValue.SEARCH_USER_URL,
                s, UrlValue.CLIENT_ID_VALUE, UrlValue.CLIENT_SECRET_VALUE);
        Log.d(TAG, "getUsersUrl: " + getUsersUrl);
        GsonRequest<UserSearchResult> userSearchResultGsonRequest = new GsonRequest<UserSearchResult>(
                Request.Method.GET,
                getUsersUrl,
                UserSearchResult.class,
                new Response.Listener<UserSearchResult>() {
                    @Override
                    public void onResponse(UserSearchResult response) {
                        int total_count = response.getTotal_count();
                        if (total_count > 0) {
                            for (int i = 0; i < total_count && i < 30; i++) {
                                UserInfo tempUserInfo = new UserInfo();
                                tempUserInfo.setUsername(response.getItems().get(i).getLogin());
                                tempUserInfo.setFaceUrl(response.getItems().get(i).getAvatar_url());
                                mUserInfoList.add(tempUserInfo);
                            }
                            mAdapter = new UserInfoAdapter(MainActivity.this, mUserInfoList);
                            mListView.setAdapter(mAdapter);
                            for (int i = 0; i < mUserInfoList.size(); i++) {
                                getInterestLanguage(mUserInfoList.get(i));
                            }
                        } else {
                            Log.d(TAG, "has no such a user");
                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.d(TAG, "fail to get user info");
                    }
                });
        userSearchResultGsonRequest.setTag(SEARCH_TAG);
        if (mRequestQueue != null) {
            cancelAllRequest();
            mRequestQueue.add(userSearchResultGsonRequest);
        }
    }

    private void getInterestLanguage(final UserInfo item) {
        //不是标准json格式，需要用JSONArray来实现
        JSONArray jsonArray = new JSONArray();
        String url = String.format(UrlValue.USER_REPOS_URL,
                item.getUsername(), UrlValue.CLIENT_ID_VALUE, UrlValue.CLIENT_SECRET_VALUE);
        Log.d(TAG, "getRepoUrl: " + url);
        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Request.Method.GET,
                url,
                jsonArray,
                new Response.Listener<JSONArray>() {
                    @Override
                    public void onResponse(JSONArray response) {
//                        Log.d(TAG, "response: " + response.toString());
                        int length = response.length();
                        Log.d(TAG, "length: " + length);
                        if (length == 0) {
                            return;
                        }
                        Map<String, Integer> languageMap = new HashMap<>();
                        for (int i = 0; i < response.length(); i++) {
                            try {
                                String languageValue = response.getJSONObject(i).getString("language");
                                if (languageMap.containsKey(languageValue)) {
                                    languageMap.put(languageValue, languageMap.get(languageValue) + 1);
                                } else {
                                    languageMap.put(languageValue, 1);
                                }
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                        }
                        if (languageMap.size() == 0) {
                            return;
                        }
                        //获取使用最多的语言
                        int max = 0;
                        String result = null;
                        for (Map.Entry<String, Integer> entry : languageMap.entrySet()) {
                            if (entry.getValue() > max) {
                                max = entry.getValue();
                                result = entry.getKey();
                            }
                        }
                        Log.d(TAG, "result: " + result);
                        if (null != result) {
                            item.setInterestLanguage(result);
                            mAdapter.notifyDataSetChanged();
                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.d(TAG, "onErrorResponse, error: " + error.getMessage());
                    }
                });
        jsonArrayRequest.setTag(REPOS_TAG);
        if (mRequestQueue != null) {
            cancelAllRequest();
            mRequestQueue.add(jsonArrayRequest);
        }
    }

    private class EditChangedListener implements TextWatcher {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            Log.d(TAG, "onTextChanged, s: " + s);
            getUsers(s.toString());
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    }
}
