package com.home.strings;

import java.text.DateFormat;
import java.util.Date;

import org.apache.commons.lang3.StringUtils;

//https://docs.oracle.com/javase/7/docs/api/java/util/Formatter.html
//http://www.javahotchocolate.com/topics/string-format.html
public class StringFormat {

	//CPORTAL 01/17/2019 02:28:19 PM - RA Track No. 920239021656245434
	public static void portalTrackNoComment(){
		final String PORTAL_CHANGE_COMMENT = "CP %1$tm/%1$td/%1$ty %1$tr %2$s"; 
		final String trackingNumber = "92023902165624543400001103";
		final String fullComment = String.format(PORTAL_CHANGE_COMMENT, new Date(), "RA Track# " + trackingNumber); //JCP-218 : Fit tracking number in a single line
        {
            final String comment = StringUtils.left(fullComment, 65);
            System.out.println("Comment::" +comment);
        }
        
	}
	
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
	
	public static void simpleFormat()
	   {
			System.out.println("===========");
	        System.out.println( "simpleFormat():" );
	        System.out.println( String.format( "    Hi %s, you owe me $%5.2f.", "Jack", 25. ) );
	   }

	   public static void testArgumentIndex()
	   {
		    System.out.println("===========");
	        System.out.println( "\ntestArgumentIndex():" );
	        System.out.println( String.format( "    A number may be formatted as a string \"%1$s\""
	                     + " or a number %1$d", 10 ) );

	       // note the %n format specifier. It starts a new line
	       // but does not consume an argument index from the list
	        System.out.println( String.format( "%n    Mixing indexed and unindexed arguments: "
	             + "%n    %5$s %s %2$s %s %4$s %s %s", "one", "two", "three", "four", "five" ) );
	   }

	   public static void testCharacter()
	   {
		    System.out.println("===========");
	        System.out.println( "\ntestCharacter():" );
	        System.out.println( String.format( "    '%1$s', '%1$c', '%1$C'", 97 ) );
	   }

	   public static void testInteger()
	   {
		    System.out.println("===========");
	        System.out.println( "\ntestInteger():" );
	        System.out.println( String.format( "    %d, %o, %h, %H", 161, 161, 161, 161 ) );

	       // try big number with and without group separator
	        System.out.println( String.format( "    %1$d, %1$,d", 161161161161L ) );
	   }

	   public static void testFloat()
	   {
		    System.out.println("===========");
	        System.out.println( "\ntestFloat():" );
	        System.out.println( String.format( "    %1$.2e, %1$.2f, %1$.2g, %1$.2a", 12345678.9999932 ) );
	   }

	   public static void testDate()
	   {
		    System.out.println("===========");
	        System.out.println( "\ntestDate():" );

	       long currentTime = System.currentTimeMillis();
	       Date date        = new java.util.Date( currentTime );

	        System.out.println( String.format( "    Current Time: %1$tm/%1$td/%1$tY %1$tH:%1$tM:%1$tS",
	                          currentTime ) );

	       // same as above but using shorthand notation
	        System.out.println( String.format( "    Current Time (using composition suffix): %1$tD %1$tT",
	                          currentTime ) );

	        System.out.println( String.format( "    Current Time (using Date object): %1$tm/%1$td/%1$tY %1$tH:%1$tM:%1$tS",
	                          date ) );
	   }

	   public static void testFlags()
	   {
		    System.out.println("===========");
	        System.out.println( "\ntestFlags():" );
	        System.out.println( String.format( "    '%1$s', '%1$-10.8s', '%1$.12s', '%1$-25s'", "Huge Fruit, Inc." ) );
	        //System.out.println( String.format( "    '%1$s', '%1$#s', '%1$-10.8s', '%1$.12s', '%1$-25s'", "Huge Fruit, Inc." ) );
	   }

	   public static void testGeneral()
	   {
		    System.out.println("===========");
	        System.out.println( "\ntestGeneral():" );
	        System.out.println(
	       // any object can be formatted as string
	       // upper case S converts string to upper case
	             String.format( "    %s, %S, %S, %S, %s", "String", "String", null, ( byte ) 1, 5.6 ) );

	        System.out.println(
	       // any object can be formatted as boolean
	       // upper case B prints TRUE or FALSE
	             String.format( "    %b, %B, %b, %B", "String", null, ( byte ) 1, 5.6 ) );

	        System.out.println(
	       // any object can be formatted as hex
	       // upper case H prints hex in uppercase
	             String.format( "    %h, %H, %H, %h, %H", "161", null, 161, new Integer( 161 ), 5.6 ) );

	       // What's the effect of width.precision on String?
	        System.out.println( String.format( "    \"%1$s\", \"%1$14s\", \"%1$14.2s\"", "Hello" ) );
	   }
}
