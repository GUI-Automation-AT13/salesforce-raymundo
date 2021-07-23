package salesforce.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static core.selenium.MyWebDriverManager.getWebDriverManager;

public class PopUpMessage {
    private String messageXpath = "//span[contains(@class,'toastMessage')]";

    /**
     * Gets the pop up message.
     *
     * @return a String with the message
     */
    public String getPopUpMessage() {
        WebElement webElement = getWebDriverManager().getDriver()
                .findElement(By.xpath(messageXpath));
        getWebDriverManager().getWebDriverWait()
                .until(ExpectedConditions.visibilityOf(webElement));
        return webElement.getText();
    }
}
