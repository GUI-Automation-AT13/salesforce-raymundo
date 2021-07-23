package salesforce.cases;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import salesforce.base.BaseTest;
import salesforce.config.EnvironmentConfig;
import salesforce.features.Case;
import salesforce.ui.PageTransporter;
import salesforce.ui.pages.*;

import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class CreateCasesTests extends BaseTest {
    private PageTransporter pageTransporter = new PageTransporter();
    private CasesPage casesPage;
    private HomePage homePage;
    private CasesFormPage casesFormPage;
    private SingleCasePage singleCasePage;
    private PopUpConfirmPage popUpConfirmPage;
    private SoftAssert softAssert = new SoftAssert();

    @Test
    public void testCreateCaseWithRequiredValues() throws ParseException, InvocationTargetException, IllegalAccessException {
        homePage = loginPage.loginSuccessful(EnvironmentConfig.getEnvironmentConfig().getUsername(),
                EnvironmentConfig.getEnvironmentConfig().getPassword());
        casesPage = pageTransporter.goToCases();
        casesFormPage = casesPage.clickOnNew();
        casesFormPage.selectValueOnCaseOriginMenu("Phone");
        singleCasePage = casesFormPage.clickOnSaveButton();
        String actual = casesFormPage.getPopUpMessage();
        Date expectedDate = DateUtils.truncate(Date.from(Instant.now()), Calendar.MINUTE);
        String expectedRegex = "Case \"[0-9]{8}\" was created.";
        softAssert.assertTrue(actual.matches(expectedRegex), "\nactual: " + actual + "\nexpected regex: " + expectedRegex);
        Date actualDate = DateUtils.truncate(new SimpleDateFormat("d/M/yyyy HH:mm").parse(singleCasePage.getCreatedDateLabel()), Calendar.MINUTE);
        softAssert.assertEquals(expectedDate, actualDate);
        Case myCase = new Case();
        BeanUtils.populate(myCase, singleCasePage.getDetailsFields());
        softAssert.assertEquals(myCase.getCaseOrigin(), "Phone");
        popUpConfirmPage = singleCasePage.clickOnDelete();
        popUpConfirmPage.clickOnDelete();
    }

    @Test
    public void testCreateCaseWithAllValues() throws ParseException {
        loginPage = new LoginPage();
        homePage = loginPage.loginSuccessful(EnvironmentConfig.getEnvironmentConfig().getUsername(),
                EnvironmentConfig.getEnvironmentConfig().getPassword());
        casesPage = pageTransporter.goToCases();
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
