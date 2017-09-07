package com.ResponsePojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Customers {
	@SerializedName("createDate")
	@Expose
	private String createDate;
	@SerializedName("customerId")
	@Expose
	private Integer customerId;
	@SerializedName("firstName")
	@Expose
	private String firstName;
	@SerializedName("gender")
	@Expose
	private String gender;
	@SerializedName("loginId")
	@Expose
	private String loginId;
	@SerializedName("loginType")
	@Expose
	private String loginType;
	@SerializedName("password")
	@Expose
	private String password;
	@SerializedName("registrationDate")
	@Expose
	private String registrationDate;
	@SerializedName("registrationEmailSend")
	@Expose
	private String registrationEmailSend;
	@SerializedName("siteLink")
	@Expose
	private String siteLink;

	public String getCreateDate() {
	return createDate;
	}

	public void setCreateDate(String createDate) {
	this.createDate = createDate;
	}

	public Customers withCreateDate(String createDate) {
	this.createDate = createDate;
	return this;
	}

	public Integer getCustomerId() {
	return customerId;
	}

	public void setCustomerId(Integer customerId) {
	this.customerId = customerId;
	}

	public Customers withCustomerId(Integer customerId) {
	this.customerId = customerId;
	return this;
	}

	public String getFirstName() {
	return firstName;
	}

	public void setFirstName(String firstName) {
	this.firstName = firstName;
	}

	public Customers withFirstName(String firstName) {
	this.firstName = firstName;
	return this;
	}

	public String getGender() {
	return gender;
	}

	public void setGender(String gender) {
	this.gender = gender;
	}

	public Customers withGender(String gender) {
	this.gender = gender;
	return this;
	}

	public String getLoginId() {
	return loginId;
	}

	public void setLoginId(String loginId) {
	this.loginId = loginId;
	}

	public Customers withLoginId(String loginId) {
	this.loginId = loginId;
	return this;
	}

	public String getLoginType() {
	return loginType;
	}

	public void setLoginType(String loginType) {
	this.loginType = loginType;
	}

	public Customers withLoginType(String loginType) {
	this.loginType = loginType;
	return this;
	}

	public String getPassword() {
	return password;
	}

	public void setPassword(String password) {
	this.password = password;
	}

	public Customers withPassword(String password) {
	this.password = password;
	return this;
	}

	public String getRegistrationDate() {
	return registrationDate;
	}

	public void setRegistrationDate(String registrationDate) {
	this.registrationDate = registrationDate;
	}

	public Customers withRegistrationDate(String registrationDate) {
	this.registrationDate = registrationDate;
	return this;
	}

	public String getRegistrationEmailSend() {
	return registrationEmailSend;
	}

	public void setRegistrationEmailSend(String registrationEmailSend) {
	this.registrationEmailSend = registrationEmailSend;
	}

	public Customers withRegistrationEmailSend(String registrationEmailSend) {
	this.registrationEmailSend = registrationEmailSend;
	return this;
	}

	public String getSiteLink() {
	return siteLink;
	}

	public void setSiteLink(String siteLink) {
	this.siteLink = siteLink;
	}

	public Customers withSiteLink(String siteLink) {
	this.siteLink = siteLink;
	return this;
	}

}
