package salesforce.ui.pages;

import core.selenium.WebElementAction;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.lang.reflect.InvocationTargetException;

public class CasesFormPage extends BasePage {
    private WebElementAction webElementAction = new WebElementAction();
    @FindBy(xpath = "//button[@title='Save']")
    private WebElement saveButton;
    @FindBy(xpath = "//span[text()='Case Origin']/../..//a[@class='select']")
    private WebElement caseOriginMenu;
    @FindBy(xpath = "//span[text()='Priority']/../..//a[@class='select']")
    private WebElement priorityMenu;
    @FindBy(xpath = "//span[text()='Contact Name']/../..//input")
    private WebElement contactNameTextBox;

    /**
     * Creates the Cases form Page.
     *
     * @throws InvocationTargetException when the target can not be invoked
     * @throws NoSuchMethodException     when the method is not found
     * @throws InstantiationException    when it is not possible to create an instance
     * @throws IllegalAccessException    when it can not be accessed
     * @throws ClassNotFoundException    when the class does not exist
     */
    public CasesFormPage() throws InvocationTargetException, NoSuchMethodException,
            InstantiationException, IllegalAccessException, ClassNotFoundException {
        super();
    }

    /**
     * Waits for the save button to be available.
     */
    @Override
    protected void waitForPageToLoad() {
        getWait().until(ExpectedConditions.visibilityOf(saveButton));
    }

    /**
     * Selects a value on case origin menu.
     *
     * @param value the value to choose
     * @throws InvocationTargetException when the target can not be invoked
     * @throws NoSuchMethodException     when the method is not found
     * @throws InstantiationException    when it is not possible to create an instance
     * @throws IllegalAccessException    when it can not be accessed
     * @throws ClassNotFoundException    when the class does not exist
     */
    public void selectValueOnCaseOriginMenu(final String value) throws ClassNotFoundException,
            InvocationTargetException, NoSuchMethodException, InstantiationException,
            IllegalAccessException {
        webElementAction.selectOnDropdownMenu(caseOriginMenu, value);
    }

    /**
     * Selects a value on priority menu.
     *
     * @param value the value to choose
     * @throws InvocationTargetException when the target can not be invoked
     * @throws NoSuchMethodException     when the method is not found
     * @throws InstantiationException    when it is not possible to create an instance
     * @throws IllegalAccessException    when it can not be accessed
     * @throws ClassNotFoundException    when the class does not exist
     */
    public void selectValueOnPriorityMenu(final String value) throws ClassNotFoundException,
            InvocationTargetException, NoSuchMethodException, InstantiationException,
            IllegalAccessException {
        webElementAction.selectOnDropdownMenu(priorityMenu, value);
    }

    public void selectValueOnAccounts(final String value) throws ClassNotFoundException,
            InvocationTargetException, NoSuchMethodException, InstantiationException,
            IllegalAccessException {
        webElementAction.selectOnAutoCompleteTextBox(contactNameTextBox, value);
    }
}
