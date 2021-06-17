package com.hotelbeds.time.calculation;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.ParseException;

import org.junit.jupiter.api.Test;

public class TimeCalculationTest {

	private TimeCalculation timeCalculation = new TimeCalculation();

	@Test
	public void when_same_dates_return_zero() throws ParseException {
		long minutes = timeCalculation.minutesBetween("Thu, 21 Dec 2000 16:01:07 +0200", "Thu, 21 Dec 2000 16:01:07 +0200");
		assertEquals(minutes, 0);
	}

	@Test
	public void when_same_dates_diferent_timezone_return_zero() throws ParseException {
		long minutes = timeCalculation.minutesBetween("Thu, 21 Dec 2000 16:01:07 +0200", "Thu, 21 Dec 2000 15:01:07 +0100");
		assertEquals(minutes, 0);
	}

	@Test
	public void when_one_hour_diference_dates_return_60() throws ParseException {
		long minutes = timeCalculation.minutesBetween("Thu, 21 Dec 2000 17:01:07 +0200", "Thu, 21 Dec 2000 16:01:07 +0200");
		assertEquals(minutes, 60);
	}

	@Test
	public void when_one_hour_diference_dates_diferent_timezone_return_60() throws ParseException {
		long minutes = timeCalculation.minutesBetween("Thu, 21 Dec 2000 17:01:07 +0200", "Thu, 21 Dec 2000 17:01:07 +0100");
		assertEquals(minutes, 60);
	}
}
