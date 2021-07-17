/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

package salesforce.accounts;

import org.testng.annotations.Test;
import salesforce.base.BaseTest;
import salesforce.ui.pages.HomePage;

import static core.utils.LoadEnvironmentFile.getDotenv;

public class CreateAccountsTests extends BaseTest {

    @Test
    public void testCreateAccountWithRequiredFields() {
        HomePage homePage = loginPage.loginSuccessful(getDotenv().get("SALESFORCE_USERNAME"),
                getDotenv().get("SALESFORCE_PASSWORD"));
    }
}
