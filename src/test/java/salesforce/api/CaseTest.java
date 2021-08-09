package salesforce.api;

import core.api.ApiManager;
import core.api.ApiMethod;
import core.api.ApiRequestBuilder;
import core.api.ApiResponse;
import org.testng.annotations.Test;
import salesforce.entities.Account;

import static core.utils.LoadEnvironmentFile.getTheBaseUrl;
import static salesforce.api.ApiTokenGenerator.getApiToken;

public class CaseTest {
    private Account account = new Account();
    private ApiRequestBuilder apiRequestBuilder = new ApiRequestBuilder();
    private ApiResponse apiResponse = new ApiResponse();

    public void deleteACase() {
        apiRequestBuilder
                .addHeader("Authorization", getApiToken())
                .addBaseUri(getTheBaseUrl())
                .clearPathParams()
                .addEndpoint("/services/data/v52.0/sobjects/Case/{caseID}")
                .addPathParams("caseID", "5005e000001FA7pAAG")
                .addMethod(ApiMethod.DELETE)
                .build();
        ApiManager.execute(apiRequestBuilder.build(), apiResponse);
    }

    @Test
    public void test128() {
        deleteACase();
    }
}
