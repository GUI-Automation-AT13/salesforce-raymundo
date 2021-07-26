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

public class CasesPage extends BasePage {
    private WebElementAction webElementAction = new WebElementAction();
    @FindBy(css = "div[title=\"New\"]")
    private WebElement buttonNew;
    @FindBy(xpath = "//*[@title='%s']")
    private WebElement caseNumberCell;
    @FindBy(xpath = "//*[@title='%s']/../../..//*[contains(@class,'textUnderline')]")
    private WebElement subjectCell;
    @FindBy(xpath = "//*[@title='%s']/../../..//*[@class='slds-truncate']")
    private WebElement statusCell;
    @FindBy(xpath = "//*[@title='%s']/../../..//*[contains(@class,'uiOutputDateTime')]")
    private WebElement dateTimeOpenedCell;
    @FindBy(xpath = "//*[@title='%s']/../../..//*[contains(@class,'uiOutputText')]")
    private WebElement caseOwnerAlias;

    /**
     * Creates the Cases Page.
     */
    public CasesPage() {
        super();
    }

    /**
     * Waits for the new button to appear on Cases page.
     */
    @Override
    protected void waitForPageToLoad() {
        getWait().until(ExpectedConditions.visibilityOf(buttonNew));
    }

    /**
     * Clicks on the new button.
     *
     * @return the salesforce.cases form site
     */
    public CasesFormPage clickOnNew() {
        webElementAction.clickOnWebElement(buttonNew);
        return new CasesFormPage();
    }

    /**
     * Gets the text on the Case Number cell.
     *
     * @return a String with the case number
     */
    public String getCaseNumberCellText() {
        return webElementAction.getTextOnWebElement(caseNumberCell);
    }

    /**
     * Gets the text on the subject cell.
     *
     * @return a String with the subject
     */
    public String getSubjectCellText() {
        return webElementAction.getTextOnWebElement(subjectCell);
    }

    /**
     * Gets the text on the status cell.
     *
     * @return a String with the status
     */
    public String getStatusCellText() {
        return webElementAction.getTextOnWebElement(statusCell);
    }

    /**
     * Gets the text on Date/Time Opened cell.
     *
     * @return a String with the Date/Time Opened
     */
    public String getDateTimeOpenedCellText() {
        return webElementAction.getTextOnWebElement(dateTimeOpenedCell);
    }

    /**
     * Gets the text on the Case Owner Alias cell.
     *
     * @return a String with the case owner alias
     */
    public String getCaseOwnerAliasCellText() {
        return webElementAction.getTextOnWebElement(caseOwnerAlias);
    }
}
