package com.api.tests;

import com.api.models.request.SignUpRequest;
import com.api.service.AuthService;
import com.beust.ah.A;
import com.fasterxml.jackson.core.JsonProcessingException;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AccountCreationTest {
    @Test(description = "Verify SignUp is Working")
    public void accountCreationTest()  {
        SignUpRequest signUpRequest = new SignUpRequest.Builder()
                .firstName("Ankit")
                .username("ankit112334")
                .email("ankit1235361@gmail.com")
                .lastName("Pan")
                .mobileNumber("8989898989")
                .password("ankit1234")
                .build();
        //System.out.println(signUpRequest);
        AuthService authService=new AuthService();
        Response response = authService.signUp(signUpRequest);
        System.out.println(response.asPrettyString());
        Assert.assertEquals(response.asPrettyString(),"User registered successfully!");
    }
}
