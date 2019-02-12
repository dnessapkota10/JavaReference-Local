package com.home.datetime;

import java.text.DateFormat;
import java.util.Date;

public class DateTimeFormat {
	
	public static void dateTimeFormat(){
		
		System.out.println(String.format("Today's date in dd/mm/yy format %1$td/%1$tm/%1$ty", new Date()));
		System.out.println(String.format("Today's date in dd/mm/yyyy format %1$td/%1$tm/%1$tY", new Date()));
		System.out.println(String.format("Today's date in dd-mm-yy format %1$td-%1$tm-%1$ty", new Date()));
		System.out.println(String.format("Today's date in dd-mm-yyyy format %1$td-%1$tm-%1$tY", new Date()));
		
		Date		date       = new Date();
		DateFormat	dateformat = DateFormat.getDateInstance( DateFormat.DEFAULT );
		String		string     = dateformat.format( date );

		System.out.println("===========");
		System.out.println( "DEFAULT: " + string );

		dateformat = DateFormat.getDateInstance( DateFormat.FULL );
		string     = dateformat.format( date );
		System.out.println( "   FULL: " + string );

		dateformat = DateFormat.getDateInstance( DateFormat.LONG );
		string     = dateformat.format( date );
		System.out.println( "   LONG: " + string );

		dateformat = DateFormat.getDateInstance( DateFormat.MEDIUM );
		string     = dateformat.format( date );
		System.out.println( " MEDIUM: " + string );

		dateformat = DateFormat.getDateInstance( DateFormat.SHORT );
		string     = dateformat.format( date );
		System.out.println( "  SHORT: " + string );
		
	}

}
