/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

package core.utils;

import org.openqa.selenium.InvalidArgumentException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class StringToDateConverter {
    private Calendar calendar = Calendar.getInstance();

    /**
     * Converts a provided String to Date.
     *
     * @param string with the date on format like:
     *               TODAY, YESTERDAY, TOMORROW, or
     *               [number] [time unit] ago, or
     *               [number] [time unit] from now, or
     *               MM/DD/YYYY
     * @return the date in Date type
     */
    public Date convertStringToDate(final String string) throws ParseException {
        if (string == null | string.equals("")) {
            throw new NullPointerException();
        }
        String[] dateParts = string.split("\\s+");
        return selectConvertType(dateParts);
    }

    /**
     * Selects the proper converter.
     *
     * @param dateStringParts an array of the required values
     * @return the Date according to the Strings
     * @throws ParseException when it is not possible to parse
     */
    private Date selectConvertType(final String[] dateStringParts) throws ParseException {
        if (dateStringParts.length == 1) {
            if (dateStringParts[0].contains("/")) {
                return new SimpleDateFormat("MM/dd/yyyy").parse(dateStringParts[0]);
            } else {
                return convertAdverbOfTime(dateStringParts);
            }
        } else {
            return convertCustomString(dateStringParts);
        }
    }

    /**
     * Converts Adverb of time to date.
     *
     * @param dateStringParts an array of the required values
     * @return the Date according to the Strings
     */
    private Date convertAdverbOfTime(final String[] dateStringParts) {
        for (AdverbsOfTime adverbsOfTime : AdverbsOfTime.values()) {
            if (adverbsOfTime.name().equals(dateStringParts[0])) {
                calendar.add(Calendar.DATE, adverbsOfTime.getDayDifference());
                return calendar.getTime();
            }
        }
        throw new InvalidArgumentException("Invalid adverb of time, unsupported String value");
    }

    /**
     * Converts a custom String to date.
     *
     * @param dateStringParts an array of the required values
     * @return the Date according to the Strings
     */
    private Date convertCustomString(final String[] dateStringParts) {
        int value = Integer.parseInt(dateStringParts[0]);
        String timeUnit = dateStringParts[1];
        String operatorKeyWord = dateStringParts[2];
        calculateDate(operatorKeyWord, value, timeUnit);
        return calendar.getTime();
    }

    /**
     * Makes an operation with the provided value and time unit.
     *
     * @param operatorKeyWord a String with the key word to determine the operation
     * @param value the times the time unit is required
     * @param timeUnit a String with the time unit provided
     */
    private void calculateDate(final String operatorKeyWord,
                                             final int value, final String timeUnit) {
        if (operatorKeyWord.equals("ago")) {
            calendar.add(getRequiredCalendarValue(timeUnit), -value);
        } else if (operatorKeyWord.equals("from")) {
            calendar.add(getRequiredCalendarValue(timeUnit), value);
        } else {
            throw new InvalidArgumentException("Invalid key word, unsupported String value");
        }
    }

    /**
     * Gets the calendar's value for the time unit.
     *
     * @param timeUnit a String with the time unit provided
     * @return an int with the value
     */
    private int getRequiredCalendarValue(final String timeUnit) {
        for (TimeUnits timeUnits : TimeUnits.values()) {
            if (timeUnit.contains(timeUnits.getName())) {
                return timeUnits.getCalendarValue();
            }
        }
        throw new InvalidArgumentException("Invalid time unit, unsupported String value");
    }
}
