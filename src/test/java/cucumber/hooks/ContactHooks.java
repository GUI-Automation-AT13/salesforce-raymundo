package cucumber.hooks;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import core.api.ApiManager;
import core.api.ApiMethod;
import core.api.ApiRequestBuilder;
import core.api.ApiResponse;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import salesforce.entities.Contact;

public class ContactHooks {
    private Contact contact;
    private ApiResponse apiResponse;
    private ApiRequestBuilder requestBuilder;
    private final String contactName = "Frank";
    private final String contactLastName = "Castle";

    public ContactHooks(Contact contact, ApiResponse apiResponse, ApiRequestBuilder requestBuilder) {
        this.contact = contact;
        this.apiResponse = apiResponse;
        this.requestBuilder = requestBuilder;
    }

    @Before(value = "@CreateContact")
    public void createAContact() throws JsonProcessingException {
        contact.setFirstName(contactName);
        contact.setLastName(contactLastName);
        requestBuilder
                .clearPathParams()
                .addEndpoint("/services/data/v52.0/sobjects/Contact/")
                .addBody(new ObjectMapper().writeValueAsString(contact))
                .addMethod(ApiMethod.POST)
                .build();
        ApiManager.executeWithBody(requestBuilder.build(), apiResponse);
        contact.setId(apiResponse.getPath("id"));
    }

    @After(value = "@DeleteContact")
    public void deleteAContact() {
        requestBuilder
                .clearPathParams()
                .addEndpoint("/services/data/v52.0/sobjects/Contact/{contactID}")
                .addPathParams("contactID", contact.getId())
                .addMethod(ApiMethod.DELETE)
                .build();
        ApiManager.execute(requestBuilder.build(), apiResponse);
    }
}
