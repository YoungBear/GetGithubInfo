package com.example.getgithubinfo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.Volley;
import com.example.getgithubinfo.activity.UserListActivity;
import com.example.getgithubinfo.model.UserInfo;
import com.example.getgithubinfo.model.UserSearchResult;
import com.example.getgithubinfo.net.GsonRequest;
import com.example.getgithubinfo.url.UrlValue;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

	private static final String TAG = MainActivity.class.getSimpleName();

	private static final int DEFAULT_PER_PAGE_COUNT = 30;
	private int PER_PAGE_COUNT = DEFAULT_PER_PAGE_COUNT;

	private EditText mEditText;
	private EditText perPageCountEditText;
	private Button btnConfirm;
	private TextView txtErrorInfo;

	private List<UserInfo> mUserInfoList;

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
		perPageCountEditText = (EditText) findViewById(R.id.et_per_page_count);
		btnConfirm = (Button) findViewById(R.id.btn_confirm);
		txtErrorInfo = (TextView) findViewById(R.id.txt_error_info);

		btnConfirm.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				getUsers();
			}
		});
	}

	@Override
	protected void onDestroy() {
		if (mRequestQueue != null) {
			mRequestQueue.cancelAll(TAG);
		}
		super.onDestroy();
	}

	private void getUsers() {
		String keyWords = mEditText.getText().toString();
		String perPageCountText = perPageCountEditText.getText().toString();
		if (TextUtils.isEmpty(keyWords)) {
			return;
		}
		mUserInfoList = new ArrayList<>();
		if (!TextUtils.isEmpty(perPageCountText)) {
			int count = Integer.valueOf(perPageCountText);
			if (count >= 100) {
				PER_PAGE_COUNT = 100;
			} else {
				PER_PAGE_COUNT = count;
			}
		}
		String getUsersUrl = String.format(UrlValue.SEARCH_USER_URL, keyWords, String.valueOf(PER_PAGE_COUNT));
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
							for (int i = 0; i < total_count && i < PER_PAGE_COUNT; i++) {
								UserInfo tempUserInfo = new UserInfo();
								tempUserInfo.setUsername(response.getItems().get(i).getLogin());
								tempUserInfo.setFaceUrl(response.getItems().get(i).getAvatar_url());
								mUserInfoList.add(tempUserInfo);
								Log.d(TAG, "login: " + tempUserInfo.getUsername());
							}
							Intent intent = new Intent(MainActivity.this, UserListActivity.class);
							Log.d(TAG, "mUserInfoList.size(): " + mUserInfoList.size());
							intent.putExtra("user_list", (Serializable) mUserInfoList);
							startActivity(intent);
						} else {
							Log.d(TAG, "has no such a user");
							txtErrorInfo.setText("has no such a user");
						}
					}
				},
				new Response.ErrorListener() {
					@Override
					public void onErrorResponse(VolleyError error) {
						Log.d(TAG, "fail to get user info");
						txtErrorInfo.setText("fail to get user info");
					}
				});
		if (mRequestQueue != null) {
			userSearchResultGsonRequest.setTag(TAG);
			mRequestQueue.add(userSearchResultGsonRequest);
		}
	}
}
