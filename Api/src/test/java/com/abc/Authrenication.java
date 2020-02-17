package com.abc;

import org.testng.annotations.Test;

import io.restassured.RestAssured;



public class Authrenication {

	@Test
	public void data()
	{

	    int stcode=RestAssured.given().auth().
	   preemptive().basic("ToolsQA", "TestPassword").when().
		get("https://restapi.demoqa.com/authentication/checkForAuthentication").getStatusCode();
	    
	    System.out.println(stcode);
	}
}
