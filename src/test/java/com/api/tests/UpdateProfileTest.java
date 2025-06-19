package com.api.tests;

import com.api.models.request.LoginRequest;
import com.api.models.request.ProfileRequest;
import com.api.models.response.LoginResponse;
import com.api.service.AuthService;
import com.api.service.UserProfileMgmtService;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class UpdateProfileTest {
    @Test(description = "Verify Update Profile is working")
    public void updateProfileTest(){
        AuthService authService=new AuthService();
        LoginRequest loginRequest=new LoginRequest("ankit1234","ankit1234");
        Response response = authService.login(loginRequest);
        LoginResponse loginResponse = response.as(LoginResponse.class);
        System.out.println(response.asPrettyString());
        System.out.println("--------------------------------");
        UserProfileMgmtService userProfileMgmtService=new UserProfileMgmtService();
        response = userProfileMgmtService.getProfile(loginResponse.getToken());
        System.out.println(response.asPrettyString());
        System.out.println("--------------------------------");
        ProfileRequest profileRequest = new ProfileRequest.Builder()
                .setFirstName("Ankit")
                .setLastName("Pandey")
                .setMobileNumber("7878787879")
                .setEmail("ankit@gmail.com")
                .build();
        response = userProfileMgmtService.updateProfile(loginResponse.getToken(),profileRequest);
        System.out.println(response.asPrettyString());

    }
}
