package com.example.getgithubinfo.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
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
import com.android.volley.toolbox.ImageRequest;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;
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

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_user_list);
		initViews();
		mContext = this;
		mRequestQueue = Volley.newRequestQueue(this.getApplicationContext());

		Intent intent = getIntent();
		List<UserInfo> data = (ArrayList<UserInfo>)intent.getSerializableExtra("user_list");
		if (null != data) {
			Log.d(TAG, "data.size: " + data.size());
			MyAdapter mAdapter = new MyAdapter(data);
			mListView.setAdapter(mAdapter);
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

	private class MyAdapter extends BaseAdapter {
		private List<UserInfo> mUserInfoList;
		public MyAdapter(List<UserInfo> userInfos) {
			this.mUserInfoList = userInfos;
		}

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
			setFaceImage(item.getFaceUrl(), holder.img_user_face);
			holder.txt_username.setText(item.getUsername());
			getInterestLanguage(item.getUsername(), holder.txt_interest_language);
			return convertView;
		}

		private void setFaceImage(String faceUrl, final ImageView imgFace) {
			ImageRequest imageRequest = new ImageRequest(
					faceUrl,
					new Response.Listener<Bitmap>() {
						@Override
						public void onResponse(Bitmap response) {
							imgFace.setImageBitmap(response);
						}
					}, 0, 0, Bitmap.Config.RGB_565,
					new Response.ErrorListener() {
						@Override
						public void onErrorResponse(VolleyError error) {

						}
					});
			if (mRequestQueue != null) {
				imageRequest.setTag(TAG);
				mRequestQueue.add(imageRequest);
			}
		}

		private void getInterestLanguage(String username, final TextView txtInterestLanguage) {
			//不是标准json格式，需要用JSONArray来实现
			JSONArray jsonArray = new JSONArray();
			String url = String.format(UrlValue.USER_REPOS_URL, username);
			Log.d(TAG, "url: " + url);
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
								txtInterestLanguage.setText(result);
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
	}

	private static final class ViewHolder {
		public ImageView img_user_face;
		public TextView txt_username;
		public TextView txt_interest_language;
	}
}
