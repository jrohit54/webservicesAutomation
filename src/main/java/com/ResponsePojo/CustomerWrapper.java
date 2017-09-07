package com.ResponsePojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CustomerWrapper {

	@SerializedName("responseCode")
	@Expose
	private String responseCode;
	@SerializedName("customers")
	@Expose
	private Customers customers;

	public String getResponseCode() {
	return responseCode;
	}

	public void setResponseCode(String responseCode) {
	this.responseCode = responseCode;
	}

	public CustomerWrapper withResponseCode(String responseCode) {
	this.responseCode = responseCode;
	return this;
	}

	public Customers getCustomers() {
	return customers;
	}

	public void setCustomers(Customers customers) {
	this.customers = customers;
	}

	public CustomerWrapper withCustomers(Customers customers) {
	this.customers = customers;
	return this;
	}
}
