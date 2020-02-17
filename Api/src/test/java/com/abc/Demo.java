package com.abc;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Demo {
	
	
@Test

	public void getdata()
	{
		Response rs =RestAssured.get("https://reqres.in/api/users?page=2");
	  int stcode=rs.statusCode();
	  String res=rs.getContentType();
	  System.out.println(res);
	  System.out.println(rs.getTime());
	  System.out.println(stcode);
	  Assert.assertEquals(stcode, 200);
	  
	

	}
}
