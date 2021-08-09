package salesforce.api;

import core.api.ApiManager;
import core.api.ApiMethod;
import core.api.ApiRequestBuilder;
import core.api.ApiResponse;

import static core.utils.LoadEnvironmentFile.*;

public class ApiTokenGenerator {
    private static String token;
    public static void generateToken() {
        ApiResponse tokenApiResponse = new ApiResponse();
        ApiRequestBuilder apiRequestBuilder = new ApiRequestBuilder();
        apiRequestBuilder
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
        ApiManager.executeWithoutLog(apiRequestBuilder.build(), tokenApiResponse);
        token = tokenApiResponse.getPath("token_type").concat(" ").concat(tokenApiResponse.getPath("access_token"));
    }

    public static String getApiToken() {
        generateToken();
        return token;
    }
}
