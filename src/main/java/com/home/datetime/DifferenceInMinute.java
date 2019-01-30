package com.home.datetime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class DifferenceInMinute {

	public static void diffInMin(){
		String dateStart = "10/12/10 15:23:41";
		String dateStop = "18/12/10 15:29:35";

		Date d1 = null;
		Date d2 = null;
		
		// Custom date format
		SimpleDateFormat format = new SimpleDateFormat("yy/MM/dd HH:mm:ss"); 
		
		try {
		    d1 = format.parse(dateStart);
		    d2 = format.parse(dateStop);
		} catch (ParseException e) {
		    e.printStackTrace();
		}   
		
		//System.out.println(d2.getTime() - d1.getTime());
		System.out.println(d1);
		System.out.println(d2);
		long minutes = TimeUnit.MILLISECONDS.toMinutes(d2.getTime() - d1.getTime()); 
		//System.out.println(minutes);
		
		long diff = d2.getTime() - d1.getTime();
		long diffSeconds = diff / 1000 % 60;  
		long diffMinutes = diff / (60 * 1000) % 60; 
		long diffHours = diff / (60 * 60 * 1000);
		System.out.println(minutes);
		System.out.println(diffMinutes);
	}
}
