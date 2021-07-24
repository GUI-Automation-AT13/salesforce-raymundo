/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

package core.utils.stringtodateconverter;

public enum TimeUnits {
    YEAR("year", 1),
    MONTH("month", 2),
    DAY("day", 5),
    HOUR("hour", 10),
    MINUTE("minute", 12),
    SECOND("second", 13);
    private final String name;
    private int calendarValue;

    TimeUnits(final String enumName, final int enumCalendarValue) {
        this.name = enumName;
        this.calendarValue = enumCalendarValue;
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
     * Gets the calendar's value equivalent to time unit.
     *
     * @return a Long with the value
     */
    public int getCalendarValue() {
        return calendarValue;
    }
}
