/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

package salesforce.ui.pages;

import java.lang.reflect.InvocationTargetException;

public class HomePage extends BasePage {
    /**
     * Creates the Home page.
     *
     * @throws InvocationTargetException when the target can not be invoked
     * @throws NoSuchMethodException     when the method is not found
     * @throws InstantiationException    when it is not possible to create an instance
     * @throws IllegalAccessException    when it can not be accessed
     * @throws ClassNotFoundException    when the class does not exist
     */
    public HomePage() throws ClassNotFoundException, InvocationTargetException,
            NoSuchMethodException, InstantiationException, IllegalAccessException {
        super();
    }

    @Override
    protected void waitForPageToLoad() {

    }
}
