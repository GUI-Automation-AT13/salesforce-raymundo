/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

package salesforce.ui;

import core.selenium.MyWebDriverManager;
import salesforce.config.EnvironmentConfig;
import salesforce.ui.pages.CasesPage;

import java.lang.reflect.InvocationTargetException;

public class PageTransporter {
    private String baseUrl = EnvironmentConfig.getEnvironmentConfig().getBaseUrl();

    /**
     * Creates page transporter.
     */
    public PageTransporter() {
    }

    /**
     * Navigates to the provided url.
     *
     * @param url a String with the url
     * @throws ClassNotFoundException an enum with the driver type
     * @throws NoSuchMethodException when the method is not found
     * @throws InvocationTargetException when the target can not be invoked
     * @throws InstantiationException when it is not possible to create an instance
     * @throws IllegalAccessException when it can not be accessed
     */
    public void goToUrl(final String url) throws ClassNotFoundException,
            InvocationTargetException, NoSuchMethodException, InstantiationException,
            IllegalAccessException {
        MyWebDriverManager.getWebDriverManager().getDriver().navigate().to(url);
    }

    /**
     * Navigates to the cases web page.
     *
     * @return the cases web Page
     * @throws ClassNotFoundException an enum with the driver type
     * @throws NoSuchMethodException when the method is not found
     * @throws InvocationTargetException when the target can not be invoked
     * @throws InstantiationException when it is not possible to create an instance
     * @throws IllegalAccessException when it can not be accessed
     */
    public CasesPage goToCases() throws ClassNotFoundException, InvocationTargetException,
            NoSuchMethodException, InstantiationException, IllegalAccessException {
        goToUrl(baseUrl.concat("lightning/o/Case/list"));
        return new CasesPage();
    }
}
