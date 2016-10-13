package com.example.getgithubinfo.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;
import com.bumptech.glide.Glide;
import com.example.getgithubinfo.R;
import com.example.getgithubinfo.model.UserInfo;
import com.example.getgithubinfo.url.UrlValue;

import org.json.JSONArray;
import org.json.JSONException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserListActivity extends Activity {
	private static final String TAG = UserListActivity.class.getSimpleName();

	private Context mContext;

	private RequestQueue mRequestQueue;

	private ListView mListView;
	private MyAdapter mAdapter;
	private List<UserInfo> mUserInfoList;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_user_list);
		initViews();
		mContext = this;
		mRequestQueue = Volley.newRequestQueue(this.getApplicationContext());

		Intent intent = getIntent();
		mUserInfoList = (ArrayList<UserInfo>)intent.getSerializableExtra("user_list");
		if (null != mUserInfoList) {
			Log.d(TAG, "mUserInfoList.size: " + mUserInfoList.size());
			mAdapter = new MyAdapter();
			mListView.setAdapter(mAdapter);
		}
		for (int i = 0; i < mUserInfoList.size(); i++) {
			getInterestLanguage(mUserInfoList.get(i));
		}
	}

	private void initViews() {
		mListView = (ListView) findViewById(R.id.list_view_user_list);
	}

	@Override
	protected void onDestroy() {
		if (null != mRequestQueue) {
			mRequestQueue.cancelAll(TAG);
		}
		super.onDestroy();
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
						Log.d(TAG, "response: " + response.toString());
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
		if (mRequestQueue != null) {
			jsonArrayRequest.setTag(TAG);
			mRequestQueue.add(jsonArrayRequest);
		}
	}

	private class MyAdapter extends BaseAdapter {

		@Override
		public int getCount() {
			return mUserInfoList.size();
		}

		@Override
		public Object getItem(int position) {
			return null;
		}

		@Override
		public long getItemId(int position) {
			return 0;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			ViewHolder holder = null;
			if (convertView == null) {
				holder = new ViewHolder();
				convertView = LayoutInflater.from(mContext).inflate(R.layout.user_info_item, null);
				holder.img_user_face = (ImageView) convertView.findViewById(R.id.img_user_face);
				holder.txt_username = (TextView) convertView.findViewById(R.id.txt_username);
				holder.txt_interest_language = (TextView) convertView.findViewById(R.id.txt_interest_language);
				convertView.setTag(holder);
			} else {
				holder = (ViewHolder) convertView.getTag();
			}

			UserInfo item = mUserInfoList.get(position);
			Glide.with(UserListActivity.this)
					.load(item.getFaceUrl())
					.placeholder(R.mipmap.ic_loading)
					.into(holder.img_user_face);
			holder.txt_username.setText(item.getUsername());
			if (null != item.getInterestLanguage()) {
				holder.txt_interest_language.setText(item.getInterestLanguage());
			} else {
				holder.txt_interest_language.setText("");
			}
			return convertView;
		}
	}

	private static final class ViewHolder {
		public ImageView img_user_face;
		public TextView txt_username;
		public TextView txt_interest_language;
	}
}
