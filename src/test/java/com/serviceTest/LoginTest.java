package com.serviceTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ResponsePojo.ResponseBasePojo;
import com.google.gson.Gson;
import com.jayway.restassured.response.Response;
import com.services.Services;

public class LoginTest {

	@Test
	public void loginTest()
	{
		Services service=new Services();
		Response response = service.login("ltljain6@rediffmail.com", "123456", "APP");
		Gson gson=new Gson();
		ResponseBasePojo fromJson = gson.fromJson(response.asString(), ResponseBasePojo.class);
		
		Assert.assertEquals(fromJson.getCustomerWrapper().getCustomers().getFirstName(), "rohit");
		Assert.assertEquals(fromJson.getCustomerWrapper().getCustomers().getLoginId(), "ltljain6@rediffmail.com");
		Assert.assertEquals(fromJson.getCustomerWrapper().getResponseCode(), "SUCCESS");
		
		
	}
	
	
	
	
	
	
}
