/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

package core.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static core.selenium.MyWebDriverManager.getWebDriverManager;

public class WebElementAction {
    private WebDriver driver;
    private WebDriverWait wait;

    /**
     * Creates web element action.
     */
    public WebElementAction() {
    }

    /**
     * Sets a value into a text box field.
     *
     * @param webElement the text box to set
     * @param value the value to set
     */
    public void setTextField(final WebElement webElement, final String value) {
        driver = getWebDriverManager().getDriver();
        wait = getWebDriverManager().getWebDriverWait();
        wait.until(ExpectedConditions.visibilityOf(webElement));
        webElement.clear();
        webElement.sendKeys(value);
    }

    /**
     * Clicks on web element.
     *
     * @param webElement the element to click on
     */
    public void clickOnWebElement(final WebElement webElement) {
        driver = getWebDriverManager().getDriver();
        wait = getWebDriverManager().getWebDriverWait();
        wait.until(ExpectedConditions.elementToBeClickable(webElement));
        webElement.click();
    }

    /**
     * Gets the web element with xpath and a value to replace in it.
     *
     * @param xpath the element's xpath
     * @param value the value to replace the xpath
     * @return a web element with the provided features
     */
    public WebElement getWebElementByXpathAndValue(final String xpath, final String value) {
        driver = getWebDriverManager().getDriver();
        wait = getWebDriverManager().getWebDriverWait();
        return driver.findElement(By.xpath(String.format(xpath, value)));
    }

    /**
     * Selects an option of a dropdown menu.
     *
     * @param webElement the dropdown menu
     * @param value the value to choose
     */
    public void selectOnDropdownMenu(final WebElement webElement, final String value) {
        driver = getWebDriverManager().getDriver();
        wait = getWebDriverManager().getWebDriverWait();
        wait.until(ExpectedConditions.visibilityOf(webElement));
        webElement.click();
        driver.findElement(By.linkText(value)).click();
    }

    /**
     * Selects a value on autocomplete text box.
     *
     * @param webElement the text box
     * @param value the value to choose
     * @param displayedElementPath the element to select
     */
    public void selectOnAutoCompleteTextBox(final WebElement webElement, final String value,
                                            final String displayedElementPath) {
        driver = getWebDriverManager().getDriver();
        wait = getWebDriverManager().getWebDriverWait();
        wait.until(ExpectedConditions.visibilityOf(webElement));
        webElement.click();
        webElement.sendKeys(value);
        clickOnWebElement(getWebElementByXpathAndValue(displayedElementPath, value));
    }
}
