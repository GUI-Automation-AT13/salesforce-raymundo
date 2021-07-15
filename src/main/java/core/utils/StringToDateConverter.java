/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

package core.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDateConverter {
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
                return adverbsOfTime.getDate();
            }
        }
        return null;
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
        Long dateInMilliseconds = calculateDateInMilliseconds(operatorKeyWord, value, timeUnit);
        return new Date(dateInMilliseconds);
    }

    /**
     * Makes an operation between the provided value and today's milliseconds equivalent.
     *
     * @param operatorKeyWord a String with the key word to determine the operation
     * @param value the times the time unit is required
     * @param timeUnit a String with the time unit provided
     * @return a Long with the result of the operation
     */
    private Long calculateDateInMilliseconds(final String operatorKeyWord,
                                             final int value, final String timeUnit) {
        Date date = new Date();
        if (operatorKeyWord.equals("ago")) {
            return date.getTime() - (value * getRequiredMilliseconds(timeUnit));
        }
        if (operatorKeyWord.equals("from")) {
            return date.getTime() + (value * getRequiredMilliseconds(timeUnit));
        }
        return null;
    }

    /**
     * Gets the milliseconds for the time unit.
     *
     * @param timeUnit a String with the time unit provided
     * @return a Long with the milliseconds
     */
    private Long getRequiredMilliseconds(final String timeUnit) {
        for (TimeUnits timeUnits : TimeUnits.values()) {
            if (timeUnit.contains(timeUnits.getName())) {
                return timeUnits.getMilliseconds();
            }
        }
        return null;
    }
}
