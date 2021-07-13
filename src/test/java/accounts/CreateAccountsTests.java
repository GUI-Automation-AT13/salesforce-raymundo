package accounts;

import base.BaseTest;
import org.testng.annotations.Test;
import salesforce.ui.pages.HomePage;

import java.lang.reflect.InvocationTargetException;

import static core.utils.LoadEnvironmentFile.getDotenv;

public class CreateAccountsTests extends BaseTest {

    @Test
    public void testCreateAccountWithRequiredFields() throws ClassNotFoundException,
            InvocationTargetException, NoSuchMethodException, InstantiationException,
            IllegalAccessException {
        HomePage homePage = loginPage.loginSuccessful(getDotenv().get("SALESFORCE_USERNAME"),
                getDotenv().get("SALESFORCE_PASSWORD"));
    }
}
