/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

package core;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.DriverManagerType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.lang.reflect.InvocationTargetException;

import static core.utils.LoadEnvironmentFile.getDotenv;

public class MyWebDriverManager {
    private final DriverManagerType driverManagerType;
    private static MyWebDriverManager myWebDriverManager;
    private static WebDriver driver;
    private static WebDriverWait wait;

    /**
     * Creates the object myWebDriverManager.
     *
     * @param newDriverManagerType an enum with the web driver's type
     * @throws ClassNotFoundException an enum with the driver type
     * @throws NoSuchMethodException when the method is not found
     * @throws InvocationTargetException when the target can not be invoked
     * @throws InstantiationException when it is not possible to create an instance
     * @throws IllegalAccessException when it can not be accessed
     */
    public MyWebDriverManager(final DriverManagerType newDriverManagerType)
            throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException,
            InstantiationException, IllegalAccessException {
        this.driverManagerType = newDriverManagerType;
        initialize();
    }

    /**
     * Gets the web driver manager or creates one when needed.
     *
     * @param driverManagerType the driver's type
     * @return an instance of myWebDriverManager
     * @throws ClassNotFoundException an enum with the driver type
     * @throws NoSuchMethodException when the method is not found
     * @throws InvocationTargetException when the target can not be invoked
     * @throws InstantiationException when it is not possible to create an instance
     * @throws IllegalAccessException when it can not be accessed
     */
    public static MyWebDriverManager getWebDriverManager(final DriverManagerType
                                                                 driverManagerType)
            throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException,
            InstantiationException, IllegalAccessException {
        if (myWebDriverManager == null) {
            myWebDriverManager = new MyWebDriverManager(driverManagerType);
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
    public void initialize() throws ClassNotFoundException, NoSuchMethodException,
            InvocationTargetException, InstantiationException, IllegalAccessException {
        WebDriverManager.getInstance(driverManagerType).setup();
        Class<?> driverClass =  Class.forName(driverManagerType.browserClass());
        driver = (WebDriver) driverClass.getDeclaredConstructor().newInstance();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Long.parseLong(getDotenv().get("EXPLICIT_WAIT_TIME")));
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
    public static void quitMyWebDriverManager() {
        myWebDriverManager = null;
    }
}
