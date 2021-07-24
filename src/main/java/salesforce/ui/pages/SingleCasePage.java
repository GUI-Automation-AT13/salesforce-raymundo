package salesforce.ui.pages;

import core.selenium.WebElementAction;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SingleCasePage extends BasePage {
    private WebElementAction webElementAction = new WebElementAction();
    @FindBy(css = "[name='Delete']")
    private WebElement buttonDelete;

    /**
     * Waits for the delete button to appear on single case page.
     */
    @Override
    protected void waitForPageToLoad() {
        getWait().until(ExpectedConditions.visibilityOf(buttonDelete));
    }

    /**
     * Clicks on the delete button.
     *
     * @return a pop up to confirm deletion
     */
    public PopUpConfirmPage clickOnDelete() {
        webElementAction.clickOnWebElement(buttonDelete);
        return new PopUpConfirmPage();
    }
}
