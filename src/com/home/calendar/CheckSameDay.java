package com.home.calendar;

import java.util.Calendar;
import java.util.Date;

public class CheckSameDay {

	public static void checkIfTheyAreInSameDay(){	
		final Date declinedDate = new Date();
		//declinedDate.setYear(10);
		declinedDate.setDate(1);
		
		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		cal1.setTime(declinedDate);
		cal2.setTime(new Date());
		
		System.out.println("cal1.get(Calendar.YEAR)::" +cal1.get(Calendar.YEAR));
		System.out.println("cal2.get(Calendar.YEAR)::" + cal2.get(Calendar.YEAR));
		System.out.println("cal1.get(Calendar.DAY_OF_YEAR)::" +cal1.get(Calendar.DAY_OF_YEAR));
		System.out.println("cal2.get(Calendar.DAY_OF_YEAR::" + cal2.get(Calendar.DAY_OF_YEAR));
		
		boolean sameDay = cal1.get(Calendar.YEAR) == cal2.get(Calendar.YEAR) &&
		                  cal1.get(Calendar.DAY_OF_YEAR) == cal2.get(Calendar.DAY_OF_YEAR);
		final boolean declinedWithin1Day = cal1.get(Calendar.YEAR) == cal2.get(Calendar.YEAR) &&
				   cal2.get(Calendar.DAY_OF_YEAR) - cal1.get(Calendar.DAY_OF_YEAR) < 2;
		System.out.println("declinedWithin1Day::" +declinedWithin1Day);
	}
	
}
