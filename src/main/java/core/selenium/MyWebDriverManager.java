/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

package core.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.DriverManagerType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.TimeUnit;

public final class MyWebDriverManager {
    private static MyWebDriverManager myWebDriverManager;
    private WebDriver driver;
    private WebDriverWait wait;
    private WebDriverConfig webDriverConfig = WebDriverConfig.getWebDriverConfig();
    private DriverManagerType driverManagerType =
            DriverManagerType.valueOf(webDriverConfig.getBrowser());

    /**
     * Creates the object myWebDriverManager.
     *
     * @throws ClassNotFoundException an enum with the driver type
     * @throws NoSuchMethodException when the method is not found
     * @throws InvocationTargetException when the target can not be invoked
     * @throws InstantiationException when it is not possible to create an instance
     * @throws IllegalAccessException when it can not be accessed
     */
    private MyWebDriverManager()
            throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException,
            InstantiationException, IllegalAccessException {
        initialize();
    }

    /**
     * Gets the web driver manager or creates one when needed.
     *
     * @return an instance of myWebDriverManager
     * @throws ClassNotFoundException an enum with the driver type
     * @throws NoSuchMethodException when the method is not found
     * @throws InvocationTargetException when the target can not be invoked
     * @throws InstantiationException when it is not possible to create an instance
     * @throws IllegalAccessException when it can not be accessed
     */
    public static MyWebDriverManager getWebDriverManager()
            throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException,
            InstantiationException, IllegalAccessException {
        if (myWebDriverManager == null) {
            myWebDriverManager = new MyWebDriverManager();
        }
        return myWebDriverManager;
    }

    /**
     * Creates the web driver and web driver wait instances.
     *
     * @throws ClassNotFoundException an enum with the driver type
     * @throws NoSuchMethodException when the method is not found
     * @throws InvocationTargetException when the target can not be invoked
     * @throws InstantiationException when it is not possible to create an instance
     * @throws IllegalAccessException when it can not be accessed
     */
    private void initialize() throws ClassNotFoundException, NoSuchMethodException,
            InvocationTargetException, InstantiationException, IllegalAccessException {
        WebDriverManager.getInstance(driverManagerType).setup();
        Class<?> driverClass =  Class.forName(driverManagerType.browserClass());
        driver = (WebDriver) driverClass.getDeclaredConstructor().newInstance();
        driver.manage().window().maximize();
        driver.manage().timeouts()
                .implicitlyWait(webDriverConfig.getImplicitWaitTime(), TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, webDriverConfig.getExplicitWaitTime());

    }

    /**
     * Gets the driver instance according to its type.
     *
     * @return the Web Driver
     */
    public WebDriver getDriver() {
        return driver;
    }

    /**
     * Gets the web driver wait instance according to its type.
     *
     * @return the web driver wait
     */
    public WebDriverWait getWebDriverWait() {
        return wait;
    }

    /**
     * Clears the MyWebDriverManager instance.
     */
    public void quitDriver() {
        driver.quit();
        myWebDriverManager = null;
    }
}
