package com.hotelbeds.time.calculation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Class that implements a function to calculate minutes between two dates
 * @author Manuel Jesus Carrascosa de la Blanca
 *
 */
public class TimeCalculation{

	private static final String DATE_FORMAT_PATTERN = "EEE, dd MMM yyyy HH:mm:ss Z";
	private SimpleDateFormat formatter;

	/**
	 * Constructor with the default locale (English)
	 */
	public TimeCalculation() {
		this(Locale.ENGLISH);
	}

	/**
	 * Constructor that specifies the locale
	 * @param locale Locale for the dates
	 */
	public TimeCalculation(Locale locale) {
		this.formatter = new SimpleDateFormat(DATE_FORMAT_PATTERN, locale);
	}
	
	/**
	 * Returns the minutes between two dates, rounded down
	 * @param first first date
	 * @param second second date
	 * @return minutes between two dates, rounded down
	 * @throws ParseException Exception if the format is not valid
	 */
	public long minutesBetween(String first, String second) throws ParseException {
		Date firstDate = formatter.parse(first);
		Date secondDate = formatter.parse(second);
		return Math.abs((firstDate.getTime() - secondDate.getTime())/60000);
	}

}
