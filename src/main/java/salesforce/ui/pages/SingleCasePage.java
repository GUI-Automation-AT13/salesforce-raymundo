package salesforce.ui.pages;

import core.selenium.WebElementAction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static salesforce.utils.AdaptStringToAttribute.changeFieldName;

public class SingleCasePage extends BasePage {
    private WebElementAction webElementAction = new WebElementAction();
    @FindBy(xpath = "//button[@name='Delete']")
    private WebElement deleteButton;
    private String popUpMessage = "//span[contains(@class,'toastMessage')]";
    private String createdDateLabel = "//span[text()='Created By']/../..//lightning-formatted-text";
    private String detailsFields = "//records-lwc-detail-panel//div[contains(@class,'slds-form-element__label')]";
    private String detailsValues = "//*[@data-output-element-id='output-field']";

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

    /**
     * Gets the pop up message.
     *
     * @return a String with the message
     */
    public String getCreatedDateLabel() {
        WebElement webElement = getDriver().findElement(By.xpath(createdDateLabel));
        getWait().until(ExpectedConditions.visibilityOf(webElement));
        return webElement.getText();
    }

    public Map<String, String> getDetailsFields() {
        List<WebElement> fieldsList = getDriver().findElements(By.xpath(detailsFields));
        List<WebElement> valuesList = getDriver().findElements(By.xpath(detailsValues));
        if (fieldsList.size() == valuesList.size()) {
            Map<String, String> map = new HashMap<>();
            for (int i = 0; i < fieldsList.size(); i++) {
                map.put(changeFieldName(fieldsList.get(i).getText()), valuesList.get(i).getText());
            }
            System.out.println(map);
            return map;
        }
        return null;
    }
}
