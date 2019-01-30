package com.home.datetime;

import java.sql.Date;
import java.util.Calendar;


public class SqlDateClass {

	public static void defineDate(){
		Date  date;

	    date = Date.valueOf( "2010-10-14" );
	    System.out.println( date );
	    
	    	    
	    date = fabricateDate( 2010, 10, 14 );
	    System.out.println( date );
	}
	
	private static Date fabricateDate( int year, int month, int day )
    {
        Calendar calendar = Calendar.getInstance();

        calendar.set( Calendar.YEAR,  year    );
        calendar.set( Calendar.MONTH, month-1 );  // (just as C's time.h interfaces)
        calendar.set( Calendar.DATE,  day     );

        long     milliseconds = calendar.getTimeInMillis();

        return new Date( milliseconds );
    }
}
