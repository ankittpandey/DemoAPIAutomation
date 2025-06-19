package com.api.tests;

import com.api.listeners.TestListener;
import com.api.models.request.LoginRequest;
import com.api.models.response.LoginResponse;
import com.api.service.AuthService;
import com.fasterxml.jackson.core.JsonProcessingException;
import io.restassured.response.Response;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.api.listeners.TestListener.class)
public class LoginTest {

    @Test (description = "Verify Login is Working")
    public void LoginTest() throws JsonProcessingException {
        AuthService authService = new AuthService();
        LoginRequest loginRequest=new LoginRequest("ankit1234","ankit1234");
        /*ObjectMapper mapper = new ObjectMapper();
        String jsonString = mapper.writeValueAsString(loginRequest);
        System.out.println("jsonString "+jsonString);*/
        Response response= authService.login(loginRequest);
        LoginResponse loginResponse = response.as(LoginResponse.class);
        //System.out.println(response.asPrettyString());
        //System.out.println(loginResponse.getToken());
        //System.out.println(loginResponse.getEmail());

    }
}