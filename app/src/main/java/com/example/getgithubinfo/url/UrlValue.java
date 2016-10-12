package com.example.getgithubinfo.url;

/**
 * Created by bearyang on 2016/10/12.
 */

public final class UrlValue {
	public static final String HOST = "https://api.github.com";
	public static final String SEARCH_USER_URL = HOST + "/search/users?q=%s&per_page=%s";
	public static final String USER_REPOS_URL = HOST + "/users/%s/repos";
}
