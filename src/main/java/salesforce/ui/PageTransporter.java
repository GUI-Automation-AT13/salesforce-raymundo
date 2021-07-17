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
     */
    public void goToUrl(final String url) {
        MyWebDriverManager.getWebDriverManager().getDriver().navigate().to(url);
    }

    /**
     * Navigates to the salesforce.cases web page.
     *
     * @return the salesforce.cases web Page
     */
    public CasesPage goToCases() {
        goToUrl(baseUrl.concat("lightning/o/Case/list"));
        return new CasesPage();
    }
}
