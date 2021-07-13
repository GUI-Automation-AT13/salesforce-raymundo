package salesforce.ui.pages;

import io.github.bonigarcia.wdm.config.DriverManagerType;

import java.lang.reflect.InvocationTargetException;

public class HomePage extends BasePage {
    /**
     * Creates the Base Page.
     *
     * @param driverManagerType the driver's type
     * @throws InvocationTargetException when the target can not be invoked
     * @throws NoSuchMethodException     when the method is not found
     * @throws InstantiationException    when it is not possible to create an instance
     * @throws IllegalAccessException    when it can not be accessed
     * @throws ClassNotFoundException    when the class does not exist
     */
    public HomePage(final DriverManagerType driverManagerType) throws InvocationTargetException,
            NoSuchMethodException, InstantiationException, IllegalAccessException,
            ClassNotFoundException {
        super(driverManagerType);
    }

    @Override
    protected void waitForPageToLoad() {

    }
}
