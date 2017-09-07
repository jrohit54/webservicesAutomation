package com.requestPojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Login {

	@SerializedName("loginId")
	@Expose
	private String loginId;
	@SerializedName("password")
	@Expose
	private String password;
	@SerializedName("loginSource")
	@Expose
	private String loginSource;

	public String getLoginId() {
	return loginId;
	}

	public void setLoginId(String loginId) {
	this.loginId = loginId;
	}

	public Login withLoginId(String loginId) {
	this.loginId = loginId;
	return this;
	}

	public String getPassword() {
	return password;
	}

	public void setPassword(String password) {
	this.password = password;
	}

	public Login withPassword(String password) {
	this.password = password;
	return this;
	}

	public String getLoginSource() {
	return loginSource;
	}

	public void setLoginSource(String loginSource) {
	this.loginSource = loginSource;
	}

	public Login withLoginSource(String loginSource) {
	this.loginSource = loginSource;
	return this;
	}
}
