package com.home.datetime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class CheckDayRange {

	public static void checkRange(){
		
		String labelDate = "18/12/10 16:12:03.573";
		Date d1 = null;
		
		// Custom date format
		SimpleDateFormat format = new SimpleDateFormat("yy/MM/dd HH:mm:ss"); 
		 
		try {
			d1 = format.parse(labelDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*Calendar c = Calendar.getInstance();
        c.setTime(d1);
        c.add(Calendar.DATE, 30);*/
        
        //System.out.println(c.getTime());
		
        Date d2 = new Date();
        
        long days = TimeUnit.MILLISECONDS.toDays(new Date().getTime() - d1.getTime());
        
        System.out.println("Difference in two dates::" +days);
        
	}
}
