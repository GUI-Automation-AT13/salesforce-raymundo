package cucumber.hooks;

import core.api.ApiManager;
import core.api.ApiMethod;
import core.api.ApiRequestBuilder;
import core.api.ApiResponse;
import io.cucumber.java.After;
import salesforce.entities.Case;

public class CaseHooks {
    private ApiResponse apiResponse;
    private ApiRequestBuilder requestBuilder;
    private Case newCase;

    public CaseHooks(ApiResponse apiResponse, ApiRequestBuilder requestBuilder, Case newCase) {
        this.apiResponse = apiResponse;
        this.requestBuilder = requestBuilder;
        this.newCase = newCase;
    }

    @After(value = "@DeleteCase", order = 3)
    public void deleteACase() {
        requestBuilder
                .clearPathParams()
                .addEndpoint("/services/data/v52.0/sobjects/Case/{caseID}")
                .addPathParams("caseID", newCase.getId())
                .addMethod(ApiMethod.DELETE)
                .build();
        ApiManager.execute(requestBuilder.build(), apiResponse);
    }
}
