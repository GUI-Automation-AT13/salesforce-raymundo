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
    @FindBy(xpath = "//span[text()='Case Origin']/../..//a[@class='select']")
    private WebElement caseOriginMenu;
    @FindBy(xpath = "//span[text()='Priority']/../..//a[@class='select']")
    private WebElement priorityMenu;
    @FindBy(xpath = "//span[text()='Type']/../..//a[@class='select']")
    private WebElement typeMenu;
    @FindBy(xpath = "//span[text()='Case Reason']/../..//a[@class='select']")
    private WebElement caseReasonMenu;
    @FindBy(xpath = "//span[text()='Product']/../..//a[@class='select']")
    private WebElement productMenu;
    @FindBy(xpath = "//span[text()='Potential Liability']/../..//a[@class='select']")
    private WebElement potentialLiabilityMenu;
    @FindBy(xpath = "//span[text()='SLA Violation']/../..//a[@class='select']")
    private WebElement slaViolationMenu;
    @FindBy(xpath = "//label[text()='Status']/../..//input[@role='combobox']")
    private WebElement statusMenu;
    @FindBy(xpath = "//span[text()='Contact Name']/../..//input")
    private WebElement contactNameTextBox;
    @FindBy(xpath = "//span[text()='Account Name']/../..//input")
    private WebElement accountNameTextBox;
    @FindBy(xpath = "//span[text()='Web Email']/../..//input")
    private WebElement webEmailTextBox;
    @FindBy(xpath = "//span[text()='Web Name']/../..//input")
    private WebElement webNameTextBox;
    @FindBy(xpath = "//span[text()='Web Company']/../..//input")
    private WebElement webCompanyTextBox;
    @FindBy(xpath = "//span[text()='Web Phone']/../..//input")
    private WebElement webPhoneTextBox;
    @FindBy(xpath = "//span[text()='Engineering Req Number']/../..//input")
    private WebElement engineeringReqNumberTextBox;
    @FindBy(xpath = "//label[contains(@class,'inputLabel')]"
            + "/span[text()='Subject']/../../input")
    private WebElement subjectTextBox;
    @FindBy(xpath = "//label[contains(@class,'inputLabel')]"
            + "/span[text()='Description']/../../textarea")
    private WebElement descriptionTextBox;
    @FindBy(xpath = "//label[contains(@class,'inputLabel')]"
            + "/span[text()='Internal Comments']/../../textarea")
    private WebElement internalCommentsTextBox;
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
        webElementAction.selectOnDropdownMenu(caseOriginMenu, value);
    }

    /**
     * Selects a value on priority menu.
     *
     * @param value the value to choose
     */
    public void selectValueOnPriorityMenu(final String value) {
        webElementAction.selectOnDropdownMenu(priorityMenu, value);
    }

    /**
     * Selects a value con salesforce contacts text box.
     *
     * @param value the value to set
     */
    public void selectValueOnContacts(final String value) {
        webElementAction.selectOnAutoCompleteTextBox(contactNameTextBox,
                value, displayedNameOnTextBoxPath);
    }

    /**
     * Selects a value con salesforce accounts text box.
     *
     * @param value the value to set
     */
    public void selectValueOnAccounts(final String value) {
        webElementAction.selectOnAutoCompleteTextBox(accountNameTextBox,
                value, displayedNameOnTextBoxPath);
    }

    /**
     * Selects a value on type menu.
     *
     * @param value the value to choose
     */
    public void selectValueOnTypeMenu(final String value) {
        webElementAction.selectOnDropdownMenu(typeMenu, value);
    }

    /**
     * Selects a value on case reason menu.
     *
     * @param value the value to choose
     */
    public void selectValueOnCaseReasonMenu(final String value) {
        webElementAction.selectOnDropdownMenu(caseReasonMenu, value);
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
        webElementAction.setTextField(webEmailTextBox, text);
    }

    /**
     * Introduces text to web company text box.
     *
     * @param text a String to input
     */
    public void inputTextOnWebCompanyTextBox(final String text) {
        webElementAction.setTextField(webCompanyTextBox, text);
    }

    /**
     * Introduces text to web name text box.
     *
     * @param text a String to input
     */
    public void inputTextOnWebNameTextBox(final String text) {
        webElementAction.setTextField(webNameTextBox, text);
    }

    /**
     * Introduces text to web phone text box.
     *
     * @param text a String to input
     */
    public void inputTextOnWebPhoneTextBox(final String text) {
        webElementAction.setTextField(webPhoneTextBox, text);
    }

    /**
     * Selects a value on product menu.
     *
     * @param value the value to choose
     */
    public void selectValueOnProductMenu(final String value) {
        webElementAction.selectOnDropdownMenu(productMenu, value);
    }

    /**
     * Selects a value on Potential Liability menu.
     *
     * @param value the value to choose
     */
    public void selectValueOnPotentialLiabilityMenu(final String value) {
        webElementAction.selectOnDropdownMenu(potentialLiabilityMenu, value);
    }

    /**
     * Selects a value on SLA Violation menu.
     *
     * @param value the value to choose
     */
    public void selectValueOnSlaViolationMenu(final String value) {
        webElementAction.selectOnDropdownMenu(slaViolationMenu, value);
    }

    /**
     * Introduces text to Engineering Req Number text box.
     *
     * @param text a String to input
     */
    public void inputTextOnEngineeringReqNumberTextBox(final String text) {
        webElementAction.setTextField(engineeringReqNumberTextBox, text);
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
        webElementAction.setTextField(descriptionTextBox, text);
    }

    /**
     * Introduces text to internal comments text box.
     *
     * @param text a String to input
     */
    public void inputTextOnInternalCommentsTextBox(final String text) {
        webElementAction.setTextField(internalCommentsTextBox, text);
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
