package com.abc;

import org.json.simple.JSONObject;
import org.junit.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Demo1 {
@Test
	public void data(){
	
	
	    RequestSpecification req=RestAssured.given();
	    req.header("Content-type","application/json");
	    
	    JSONObject json=new JSONObject();
	    json.put("name", "Gaju");
	    json.put("job", "IBN");
	    
	    req.body(json.toJSONString());
	    Response rs=req.put("https://reqres.in/api/users/2");
	    int stcode=rs.statusCode();
	    System.out.println(stcode);
	    Assert.assertEquals(stcode, 200);
	    
	    
	  
	     
		
	}

}
