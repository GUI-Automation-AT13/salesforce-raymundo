package salesforce.api;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import core.api.ApiManager;
import core.api.ApiMethod;
import core.api.ApiRequestBuilder;
import core.api.ApiResponse;
import salesforce.entities.Account;

import static core.utils.LoadEnvironmentFile.getTheBaseUrl;
import static salesforce.api.ApiTokenGenerator.getApiToken;

public class AccountTest {
    private Account account = new Account();
    private ApiRequestBuilder apiRequestBuilder = new ApiRequestBuilder();
    private ApiResponse apiResponse = new ApiResponse();

    public void createAnAccount() throws JsonProcessingException {
        account.setName("Account Name");
        apiRequestBuilder
                .addHeader("Authorization", getApiToken())
                .addBaseUri(getTheBaseUrl())
                .clearPathParams()
                .addEndpoint("/services/data/v52.0/sobjects/Account/")
                .addBody(new ObjectMapper().writeValueAsString(account))
                .addMethod(ApiMethod.POST)
                .build();
        ApiManager.executeWithBody(apiRequestBuilder.build(), apiResponse);
    }

    public void deleteAnAccount() {
        apiRequestBuilder
                .addHeader("Authorization", getApiToken())
                .addBaseUri(getTheBaseUrl())
                .clearPathParams()
                .addEndpoint("/services/data/v52.0/sobjects/Account/{accountID}")
                .addPathParams("accountID", "0015e00000FNEyyAAH")
                .addMethod(ApiMethod.DELETE)
                .build();
        ApiManager.execute(apiRequestBuilder.build(), apiResponse);
    }
}
