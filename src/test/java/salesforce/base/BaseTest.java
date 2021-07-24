/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

package salesforce.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import salesforce.config.EnvironmentConfig;
import salesforce.ui.pages.LoginPage;

import static core.selenium.MyWebDriverManager.getWebDriverManager;

public class BaseTest {
    private WebDriver driver;
    protected LoginPage loginPage;

    @BeforeTest
    public void setUp() {
        driver = getWebDriverManager().getDriver();
        driver.get(EnvironmentConfig.getEnvironmentConfig().getLogin());
        loginPage = new LoginPage();
    }

    @AfterTest
    public void tearDown() {
        getWebDriverManager().quitDriver();
    }
}
