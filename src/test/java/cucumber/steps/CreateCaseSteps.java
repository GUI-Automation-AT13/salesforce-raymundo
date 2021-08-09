package cucumber.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;
import salesforce.entities.Case;
import salesforce.ui.pages.*;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import static salesforce.config.EnvironmentConfig.getPassword;
import static salesforce.config.EnvironmentConfig.getUsername;
import static salesforce.utils.FileTranslator.translateValue;

public class CreateCaseSteps {
    private Case newCase;
    private String actualMessage;
    String featureName = "Cases";
    private SoftAssert softAssert;

    public CreateCaseSteps(final Case newCase, final SoftAssert softAssert) {
        this.newCase = newCase;
        this.softAssert = softAssert;
    }

    @Given("I login to salesforce as an admin user")
    public void iLoginToSalesforceAsAnAdminUser() {
        LoginPage loginPage = new LoginPage();
        loginPage.loginSuccessful(getUsername(), getPassword());
        HomePage homePage = new HomePage();
    }

    @When("I create a case with fields")
    public void iCreateACaseWith(final Map<String, String> caseValues)
            throws InvocationTargetException, IllegalAccessException {
        newCase.setCaseWithMap(caseValues);
        CasesPage casesPage = new CasesPage();
        CasesFormPage casesFormPage = casesPage.clickOnNew();
        newCase.setCaseOwner(casesFormPage.getCaseOwner());
        SingleCasePage singleCasePage = casesFormPage.createCase(caseValues.keySet(), newCase);
        actualMessage = casesFormPage.getPopUpMessage();
        newCase.updateCase(singleCasePage.getCaseNumber());
        newCase.setId(singleCasePage.getCaseId());
    }

    @Then("a success message should be displayed")
    public void aSuccessMessageShouldBeDisplayed() {
        String expectedRegex = translateValue(featureName, "popup.message.regexp");
        softAssert.assertTrue(actualMessage.matches(expectedRegex),
                "\nactual: " + actualMessage + "\nexpected regex: " + expectedRegex);
    }

    @And("all header's fields should match the created case")
    public void allHeaderSFieldsShouldMatchTheCreatedCase() throws IllegalAccessException {
        SingleCasePage casePage = new SingleCasePage();
        Map actualCaseHeadersValues = casePage.getAllHeadersFields();
        Map expectedCaseHeadersValues = newCase.createMapOnKeySetFromCase(actualCaseHeadersValues.keySet());
        expectedCaseHeadersValues.put("title", translateValue(featureName, "title.case"));
        softAssert.assertEquals(actualCaseHeadersValues, expectedCaseHeadersValues);
    }

    @Then("all detail's fields should match the created case")
    public void allDetailSFieldsShouldMatchTheCreatedCase() throws IllegalAccessException {
        SingleCasePage casePage = new SingleCasePage();
        Map actualCaseDetailsValues = casePage.getDetailsFields();
        Map expectedCaseDetailsValues = newCase.createMapOnKeySetFromCase(actualCaseDetailsValues.keySet());
        softAssert.assertEquals(actualCaseDetailsValues, expectedCaseDetailsValues);
    }

    @Then("the created case should be displayed")
    public void theCreatedCaseShouldBeDisplayed() throws IllegalAccessException {
        CasesPage casesPage = new CasesPage();
        Map actualCaseRowValues = casesPage.getRowFields(newCase.getCaseNumber());
        Map expectedCaseRowValues = newCase.createMapOnKeySetFromCase(actualCaseRowValues.keySet());
        softAssert.assertEquals(actualCaseRowValues, expectedCaseRowValues);
    }
}
