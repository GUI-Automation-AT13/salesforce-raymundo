/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

package salesforce.ui.pages;

import core.selenium.WebElementAction;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import salesforce.ui.PopUpMessage;

public class CasesFormPage extends BasePage {
    private WebElementAction webElementAction = new WebElementAction();
    @FindBy(xpath = "//button[@title='Save']")
    private WebElement saveButton;
    @FindBy(xpath = "//label[text()='Status']/../..//input[@role='combobox']")
    private WebElement statusMenu;
    @FindBy(xpath = "//label[contains(@class,'inputLabel')]"
            + "/span[text()='Subject']/../../input")
    private WebElement subjectTextBox;
    private String comboBoxXpath = "//span[text()='%s']/../..//a[@class='select']";
    private String textBoxXpath = "//span[text()='%s']/../..//input";
    private String textAreaXpath = "//label[contains(@class,'inputLabel')]"
            + "/span[text()='%s']/../../textarea";
    private String displayedNameOnTextBoxPath = "//div[@title='%s']/../..";
    private String popUpMessage;

    /**
     * Creates the Cases form Page.
     */
    public CasesFormPage() {
        super();
    }

    /**
     * Waits for the save button to be available.
     */
    @Override
    protected void waitForPageToLoad() {
        getWait().until(ExpectedConditions.visibilityOf(saveButton));
    }

    /**
     * Selects a value on case origin menu.
     *
     * @param value the value to choose
     */
    public void selectValueOnCaseOriginMenu(final String value) {
        webElementAction.selectOnDropdownMenu(webElementAction
                .getWebElementByXpathAndValue(comboBoxXpath, "Case Origin"), value);
    }

    /**
     * Selects a value on priority menu.
     *
     * @param value the value to choose
     */
    public void selectValueOnPriorityMenu(final String value) {
        webElementAction.selectOnDropdownMenu(webElementAction
                .getWebElementByXpathAndValue(comboBoxXpath, "Priority"), value);
    }

    /**
     * Selects a value con salesforce contacts text box.
     *
     * @param value the value to set
     */
    public void selectValueOnContacts(final String value) {
        webElementAction.selectOnAutoCompleteTextBox(webElementAction
                        .getWebElementByXpathAndValue(textBoxXpath, "Contact Name"),
                value, displayedNameOnTextBoxPath);
    }

    /**
     * Selects a value con salesforce accounts text box.
     *
     * @param value the value to set
     */
    public void selectValueOnAccounts(final String value) {
        webElementAction.selectOnAutoCompleteTextBox(webElementAction
                        .getWebElementByXpathAndValue(textBoxXpath, "Account Name"),
                value, displayedNameOnTextBoxPath);
    }

    /**
     * Selects a value on type menu.
     *
     * @param value the value to choose
     */
    public void selectValueOnTypeMenu(final String value) {
        webElementAction.selectOnDropdownMenu(webElementAction
                .getWebElementByXpathAndValue(comboBoxXpath, "Type"), value);
    }

    /**
     * Selects a value on case reason menu.
     *
     * @param value the value to choose
     */
    public void selectValueOnCaseReasonMenu(final String value) {
        webElementAction.selectOnDropdownMenu(webElementAction
                .getWebElementByXpathAndValue(comboBoxXpath, "Case Reason"), value);
    }

    /**
     * Selects a value on status menu.
     *
     * @param value the value to choose
     */
    public void selectValueOnStatusMenu(final String value) {
        webElementAction.selectOnDropdownMenu(statusMenu, value);
    }

    /**
     * Clicks on the form's save button.
     *
     * @return the created case page
     */
    public SingleCasePage clickOnSaveButton() {
        PopUpMessage message = new PopUpMessage();
        webElementAction.clickOnWebElement(saveButton);
        setPopUpMessage(message.getPopUpMessage());
        return new SingleCasePage();
    }

    /**
     * Introduces text to web email text box.
     *
     * @param text a String to input
     */
    public void inputTextOnWebEmailTextBox(final String text) {
        webElementAction.setTextField(webElementAction
                .getWebElementByXpathAndValue(textBoxXpath, "Web Email"), text);
    }

    /**
     * Introduces text to web company text box.
     *
     * @param text a String to input
     */
    public void inputTextOnWebCompanyTextBox(final String text) {
        webElementAction.setTextField(webElementAction
                .getWebElementByXpathAndValue(textBoxXpath, "Web Company"), text);
    }

    /**
     * Introduces text to web name text box.
     *
     * @param text a String to input
     */
    public void inputTextOnWebNameTextBox(final String text) {
        webElementAction.setTextField(webElementAction
                .getWebElementByXpathAndValue(textBoxXpath, "Web Name"), text);
    }

    /**
     * Introduces text to web phone text box.
     *
     * @param text a String to input
     */
    public void inputTextOnWebPhoneTextBox(final String text) {
        webElementAction.setTextField(webElementAction
                .getWebElementByXpathAndValue(textBoxXpath, "Web Phone"), text);
    }

    /**
     * Selects a value on product menu.
     *
     * @param value the value to choose
     */
    public void selectValueOnProductMenu(final String value) {
        webElementAction.selectOnDropdownMenu(webElementAction
                .getWebElementByXpathAndValue(comboBoxXpath, "Product"), value);
    }

    /**
     * Selects a value on Potential Liability menu.
     *
     * @param value the value to choose
     */
    public void selectValueOnPotentialLiabilityMenu(final String value) {
        webElementAction.selectOnDropdownMenu(webElementAction
                .getWebElementByXpathAndValue(comboBoxXpath, "Potential Liability"), value);
    }

    /**
     * Selects a value on SLA Violation menu.
     *
     * @param value the value to choose
     */
    public void selectValueOnSlaViolationMenu(final String value) {
        webElementAction.selectOnDropdownMenu(webElementAction
                .getWebElementByXpathAndValue(comboBoxXpath, "SLA Violation"), value);
    }

    /**
     * Introduces text to Engineering Req Number text box.
     *
     * @param text a String to input
     */
    public void inputTextOnEngineeringReqNumberTextBox(final String text) {
        webElementAction.setTextField(webElementAction
                .getWebElementByXpathAndValue(textBoxXpath, "Engineering Req Number"), text);
    }

    /**
     * Introduces text to subject text box.
     *
     * @param text a String to input
     */
    public void inputTextOnSubjectTextBox(final String text) {
        webElementAction.setTextField(subjectTextBox, text);
    }

    /**
     * Introduces text to description text box.
     *
     * @param text a String to input
     */
    public void inputTextOnDescriptionTextBox(final String text) {
        webElementAction.setTextField(webElementAction
                .getWebElementByXpathAndValue(textAreaXpath, "Description"), text);
    }

    /**
     * Introduces text to internal comments text box.
     *
     * @param text a String to input
     */
    public void inputTextOnInternalCommentsTextBox(final String text) {
        webElementAction.setTextField(webElementAction
                .getWebElementByXpathAndValue(textAreaXpath, "Internal Comments"), text);
    }

    /**
     * Gets the pop up message.
     *
     * @return a String with the message
     */
    public String getPopUpMessage() {
        return popUpMessage;
    }

    /**
     * Sets the pop up message.
     *
     * @param inputPopUpMessage a String with the value to set
     */
    public void setPopUpMessage(final String inputPopUpMessage) {
        this.popUpMessage = inputPopUpMessage;
    }
}
