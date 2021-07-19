package salesforce.ui.pages;

import core.selenium.WebElementAction;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class PopUpConfirmPage extends BasePage {
    private WebElementAction webElementAction = new WebElementAction();
    @FindBy(css = "[title='Cancel']")
    private WebElement cancelButton;
    @FindBy(xpath = "//span[text()='Delete']")
    private WebElement deleteButton;

    /**
     * Waits for the delete button to appear.
     */
    @Override
    protected void waitForPageToLoad() {
        getWait().until(ExpectedConditions.visibilityOf(deleteButton));
    }

    /**
     * Clicks on the delete button.
     *
     * @return the all cases web site
     */
    public CasesPage clickOnDelete() {
        webElementAction.clickOnWebElement(deleteButton);
        return new CasesPage();
    }
}
