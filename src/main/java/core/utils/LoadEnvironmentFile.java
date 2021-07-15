/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

package core.utils;

import io.github.cdimascio.dotenv.Dotenv;

public final class LoadEnvironmentFile {
    private LoadEnvironmentFile() {
    }

    private static final Dotenv DOTENV = Dotenv.configure().load();

    /**
     * Gets the Dotenv.
     *
     * @return the Dotenv
     */
    public static Dotenv getDotenv() {
        return DOTENV;
    }

    /**
     * Gets the browser from environment file.
     *
     * @return a String with the browser
     */
    public static String getBrowser() {
        return getDotenv().get("BROWSER");
    }
}
