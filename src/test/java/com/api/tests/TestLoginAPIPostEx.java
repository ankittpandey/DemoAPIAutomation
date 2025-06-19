package com.api.tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLoginAPIPostEx {

    @Test
    public void LoginTest(){
        RestAssured.baseURI = "http://64.227.160.186:8080";
        RequestSpecification x = RestAssured.given();
        RequestSpecification y = x.header("Content-Type","application/json");
        RequestSpecification z = y.body("{\"username\": \"ankit1234\",\"password\": \"ankit1234\"}");
        Response response = y.post("/api/auth/login");
        System.out.println(response.asPrettyString());
        Assert.assertEquals(response.getStatusCode(),200);
    }
}
