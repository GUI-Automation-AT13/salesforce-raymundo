/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

package unittests.core.utils;

import core.utils.stringtodateconverter.StringToDateConverter;
import org.openqa.selenium.InvalidArgumentException;
import org.testng.annotations.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

import static org.testng.Assert.assertTrue;

public class StringToDateConverterTest {
    @Test
    public void testConvertStringToDateWithToday() throws ParseException {
        StringToDateConverter stringToDateConverter = new StringToDateConverter();
        String value = "TODAY";
        Date actual = stringToDateConverter.convertStringToDate(value);
        Date expected = new Date();
        assertTrue(Math.abs(actual.getTime() - expected.getTime()) < 50,
                "\nExpected: " + expected + "\n" +"Actual : " + actual);
    }

    @Test
    public void testConvertStringToDateWithYesterday() throws ParseException {
        StringToDateConverter stringToDateConverter = new StringToDateConverter();
        String value = "YESTERDAY";
        Date actual = stringToDateConverter.convertStringToDate(value);
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, -1);
        Date expected = calendar.getTime();
        assertTrue(Math.abs(actual.getTime() - expected.getTime()) < 50,
                "\nExpected: " + expected + "\n" +"Actual : " + actual);
    }

    @Test
    public void testConvertStringToDateWithTomorrow() throws ParseException {
        StringToDateConverter stringToDateConverter = new StringToDateConverter();
        String value = "TOMORROW";
        Date actual = stringToDateConverter.convertStringToDate(value);
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, 1);
        Date expected = calendar.getTime();
        assertTrue(Math.abs(actual.getTime() - expected.getTime()) < 50,
                "\nExpected: " + expected + "\n" +"Actual : " + actual);
    }

    @Test
    public void testConvertStringToDateWith15MinutesFromNow() throws ParseException {
        StringToDateConverter stringToDateConverter = new StringToDateConverter();
        String value = "15 minutes from now";
        Date actual = stringToDateConverter.convertStringToDate(value);
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MINUTE, 15);
        Date expected = calendar.getTime();
        assertTrue(Math.abs(actual.getTime() - expected.getTime()) < 50,
                "\nExpected: " + expected + "\n" +"Actual : " + actual);
    }

    @Test
    public void testConvertStringToDateWith2DaysAgo() throws ParseException {
        StringToDateConverter stringToDateConverter = new StringToDateConverter();
        String value = "2 days ago";
        Date actual = stringToDateConverter.convertStringToDate(value);
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, -2);
        Date expected = calendar.getTime();
        assertTrue(Math.abs(actual.getTime() - expected.getTime()) < 50,
                "\nExpected: " + expected + "\n" +"Actual : " + actual);
    }

    @Test
    public void testConvertStringToDateWith5MonthsFromNow() throws ParseException {
        StringToDateConverter stringToDateConverter = new StringToDateConverter();
        String value = "5 months from now";
        Date actual = stringToDateConverter.convertStringToDate(value);
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MONTH, 5);
        Date expected = calendar.getTime();
        assertTrue(Math.abs(actual.getTime() - expected.getTime()) < 50,
                "\nExpected: " + expected + "\n" +"Actual : " + actual);
    }

    @Test
    public void testConvertStringToDateWith3YearsAgo() throws ParseException {
        StringToDateConverter stringToDateConverter = new StringToDateConverter();
        String value = "3 years ago";
        Date actual = stringToDateConverter.convertStringToDate(value);
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.YEAR, -3);
        Date expected = calendar.getTime();
        assertTrue(Math.abs(actual.getTime() - expected.getTime()) < 50,
                "\nExpected: " + expected + "\n" +"Actual : " + actual);
    }

    @Test
    public void testConvertStringToDateWith1DayAgo() throws ParseException {
        StringToDateConverter stringToDateConverter = new StringToDateConverter();
        String value = "1 day ago";
        Date actual = stringToDateConverter.convertStringToDate(value);
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, -1);
        Date expected = calendar.getTime();
        assertTrue(Math.abs(actual.getTime() - expected.getTime()) < 50,
                "\nExpected: " + expected + "\n" +"Actual : " + actual);
    }

    @Test
    public void testConvertStringToDate() throws ParseException {
        StringToDateConverter stringToDateConverter = new StringToDateConverter();
        String value = "7/14/2021";
        Date actual = stringToDateConverter.convertStringToDate(value);
        Date expected = new SimpleDateFormat("MM/dd/yyyy").parse(value);
        assertTrue(Math.abs(actual.getTime() - expected.getTime()) < 50,
                "\nExpected: " + expected + "\n" +"Actual : " + actual);
    }

    @Test(expectedExceptions = {InvalidArgumentException.class},
            expectedExceptionsMessageRegExp = "Invalid time unit, unsupported String value.*")
    public void testConvertStringToDateWithInvalidTimeUnit() throws ParseException {
        StringToDateConverter stringToDateConverter = new StringToDateConverter();
        String value = "15 minutos ago";
        stringToDateConverter.convertStringToDate(value);
    }

    @Test(expectedExceptions = {InvalidArgumentException.class},
            expectedExceptionsMessageRegExp = "Invalid key word, unsupported String value.*")
    public void testConvertStringToDateWithInvalidKeyWord() throws ParseException {
        StringToDateConverter stringToDateConverter = new StringToDateConverter();
        String value = "15 minutes antes";
        stringToDateConverter.convertStringToDate(value);
    }

    @Test(expectedExceptions = {InvalidArgumentException.class},
            expectedExceptionsMessageRegExp = "Invalid adverb of time, unsupported String value.*")
    public void testConvertStringToDateWithInvalidAdverbOfTime() throws ParseException {
        StringToDateConverter stringToDateConverter = new StringToDateConverter();
        String value = "HOY";
        stringToDateConverter.convertStringToDate(value);
    }

    @Test(expectedExceptions = {NullPointerException.class})
    public void testConvertStringToDateWithNull() throws ParseException {
        StringToDateConverter stringToDateConverter = new StringToDateConverter();
        String value = null;
        stringToDateConverter.convertStringToDate(value);
    }

    @Test
    public void test100() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("d/M/yyyy HH:mm");
        System.out.println(dateFormat.format(Date.from(Instant.now())));
    }
}