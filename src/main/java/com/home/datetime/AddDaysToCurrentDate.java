package com.home.datetime;

import java.util.Calendar;
import java.util.Date;

public class AddDaysToCurrentDate {

	public static void addDay(){
		Date date = new Date();
		 
		 Calendar cal = Calendar.getInstance();
		 cal.setTime(date);
		
		 cal.add(Calendar.DATE,30);
		 final Date d = cal.getTime();
		 System.out.println(d);
	}
}
