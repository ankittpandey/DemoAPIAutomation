package com.api.tests;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLoginAPIPostEx2 {

    @Test
    public void LoginTest(){
        Response response = given().
                baseUri("http://64.227.160.186:8080").
                header("Content-Type","application/json").
                body("{\"username\": \"ankit1234\",\"password\": \"ankit1234\"}").
                post("/api/auth/login");
        System.out.println(response.asPrettyString());
        Assert.assertEquals(response.getStatusCode(),200);
    }
}
