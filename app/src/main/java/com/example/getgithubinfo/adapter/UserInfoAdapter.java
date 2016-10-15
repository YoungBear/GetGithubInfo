package com.example.getgithubinfo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.getgithubinfo.R;
import com.example.getgithubinfo.model.UserInfo;

import java.util.List;

/**
 * Created by bearyang on 2016/10/13.
 */

public class UserInfoAdapter extends BaseAdapter {

    private Context mContext;
    private List<UserInfo> mUserInfoList;

    public UserInfoAdapter(Context context, List<UserInfo> userInfoList) {
        mContext = context;
        mUserInfoList = userInfoList;
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
        Glide.with(mContext)
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


    private static final class ViewHolder {
        public ImageView img_user_face;
        public TextView txt_username;
        public TextView txt_interest_language;
    }
}
