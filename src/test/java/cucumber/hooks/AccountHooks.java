package cucumber.hooks;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import core.api.ApiManager;
import core.api.ApiMethod;
import core.api.ApiRequestBuilder;
import core.api.ApiResponse;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import salesforce.entities.Account;

public class AccountHooks {
    private Account account;
    private final String accountName = "Punisher";
    private ApiResponse apiResponse;
    private ApiRequestBuilder requestBuilder;

    public AccountHooks(ApiRequestBuilder requestBuilder, ApiResponse apiResponse, Account account) {
        this.account = account;
        this.requestBuilder = requestBuilder;
        this.apiResponse = apiResponse;
    }

    @Before(value = "@CreateAccount")
    public void createAnAccount() throws JsonProcessingException {
        account.setName(accountName);
        requestBuilder
                .clearPathParams()
                .addEndpoint("/services/data/v52.0/sobjects/Account/")
                .addBody(new ObjectMapper().writeValueAsString(account))
                .addMethod(ApiMethod.POST)
                .build();
        ApiManager.executeWithBody(requestBuilder.build(), apiResponse);
        account.setId(apiResponse.getPath("id"));
    }

    @After(value = "@DeleteAccount")
    public void deleteAnAccount() {
        requestBuilder
                .clearPathParams()
                .addEndpoint("/services/data/v52.0/sobjects/Account/{accountID}")
                .addPathParams("accountID", account.getId())
                .addMethod(ApiMethod.DELETE)
                .build();
        ApiManager.execute(requestBuilder.build(), apiResponse);
    }
}
