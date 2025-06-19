package com.api.tests;

import com.api.service.AuthService;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class ForgetPasswordTest {

    @Test(description = "Verify Forget Password is Working")
    public void forgetPasswordTest() {
        AuthService authService=new AuthService();
        Response response = authService.forgetPassword("ankit1235361@gmail.com");
        System.out.println(response.asPrettyString());

    }
}
