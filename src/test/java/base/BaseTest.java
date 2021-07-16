/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import salesforce.config.EnvironmentConfig;
import salesforce.ui.pages.LoginPage;

import java.lang.reflect.InvocationTargetException;

import static core.selenium.MyWebDriverManager.getWebDriverManager;

public class BaseTest {
    private WebDriver driver;
    protected LoginPage loginPage;

    @BeforeClass
    public void setUp() throws ClassNotFoundException, InvocationTargetException,
            NoSuchMethodException, InstantiationException, IllegalAccessException {
        driver = getWebDriverManager().getDriver();
        driver.get(EnvironmentConfig.getEnvironmentConfig().getLogin());
        loginPage = new LoginPage();
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
