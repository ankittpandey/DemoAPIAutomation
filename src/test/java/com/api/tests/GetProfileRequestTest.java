package com.api.tests;

import com.api.models.request.LoginRequest;
import com.api.models.response.LoginResponse;
import com.api.models.response.UserProfileResponse;
import com.api.service.AuthService;
import com.api.service.UserProfileMgmtService;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetProfileRequestTest {
    @Test(description = "Verify Get Profile is Working")
    public void getProfileInfo() {
        AuthService authService = new AuthService();
        LoginRequest loginRequest=new LoginRequest("ankit1234","ankit1234");
        Response response = authService.login(loginRequest);
        LoginResponse loginResponse = response.as(LoginResponse.class);
        System.out.println(loginResponse.getToken());

        UserProfileMgmtService userProfileMgmtService = new UserProfileMgmtService();
        response = userProfileMgmtService.getProfile(loginResponse.getToken());
        System.out.println(response.asPrettyString());
        UserProfileResponse userProfileResponse = response.as(UserProfileResponse.class);
        Assert.assertEquals(userProfileResponse.getUsername(),"ankit1234");
    }
}
