package com.home.datetime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TwentyFourHourCheck {
	public final static long MILLIS_PER_DAY = 24 * 60 * 60 * 1000L;
	
	public static void check24Hrs() throws ParseException{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	    Date date1 = sdf.parse("2018-08-08");
	    Date date2 = sdf.parse("2018-08-06");
	
	    boolean moreThanDay = Math.abs(date1.getTime() - date2.getTime()) > MILLIS_PER_DAY;
	
	    System.out.println(moreThanDay);
	}
	
	public static void check24HrsDate(){
		final Date declinedDate = new Date();
		declinedDate.setDate(6);
    	final Date now = new Date();
    	
    	System.out.println(declinedDate + "::" +now);
    	System.out.println(now.getDay() - declinedDate.getDay());
    	if(now.compareTo(declinedDate) == -1){
    		
    	}
	}
}
