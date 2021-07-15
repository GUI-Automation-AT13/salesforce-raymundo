/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

package core.utils;

public enum AdverbsOfTime {
    TODAY(0),
    YESTERDAY(-1),
    TOMORROW(1);
    private final int dayDifference;

    AdverbsOfTime(final int enumDayDifference) {
        this.dayDifference = enumDayDifference;
    }

    /**
     * Gets the day difference for provided adverb of time.
     *
     * @return the date requested
     */
    public int getDayDifference() {
        return dayDifference;
    }
}
