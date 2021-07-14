package core;

import io.github.bonigarcia.wdm.config.DriverManagerType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.lang.reflect.InvocationTargetException;

import static core.MyWebDriverManager.getWebDriverManager;

public class WebElementAction {
    private WebDriver driver;
    private WebDriverWait wait;

    /**
     * Sets a value into a text box field.
     *
     * @param webElement the text box to set
     * @param value the value to set
     */
    public void setTextField(final WebElement webElement, final String value) throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        driver = getWebDriverManager(DriverManagerType.CHROME).getDriver();
        wait = getWebDriverManager(DriverManagerType.CHROME).getWebDriverWait();
        wait.until(ExpectedConditions.visibilityOf(webElement));
        webElement.clear();
        webElement.sendKeys(value);
    }
}
