package com.example.getgithubinfo.url;

/**
 * Created by bearyang on 2016/10/12.
 */

public final class UrlValue {
	public static final String HOST = "https://api.github.com";
	public static final String SEARCH_USER_URL = HOST + "/search/users?q=%s&per_page=%s&client_id=%s&client_secret=%s";
	public static final String USER_REPOS_URL = HOST + "/users/%s/repos?client_id=%s&client_secret=%s";

	//use OAuth application to exceed rate limit from 60 to 5000 per hour
	public static final String CLIENT_ID_VALUE = "8fc37e449c0a481ee319";//from github OAuth applications
	public static final String CLIENT_SECRET_VALUE = "80d1703b47b4581a42570e20248d924a9eb57797";
}
