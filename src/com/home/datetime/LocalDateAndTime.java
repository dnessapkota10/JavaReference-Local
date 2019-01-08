package com.home.datetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.util.logging.Logger;

import com.home.main.MainClass;

public class LocalDateAndTime {
	//https://dzone.com/articles/java-8-apis-javautiltime

	public static void localDateTimeMethod() {
		final Logger LOGGER = Logger.getLogger(MainClass.class.getName());
		System.out.println("LOGGER Name::" + LOGGER.getName());

		LocalDate localDate = LocalDate.now();
		localDate = LocalDate.ofYearDay(2005, 86); // The 86th day of 2005
													// (27-Mar-2005)

		System.out.println("localDate::" + localDate);

		localDate = LocalDate.of(2013, Month.AUGUST, 10); // 10th of Aug 2013
		LocalTime localTime = LocalTime.of(22, 33); // 10:33 PM
		localTime = LocalTime.now();
		localTime = LocalTime.ofSecondOfDay(4503); // The 4,503 second in a day
													// (1:15:30 AM)
		
		
		LocalDateTime localDateTime = LocalDateTime.now();
		// Jump to 25 hours and 3 minutes into the future
		LocalDateTime inTheFuture = localDateTime.plusHours(25).plusMinutes(3);
		// We could do the same on localTime or localDate
		System.out.println(localDateTime.toLocalTime().plusHours(25).plusMinutes(3));
		System.out.println(localDateTime.toLocalDate().plusMonths(2));
		// We could also use TemportalAmount (in this case a Duration and Period)
		System.out.println(localDateTime.toLocalTime().plus(Duration.ofHours(25).plusMinutes(3)));
		System.out.println(localDateTime.toLocalDate().plus(Period.ofMonths(2)));
	}
}
