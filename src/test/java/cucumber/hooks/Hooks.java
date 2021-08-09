package cucumber.hooks;

import com.fasterxml.jackson.core.JsonProcessingException;
import core.api.ApiManager;
import core.api.ApiMethod;
import core.api.ApiRequestBuilder;
import core.api.ApiResponse;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
import salesforce.config.EnvironmentConfig;

import static core.selenium.MyWebDriverManager.getWebDriverManager;
import static core.utils.LoadEnvironmentFile.*;

public class Hooks {
    private WebDriver driver;
    private ApiRequestBuilder requestBuilder;
    private ApiResponse apiResponse;
    private ApiResponse tokenApiResponse;
    private String token;
    private SoftAssert softAssert;

    public Hooks(ApiRequestBuilder requestBuilder, ApiResponse apiResponse, ApiResponse tokenApiResponse, SoftAssert softAssert) {
        this.requestBuilder = requestBuilder;
        this.apiResponse = apiResponse;
        this.tokenApiResponse = tokenApiResponse;
        this.softAssert = softAssert;
    }

    @Before(order = 0)
    public void generateToken() throws JsonProcessingException {
        requestBuilder
                .addBaseUri(getTheLoginUrl())
                .addEndpoint("/services/oauth2/token")
                .addQueryParams("grant_type", "password")
                .addQueryParams("client_id", getTheSalesforceClientId())
                .addQueryParams("client_secret", getTheSalesforceClientSecret())
                .addQueryParams("username", getTheSalesforceUsername())
                .addQueryParams("password", getTheSalesforcePassword().concat(getTheSalesforceToken()))
                .addHeader("Accept", "application/json")
                .addHeader("Content-Type", "application/x-www-form-urlencoded")
                .addMethod(ApiMethod.POST);
        ApiManager.executeWithoutLog(requestBuilder.build(), tokenApiResponse);
        token = tokenApiResponse.getPath("token_type").concat(" ").concat(tokenApiResponse.getPath("access_token"));
    }

    @Before(order = 1)
    public void setUp() {
        requestBuilder
                .addHeader("Authorization", token)
                .addBaseUri(getTheBaseUrl());
        driver = getWebDriverManager().getDriver();
        driver.get(EnvironmentConfig.getEnvironmentConfig().getLogin());
    }

    @After(order = 1)
    public void tearDown() {
        softAssert.assertAll();
        getWebDriverManager().quitDriver();
    }
}
