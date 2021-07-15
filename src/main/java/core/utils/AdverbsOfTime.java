/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

package core.utils;

import java.util.Date;

public enum AdverbsOfTime {
    TODAY(new Date()),
    YESTERDAY(new Date(System.currentTimeMillis() - 24 * 60 * 60 * 1000)),
    TOMORROW(new Date(System.currentTimeMillis() + 24 * 60 * 60 * 1000));
    private final Date date;

    AdverbsOfTime(final Date enumDate) {
        this.date = enumDate;
    }

    /**
     * Gets the date for provided adverb of time.
     *
     * @return the date requested
     */
    public Date getDate() {
        return date;
    }
}
