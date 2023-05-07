package org.example.DateUtil;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class DateTest {
    @Test
    public void return_true_when_divisible_by_400() {
        assertThat(Date.isLeapYear(2000), is(true));
        assertThat(Date.isLeapYear(1600), is(true));
        assertThat(Date.isLeapYear(2400), is(true));
    }

    @Test
    public void return_false_when_divisible_by_100_not_400() {
        assertThat(Date.isLeapYear(1700), is(false));
        assertThat(Date.isLeapYear(1800), is(false));
        assertThat(Date.isLeapYear(1900), is(false));
    }

    @Test
    public void return_true_when_divisible_by_4_not_100() {
        assertThat(Date.isLeapYear(1996), is(true));
        assertThat(Date.isLeapYear(2004), is(true));
        assertThat(Date.isLeapYear(2008), is(true));
    }

    @Test
    public void return_false_when_not_divisible_by_4() {
        assertThat(Date.isLeapYear(2017), is(false));
        assertThat(Date.isLeapYear(2019), is(false));
        assertThat(Date.isLeapYear(2018), is(false));
    }
}