package salesforce.cases;

import org.apache.commons.lang3.time.DateUtils;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import salesforce.base.BaseTest;
import salesforce.entities.Case;
import salesforce.ui.PageTransporter;
import salesforce.ui.pages.*;

import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import static core.utils.ObjectToMap.convertObjectToMap;

public class CreateCasesTests extends BaseTest {
    private PageTransporter pageTransporter = new PageTransporter();
    private CasesPage casesPage;
    private HomePage homePage;
    private CasesFormPage casesFormPage;
    private SingleCasePage singleCasePage;
    private PopUpConfirmPage popUpConfirmPage;
    private SoftAssert softAssert = new SoftAssert();
    private String singleCaseTitle = "Case";
    private String priorityHeaderTitle = "Priority";
    private String statusHeaderTitle = "Status";
    private String caseNumberHeaderTitle = "Case Number";

    @Test
    public void testCreateCaseWithRequiredValues() throws ParseException, InvocationTargetException, IllegalAccessException {
        //Required values on case
        Case newCase = new Case();
        Map newCaseValues = new HashMap();
        newCaseValues.put("priority", "Medium");
        newCaseValues.put("caseOrigin", "Phone");
        newCaseValues.put("status", "New");
        newCase.setCaseWithMap(newCaseValues);
        //Login to salesforce
//        homePage = loginPage.loginSuccessful(getUsername(), getPassword());
        //Navigate to Case's site
//        casesPage = pageTransporter.goToCases();
        //Click on new case
        casesFormPage = casesPage.clickOnNew();
        //Fill case form
        casesFormPage.selectValueOnCaseOriginMenu(newCase.getCaseOrigin());
        singleCasePage = casesFormPage.clickOnSaveButton();
        //Set missing values
        newCase.setDateTimeOpened(DateUtils.truncate(Date.from(Instant.now()), Calendar.MINUTE).toString());
        newCase.setCaseOwner("Raymundo Guaraguara");
        newCase.setCreatedBy(newCase.getCaseOwner() + newCase.getDateTimeOpened());
        newCase.setLastModifiedBy(newCase.getCaseOwner() + newCase.getDateTimeOpened());
        newCase.setCaseNumber(singleCasePage.getHeadersField(caseNumberHeaderTitle));
        //Get success message
        String actual = casesFormPage.getPopUpMessage();
        //Verify message
        String expectedRegex = "Case \"[0-9]{8}\" was created.";
        softAssert.assertTrue(actual.matches(expectedRegex),
                "\nactual: " + actual + "\nexpected regex: " + expectedRegex);
        //Verify case headers
        softAssert.assertEquals(singleCasePage.getHeadersTitle(), singleCaseTitle);
        softAssert.assertEquals(singleCasePage.getHeadersField(priorityHeaderTitle), newCase.getPriority());
        softAssert.assertEquals(singleCasePage.getHeadersField(statusHeaderTitle), newCase.getStatus());
        //Verify case details
        Map actualCaseDetailsValues = singleCasePage.getDetailsFields();
        Map expectedCaseDetailsValues = convertObjectToMap(newCase);
        softAssert.assertEquals(actualCaseDetailsValues, expectedCaseDetailsValues);
        //Navigate to case's site

        //Verify case on case's list

        popUpConfirmPage = singleCasePage.clickOnDelete();
        popUpConfirmPage.clickOnDelete();
        softAssert.assertAll();
    }

    @Test
    public void testCreateCaseWithAllValues() throws ParseException {
//        homePage = loginPage.loginSuccessful(EnvironmentConfig.getEnvironmentConfig().getUsername(),
//                EnvironmentConfig.getEnvironmentConfig().getPassword());
//        casesPage = pageTransporter.goToCases();
        casesFormPage = casesPage.clickOnNew();
        casesFormPage.selectValueOnContacts("Bruce Wayne");
        casesFormPage.selectValueOnTypeMenu("Mechanical");
        casesFormPage.selectValueOnCaseReasonMenu("Installation");
        casesFormPage.selectValueOnPriorityMenu("Low");
        casesFormPage.selectValueOnCaseOriginMenu("Phone");
        casesFormPage.inputTextOnWebEmailTextBox("email@email.com");
        casesFormPage.inputTextOnWebNameTextBox("my name");
        casesFormPage.inputTextOnWebCompanyTextBox("my company");
        casesFormPage.inputTextOnWebPhoneTextBox("1111 2222 4444");
        casesFormPage.selectValueOnProductMenu("GC1040");
        casesFormPage.selectValueOnPotentialLiabilityMenu("No");
        casesFormPage.inputTextOnEngineeringReqNumberTextBox("5");
        casesFormPage.selectValueOnSlaViolationMenu("No");
        casesFormPage.inputTextOnSubjectTextBox("The subject");
        casesFormPage.inputTextOnDescriptionTextBox("The description");
        casesFormPage.inputTextOnInternalCommentsTextBox("The comments");
        singleCasePage = casesFormPage.clickOnSaveButton();
        String actual = casesFormPage.getPopUpMessage();
        Instant timeStamp = Instant.now();
        Date expectedDate = DateUtils.truncate(Date.from(timeStamp), Calendar.MINUTE);
        String expectedStart = "Case";
        String expectedFinish = "was created.";
        Assert.assertTrue(actual.startsWith(expectedStart) && actual.contains(expectedFinish));
        String createdDate = singleCasePage.getCreatedDateLabel();
        Date actualDate = DateUtils.truncate(new SimpleDateFormat("d/M/yyyy HH:mm").parse(createdDate), Calendar.MINUTE);
        Assert.assertEquals(expectedDate, actualDate);
        popUpConfirmPage = singleCasePage.clickOnDelete();
        popUpConfirmPage.clickOnDelete();
    }

}
