/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

package salesforce.ui.pages;

import io.github.bonigarcia.wdm.config.DriverManagerType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.lang.reflect.InvocationTargetException;

public class LoginPage extends BasePage {
    @FindBy(id = "username")
    private WebElement usernameTextBox;

    @FindBy(id = "password")
    private WebElement passwordTextBox;

    @FindBy(id = "Login")
    private WebElement loginButton;

    /**
     * Creates the login page.
     *
     * @param driverManagerType the driver's type
     * @throws ClassNotFoundException when the class does not exist
     * @throws InvocationTargetException when the target can not be invoked
     * @throws NoSuchMethodException when the method is not found
     * @throws InstantiationException when it is not possible to create an instance
     * @throws IllegalAccessException when it can not be accessed
     */
    public LoginPage(final DriverManagerType driverManagerType) throws ClassNotFoundException,
            InvocationTargetException, NoSuchMethodException, InstantiationException,
            IllegalAccessException {
        super(driverManagerType);
    }

    /**
     * Waits for the page to load.
     */
    @Override
    protected void waitForPageToLoad() {
        getWait().until(ExpectedConditions.visibilityOf(loginButton));
    }

    /**
     * Sets the username text box value.
     *
     * @param newUsername a String with the value
     */
    private void setUsernameTextBox(final String newUsername) {
        usernameTextBox.sendKeys(newUsername);
    }

    /**
     * Sets the password text box value.
     *
     * @param newPassword a String with the value
     */
    private void setPasswordTextBox(final String newPassword) {
        passwordTextBox.sendKeys(newPassword);
    }

    /**
     * Clicks on the login button.
     */
    private void clickLoginButton() {
        loginButton.click();
    }

    /**
     * Creates an instance of home page on successful login.
     *
     * @param username a String with the username
     * @param password a String with the password
     * @return the Home Web page
     */
    public HomePage loginSuccessful(final String username, final String password) throws
            ClassNotFoundException, InvocationTargetException, NoSuchMethodException,
            InstantiationException, IllegalAccessException {
        setUsernameTextBox(username);
        setPasswordTextBox(password);
        clickLoginButton();
        return new HomePage(DriverManagerType.CHROME);
    }
}
