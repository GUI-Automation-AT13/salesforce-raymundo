package salesforce.ui.pages;

import core.selenium.WebElementAction;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.lang.reflect.InvocationTargetException;

public class CasesPage extends BasePage {
    private WebElementAction webElementAction = new WebElementAction();
    @FindBy(css = "div[title=\"New\"]")
    private WebElement buttonNew;
    /**
     * Creates the Cases Page.
     *
     * @throws InvocationTargetException when the target can not be invoked
     * @throws NoSuchMethodException     when the method is not found
     * @throws InstantiationException    when it is not possible to create an instance
     * @throws IllegalAccessException    when it can not be accessed
     * @throws ClassNotFoundException    when the class does not exist
     */
    public CasesPage() throws InvocationTargetException, NoSuchMethodException,
            InstantiationException, IllegalAccessException, ClassNotFoundException {
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
     * @return the cases form site
     * @throws InvocationTargetException when the target can not be invoked
     * @throws NoSuchMethodException     when the method is not found
     * @throws InstantiationException    when it is not possible to create an instance
     * @throws IllegalAccessException    when it can not be accessed
     * @throws ClassNotFoundException    when the class does not exist
     */
    public CasesFormPage clickOnNew() throws ClassNotFoundException, InvocationTargetException,
            NoSuchMethodException, InstantiationException, IllegalAccessException {
        webElementAction.clickOnWebElement(buttonNew);
        return new CasesFormPage();
    }
}
