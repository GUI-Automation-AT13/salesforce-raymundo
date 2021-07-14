/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

package salesforce.ui.pages;

import core.WebElementAction;
import io.github.bonigarcia.wdm.config.DriverManagerType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.lang.reflect.InvocationTargetException;

import static core.MyWebDriverManager.getWebDriverManager;

public abstract class BasePage {
    private WebDriver driver;
    private WebDriverWait wait;
    private WebElementAction webElementAction;

    /**
     * Creates the Base Page.
     *
     * @param driverManagerType the driver's type
     * @throws InvocationTargetException when the target can not be invoked
     * @throws NoSuchMethodException when the method is not found
     * @throws InstantiationException when it is not possible to create an instance
     * @throws IllegalAccessException when it can not be accessed
     * @throws ClassNotFoundException when the class does not exist
     */
    public BasePage(final DriverManagerType driverManagerType) throws InvocationTargetException,
            NoSuchMethodException, InstantiationException, IllegalAccessException,
            ClassNotFoundException {
        driver = getWebDriverManager(driverManagerType).getDriver();
        wait = getWebDriverManager(driverManagerType).getWebDriverWait();
        webElementAction = new WebElementAction();
        PageFactory.initElements(driver, this);
        waitForPageToLoad();
    }

    protected abstract void waitForPageToLoad();

    /**
     * Gets the web driver.
     *
     * @return the web driver
     */
    public WebDriver getDriver() {
        return driver;
    }

    /**
     * Sets the web driver.
     *
     * @param newDriver to set
     */
    public void setDriver(final WebDriver newDriver) {
        this.driver = newDriver;
    }

    /**
     * Gets the wait web driver.
     *
     * @return the wait web driver
     */
    public WebDriverWait getWait() {
        return wait;
    }

    /**
     * Sets the wait web driver.
     *
     * @param newWait to set
     */
    public void setWait(final WebDriverWait newWait) {
        this.wait = newWait;
    }

    /**
     * Gets the web element action.
     *
     * @return the web element action
     */
    public WebElementAction getWebElementAction() {
        return webElementAction;
    }

    /**
     * Sets the web element action.
     *
     * @param newWebElementAction the value to set
     */
    public void setWebElementAction(final WebElementAction newWebElementAction) {
        this.webElementAction = newWebElementAction;
    }
}
