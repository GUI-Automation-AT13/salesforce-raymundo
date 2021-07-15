/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

package core.utils;

public enum TimeUnits {
    YEAR("year", 31536000000L),
    MONTH("month", 2592000000L),
    WEEK("week", 604800000L),
    DAY("day", 86400000L),
    HOUR("hour", 3600000L),
    MINUTE("minute", 60000L),
    SECOND("second", 1000L);
    private final String name;
    private final Long milliseconds;

    TimeUnits(final String enumName, final Long enumMilliseconds) {
        this.name = enumName;
        this.milliseconds = enumMilliseconds;
    }

    /**
     * Gets the time unit name.
     *
     * @return a String with the name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the milliseconds equivalent to time unit.
     *
     * @return a Long with the value
     */
    public Long getMilliseconds() {
        return milliseconds;
    }
}
