package com.ResponsePojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ResponseBasePojo {
	@SerializedName("customerWrapper")
	@Expose
	private CustomerWrapper customerWrapper;

	public CustomerWrapper getCustomerWrapper() {
	return customerWrapper;
	}

	public void setCustomerWrapper(CustomerWrapper customerWrapper) {
	this.customerWrapper = customerWrapper;
	}

	public ResponseBasePojo withCustomerWrapper(CustomerWrapper customerWrapper) {
	this.customerWrapper = customerWrapper;
	return this;
	}
}
