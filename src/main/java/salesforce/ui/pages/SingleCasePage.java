package salesforce.ui.pages;

import core.selenium.WebElementAction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SingleCasePage extends BasePage {
    private WebElementAction webElementAction = new WebElementAction();
    @FindBy(xpath = "//button[@name='Delete']")
    private WebElement deleteButton;
    private String popUpMessage = "//span[contains(@class,'toastMessage')]";

    /**
     * Waits for the edit button to appear on single case page.
     */
    @Override
    protected void waitForPageToLoad() {
        getWait().until(ExpectedConditions.elementToBeClickable(deleteButton));
    }

    /**
     * Clicks on the delete button.
     *
     * @return a pop up to confirm deletion
     */
    public PopUpConfirmPage clickOnDelete() {
        webElementAction.clickOnWebElement(deleteButton);
        return new PopUpConfirmPage();
    }

    /**
     * Gets the pop up message.
     *
     * @return a String with the message
     */
    public String getPopUpMessage() {
        WebElement webElement = getDriver().findElement(By.xpath(popUpMessage));
        getWait().until(ExpectedConditions.visibilityOf(webElement));
        return webElement.getText();
    }
}
