package cucumber.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;
import salesforce.entities.Case;
import salesforce.ui.pages.*;

import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.Map;

import static salesforce.config.EnvironmentConfig.getPassword;
import static salesforce.config.EnvironmentConfig.getUsername;

public class CreateCaseSteps {
    Case newCase = new Case();
    String actualMessage;
    Map actualCaseDetailsValues;
    Map expectedCaseDetailsValues;
    SoftAssert softAssert = new SoftAssert();
    @Given("I login to salesforce as a(n) {string} user")
    public void iLoginToSalesforceAsAUser(final String userType) {
        //get user credentials
        String username = getUsername();
        String password = getPassword();
        //login
        LoginPage loginPage = new LoginPage();
        loginPage.loginSuccessful(username, password);
        HomePage homePage = new HomePage();
    }

    @When("I create a case with fields")
    public void iCreateACaseWith(final Map<String, String> entry)
            throws InvocationTargetException, IllegalAccessException {
        //Set entity
        newCase.setCaseWithMap(entry);
        //Create entity on UI
        CasesPage casesPage = new CasesPage();
        CasesFormPage casesFormPage = casesPage.clickOnNew();
        newCase.setCaseOwner(casesFormPage.getCaseOwner());
        SingleCasePage singleCasePage = casesFormPage.createCase(entry.keySet(), newCase);
        actualMessage = casesFormPage.getPopUpMessage();
        //Update case
        SimpleDateFormat dateFormat = new SimpleDateFormat("d/M/yyyy HH:mm");
        newCase.setDateTimeOpened(dateFormat.format(Date.from(Instant.now())));
        newCase.setCreatedBy(newCase.getCaseOwner().concat(newCase.getDateTimeOpened()));
        newCase.setLastModifiedBy(newCase.getCaseOwner().concat(newCase.getDateTimeOpened()));
        newCase.setCaseNumber(singleCasePage.getHeadersField("Case Number"));
    }

    @Then("a success message is displayed")
    public void aSuccessIsDisplayed() {
        String expectedRegex = "Case \"[0-9]{8}\" was created.";
        softAssert.assertTrue(actualMessage.matches(expectedRegex),
                "\nactual: " + actualMessage + "\nexpected regex: " + expectedRegex);
    }

    @When("I check on the site's headers")
    public void iCheckOnTheSiteSHeaders() {
        //set headers maps
    }

    @Then("all header's fields match to the created case")
    public void allHeaderSFieldsMatchToTheCreatedCase() {
        //verify headers
        SingleCasePage singleCasePage = new SingleCasePage();
        softAssert.assertEquals(singleCasePage.getHeadersTitle(), "Case");
        softAssert.assertEquals(singleCasePage.getHeadersSubject(), newCase.getSubject());
        softAssert.assertEquals(singleCasePage.getHeadersField("Priority"), newCase.getPriority());
        softAssert.assertEquals(singleCasePage.getHeadersField("Status"), newCase.getStatus());
    }

    @And("I check on the site's details")
    public void iCheckOnTheSiteSDetails() throws IllegalAccessException {
        //set details maps
        SingleCasePage singleCasePage = new SingleCasePage();
        actualCaseDetailsValues = singleCasePage.getDetailsFields();
        expectedCaseDetailsValues = newCase.createMapOnKeySetFromCase(actualCaseDetailsValues.keySet());
    }

    @Then("all detail's fields match to the created case")
    public void allDetailSFieldsMatchToTheCreatedCase() {
        //Verify details
        softAssert.assertEquals(actualCaseDetailsValues, expectedCaseDetailsValues);
    }

    @Then("the created case is displayed")
    public void theCreatedCaseIsDisplayed() {
        //Verify created case
        CasesPage casesPage = new CasesPage();
        //CasesPage
        newCase.setId(casesPage.getCaseId(newCase.getCaseNumber()));
        softAssert.assertEquals(casesPage.getCaseNumberCellText(newCase.getCaseNumber()), newCase.getCaseNumber());
        softAssert.assertEquals(casesPage.getDateTimeOpenedCellText(newCase.getCaseNumber()), newCase.getDateTimeOpened());
        softAssert.assertEquals(casesPage.getStatusCellText(newCase.getCaseNumber()), newCase.getStatus());
        softAssert.assertAll();
    }
}
