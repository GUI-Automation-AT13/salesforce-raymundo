/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

package salesforce.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CasesPage extends BasePage {
    @FindBy(css = "div[title=\"New\"]")
    private WebElement buttonNew;
    private String caseNumberCellXpath = "//*[@title='%s']";
    private String subjectCellXpath = "//*[@title='%s']/../../.."
            + "//div[contains(@class,'outputLookupContainer')]";
    private String statusCellXpath = "//*[@title='%s']/../../..//*[@class='slds-truncate']";
    private String dateTimeOpenedCellXpath = "//*[@title='%s']/../../.."
            + "//*[contains(@class,'uiOutputDateTime')]";
    private String caseOwnerAliasXpath = "//*[@title='%s']/../../.."
            + "//*[contains(@class,'uiOutputText')]";

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
        getWebElementAction().clickOnWebElement(buttonNew);
        return new CasesFormPage();
    }

    /**
     * Gets the text on the Case Number cell.
     *
     * @param caseNumber a String with the value
     * @return a String with the case number
     */
    public String getCaseNumberCellText(final String caseNumber) {
        return getWebElementAction().getTextOnWebElement(getWebElementAction()
                .getWebElementByXpathAndValue(caseNumberCellXpath, caseNumber));
    }

    /**
     * Gets the text on the subject cell.
     *
     * @param caseNumber a String with the value
     * @return a String with the subject
     */
    public String getSubjectCellText(final String caseNumber) {
        return getWebElementAction().getTextOnWebElement(getWebElementAction()
                .getWebElementByXpathAndValue(subjectCellXpath, caseNumber));
    }

    /**
     * Gets the text on the status cell.
     *
     * @param caseNumber a String with the value
     * @return a String with the status
     */
    public String getStatusCellText(final String caseNumber) {
        return getWebElementAction().getTextOnWebElement(getWebElementAction()
                .getWebElementByXpathAndValue(statusCellXpath, caseNumber));
    }

    /**
     * Gets the text on Date/Time Opened cell.
     *
     * @param caseNumber a String with the value
     * @return a String with the Date/Time Opened
     */
    public String getDateTimeOpenedCellText(final String caseNumber) {
        return getWebElementAction().getTextOnWebElement(getWebElementAction()
                .getWebElementByXpathAndValue(dateTimeOpenedCellXpath, caseNumber));
    }

    /**
     * Gets the text on the Case Owner Alias cell.
     *
     * @param caseNumber a String with the value
     * @return a String with the case owner alias
     */
    public String getCaseOwnerAliasCellText(final String caseNumber) {
        return getWebElementAction().getTextOnWebElement(getWebElementAction()
                .getWebElementByXpathAndValue(caseOwnerAliasXpath, caseNumber));
    }

    public String getCaseId(final String caseNumber) {
        return getWebElementAction().getAttributeFromWebElement(getWebElementAction()
                .getWebElementByXpathAndValue(caseNumberCellXpath, caseNumber),
                "data-recordid");
    }
}
