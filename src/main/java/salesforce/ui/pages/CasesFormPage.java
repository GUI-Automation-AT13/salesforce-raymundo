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

public class CasesFormPage extends BasePage {
    private WebElementAction webElementAction = new WebElementAction();
    @FindBy(xpath = "//button[@title='Save']")
    private WebElement saveButton;
    @FindBy(xpath = "//span[text()='Case Origin']/../..//a[@class='select']")
    private WebElement caseOriginMenu;
    @FindBy(xpath = "//span[text()='Priority']/../..//a[@class='select']")
    private WebElement priorityMenu;
    @FindBy(xpath = "//span[text()='Contact Name']/../..//input")
    private WebElement contactNameTextBox;

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
     * Selects a value con salesforce.accounts text box.
     *
     * @param value the value to set
     */
    public void selectValueOnAccounts(final String value) {
        webElementAction.selectOnAutoCompleteTextBox(contactNameTextBox, value);
    }
}
