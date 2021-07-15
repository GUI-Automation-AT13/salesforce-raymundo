/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

package unittests.core.utils;

import core.utils.StringToDateConverter;
import org.testng.annotations.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import static org.testng.Assert.assertEquals;

public class StringToDateConverterTest {
    StringToDateConverter stringToDateConverter = new StringToDateConverter();

    @Test
    public void testConvertStringToDateWithToday() throws ParseException {
        String value = "TODAY";
        Date actual = stringToDateConverter.convertStringToDate(value);
        Date expected = new Date();
        assertEquals(actual, expected);
    }

    @Test
    public void testConvertStringToDateWithYesterday() throws ParseException {
        String value = "YESTERDAY";
        Date actual = stringToDateConverter.convertStringToDate(value);
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, -1);
        Date expected = calendar.getTime();
        assertEquals(actual, expected);
    }

    @Test
    public void testConvertStringToDateWithTomorrow() throws ParseException {
        String value = "TOMORROW";
        Date actual = stringToDateConverter.convertStringToDate(value);
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, 1);
        Date expected = calendar.getTime();
        assertEquals(actual, expected);
    }

    @Test
    public void testConvertStringToDateWith15MinutesFromNow() throws ParseException {
        String value = "15 minutes from now";
        Date actual = stringToDateConverter.convertStringToDate(value);
        Date expected = new Date(System.currentTimeMillis() + (15 * 60 * 1000L));
        assertEquals(actual, expected);
    }

    @Test
    public void testConvertStringToDateWith2DaysAgo() throws ParseException {
        String value = "2 days ago";
        Date actual = stringToDateConverter.convertStringToDate(value);
        Date expected = new Date(System.currentTimeMillis() - (2 * 24 * 60 * 60 * 1000L));
        assertEquals(actual, expected);
    }

    @Test
    public void testConvertStringToDateWith5MonthsFromNow() throws ParseException {
        String value = "5 months from now";
        Date actual = stringToDateConverter.convertStringToDate(value);
        Date expected = new Date(System.currentTimeMillis() + (5 * 30 * 24 * 60 * 60 * 1000L));
        assertEquals(actual, expected);
    }

    @Test
    public void testConvertStringToDateWith3YearsAgo() throws ParseException {
        String value = "3 years ago";
        Date actual = stringToDateConverter.convertStringToDate(value);
        Date expected = new Date(System.currentTimeMillis() - (3 * 12 * 30 * 24 * 60 * 60 * 1000L));
        assertEquals(actual, expected);
    }

    @Test
    public void testConvertStringToDateWith1DayAgo() throws ParseException {
        String value = "1 day ago";
        Date actual = stringToDateConverter.convertStringToDate(value);
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, -1);
        Date expected = calendar.getTime();
        assertEquals(actual, expected);
    }

    @Test
    public void testConvertStringToDate() throws ParseException {
        String value = "7/14/2021";
        Date actual = stringToDateConverter.convertStringToDate(value);
        Date expected = new SimpleDateFormat("MM/dd/yyyy").parse(value);
        assertEquals(actual, expected);
    }
}