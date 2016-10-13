package com.example.getgithubinfo.model;

import java.io.Serializable;

/**
 * Created by bearyang on 2016/10/12.
 */

public class UserInfo implements Serializable{

	private String username;
	private String faceUrl;
	private String interestLanguage;

	public void setUsername(String username) {
		this.username = username;
	}

	public void setFaceUrl(String faceUrl) {
		this.faceUrl = faceUrl;
	}

	public String getUsername() {

		return username;
	}

	public String getFaceUrl() {
		return faceUrl;
	}

	public String getInterestLanguage() {
		return interestLanguage;
	}

	public void setInterestLanguage(String interestLanguage) {
		this.interestLanguage = interestLanguage;
	}
}
