/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

package base;

import io.github.bonigarcia.wdm.config.DriverManagerType;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import salesforce.ui.pages.LoginPage;
import java.lang.reflect.InvocationTargetException;

import static core.MyWebDriverManager.getWebDriverManager;

public class BaseTest {
    private WebDriver driver;
    protected LoginPage loginPage;

    @BeforeClass
    public void setUp() throws ClassNotFoundException, InvocationTargetException,
            NoSuchMethodException, InstantiationException, IllegalAccessException {
        driver = getWebDriverManager(DriverManagerType.CHROME).getDriver();
        driver.get("https://login.salesforce.com/");
        loginPage = new LoginPage(DriverManagerType.CHROME);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
