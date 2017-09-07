package com.requestPojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RequestPojoBase {

	@SerializedName("login")
	@Expose
	private Login login;

	public Login getLogin() {
	return login;
	}

	public void setLogin(Login login) {
	this.login = login;
	}

	public RequestPojoBase withLogin(Login login) {
	this.login = login;
	return this;
	}
}
