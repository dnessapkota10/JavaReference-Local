package com.home.calendar;

import java.util.Calendar;
import java.util.Date;

public class CalendarClass {

	public void calendarTest(){
		 final Calendar c = Calendar.getInstance();
		 
		 c.add(Calendar.MONTH, 4);
         c.set(Calendar.DATE, 30);
         
         System.out.println("Calendar.DATE::" + Calendar.DATE);
         if (c.get(Calendar.DATE) < 30) {
        	 System.out.println("Calendar.DATE::" + Calendar.DATE);
             // Back off until the last day of the previous month
             c.add(Calendar.DATE, -c.get(Calendar.DATE));
         }
         System.out.println("Calendar.DATE::" + Calendar.DATE);
         System.out.println(c.getTime());
         
	}
	public static void test(){
		final Date declineDate = new Date("07/16/2018"); 
		final Calendar declineCal = Calendar.getInstance();
	    declineCal.clear();
	    declineCal.setTime(declineDate);
	    System.out.println("declineCal::" +declineCal.getTime());
	    declineCal.add(Calendar.DATE, 30);
	    
	    
	}
	
}
