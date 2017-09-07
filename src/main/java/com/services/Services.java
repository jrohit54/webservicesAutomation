package com.services;


import org.json.JSONObject;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.specification.RequestSpecification;
import com.requestPojo.Login;
import com.requestPojo.RequestPojoBase;

public class Services {

	public Response  login(String loginId,String loginPassword,String source)
	{
		
		RequestPojoBase rpb=new RequestPojoBase();
		Login login=new Login();
		login.setLoginId(loginId);
		login.setPassword(loginPassword);
		login.setLoginSource(source);
		rpb.setLogin(login);
		
		JSONObject jsonObject = new JSONObject(rpb);
		
		//Rest assured login object created 
		RequestSpecification spec = RestAssured.given();
		spec.header("content-type","application/json");
	    spec.body(jsonObject.toString());
	    Response postResponse = spec.post(URL.loginUrl);
	    return postResponse;
		
	}
	
	
	
	
}
