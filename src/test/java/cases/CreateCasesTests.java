package cases;

import base.BaseTest;
import org.testng.annotations.Test;
import salesforce.config.EnvironmentConfig;
import salesforce.ui.PageTransporter;
import salesforce.ui.pages.CasesFormPage;
import salesforce.ui.pages.CasesPage;
import salesforce.ui.pages.HomePage;
import salesforce.ui.pages.LoginPage;

import java.lang.reflect.InvocationTargetException;

public class CreateCasesTests extends BaseTest {
    private PageTransporter pageTransporter = new PageTransporter();
    private CasesPage casesPage;
    private HomePage homePage;
    private CasesFormPage casesFormPage;

    @Test
    public void testCreateCaseWithRequiredValues() throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        loginPage = new LoginPage();
        homePage = loginPage.loginSuccessful(EnvironmentConfig.getEnvironmentConfig().getUsername(),
                EnvironmentConfig.getEnvironmentConfig().getPassword());
        casesPage = pageTransporter.goToCases();
        casesFormPage = casesPage.clickOnNew();
        casesFormPage.selectValueOnCaseOriginMenu("Phone");
        casesFormPage.selectValueOnAccounts("bla bla");
    }
}
