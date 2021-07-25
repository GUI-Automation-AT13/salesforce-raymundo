package salesforce.api;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import core.api.ApiManager;
import core.api.ApiMethod;
import core.api.ApiRequestBuilder;
import core.api.ApiResponse;
import salesforce.entities.Contact;

import static core.utils.LoadEnvironmentFile.getTheBaseUrl;
import static salesforce.api.ApiTokenGenerator.getApiToken;

public class ContactTest {
    private Contact contact = new Contact();
    private ApiRequestBuilder apiRequestBuilder = new ApiRequestBuilder();
    private ApiResponse apiResponse = new ApiResponse();

    public void createAContact() throws JsonProcessingException {
        contact.setFirstName("First Name");
        contact.setLastName("Last Name");
        apiRequestBuilder
                .addHeader("Authorization", getApiToken())
                .addBaseUri(getTheBaseUrl())
                .clearPathParams()
                .addEndpoint("/services/data/v52.0/sobjects/Contact/")
                .addBody(new ObjectMapper().writeValueAsString(contact))
                .addMethod(ApiMethod.POST)
                .build();
        ApiManager.executeWithBody(apiRequestBuilder.build(), apiResponse);
    }

    public void deleteAContact() {
        apiRequestBuilder
                .addHeader("Authorization", getApiToken())
                .addBaseUri(getTheBaseUrl())
                .clearPathParams()
                .addEndpoint("/services/data/v52.0/sobjects/Contact/{contactID}")
                .addPathParams("contactID", "0035e000009ht5EAAQ")
                .addMethod(ApiMethod.DELETE)
                .build();
        ApiManager.execute(apiRequestBuilder.build(), apiResponse);
    }
}
