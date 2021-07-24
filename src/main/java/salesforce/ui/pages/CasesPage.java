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
}
