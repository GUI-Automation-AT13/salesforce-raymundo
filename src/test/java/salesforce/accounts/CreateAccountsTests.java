/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

package salesforce.accounts;

import org.testng.annotations.Test;
import salesforce.ui.pages.HomePage;
import salesforce.base.BaseTest;

import static core.utils.LoadEnvironmentFile.getTheSalesforcePassword;
import static core.utils.LoadEnvironmentFile.getTheSalesforceUsername;

public class CreateAccountsTests extends BaseTest {
    @Test
    public void testCreateAccountWithRequiredFields() {
        HomePage homePage = loginPage.loginSuccessful(getTheSalesforceUsername(),
                getTheSalesforcePassword());
    }
}
