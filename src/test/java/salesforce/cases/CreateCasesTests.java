package salesforce.cases;

import org.testng.annotations.Test;
import salesforce.base.BaseTest;
import salesforce.config.EnvironmentConfig;
import salesforce.ui.PageTransporter;
import salesforce.ui.pages.CasesFormPage;
import salesforce.ui.pages.CasesPage;
import salesforce.ui.pages.HomePage;
import salesforce.ui.pages.LoginPage;

public class CreateCasesTests extends BaseTest {
    private PageTransporter pageTransporter = new PageTransporter();
    private CasesPage casesPage;
    private HomePage homePage;
    private CasesFormPage casesFormPage;

    @Test
    public void testCreateCaseWithRequiredValues() {
        loginPage = new LoginPage();
        homePage = loginPage.loginSuccessful(EnvironmentConfig.getEnvironmentConfig().getUsername(),
                EnvironmentConfig.getEnvironmentConfig().getPassword());
        casesPage = pageTransporter.goToCases();
        casesFormPage = casesPage.clickOnNew();
        casesFormPage.selectValueOnCaseOriginMenu("Phone");
        casesFormPage.selectValueOnAccounts("bla bla");
    }
}
