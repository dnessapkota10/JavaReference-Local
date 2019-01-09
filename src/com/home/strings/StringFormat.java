package com.home.strings;

import java.util.Date;

//https://docs.oracle.com/javase/7/docs/api/java/util/Formatter.html
//http://www.javahotchocolate.com/topics/string-format.html
public class StringFormat {

	public static void dateTimeFormat(){
		
		System.out.println(String.format("Today's date in dd/mm/yy format %1$td/%1$tm/%1$ty", new Date()));
		System.out.println(String.format("Today's date in dd/mm/yyyy format %1$td/%1$tm/%1$tY", new Date()));
		System.out.println(String.format("Today's date in dd-mm-yy format %1$td-%1$tm-%1$ty", new Date()));
		System.out.println(String.format("Today's date in dd-mm-yyy format %1$td-%1$tm-%1$tY", new Date()));
		
	}
	
	public static void simpleFormat()
	   {
	        System.out.println( "simpleFormat():" );
	        System.out.println( String.format( "    Hi %s, you owe me $%5.2f.", "Jack", 25. ) );
	   }

	   public static void testArgumentIndex()
	   {
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
	        System.out.println( "\ntestCharacter():" );
	        System.out.println( String.format( "    '%1$s', '%1$c', '%1$C'", 97 ) );
	   }

	   public static void testInteger()
	   {
	        System.out.println( "\ntestInteger():" );
	        System.out.println( String.format( "    %d, %o, %h, %H", 161, 161, 161, 161 ) );

	       // try big number with and without group separator
	        System.out.println( String.format( "    %1$d, %1$,d", 161161161161L ) );
	   }

	   public static void testFloat()
	   {
	        System.out.println( "\ntestFloat():" );
	        System.out.println( String.format( "    %1$.2e, %1$.2f, %1$.2g, %1$.2a", 12345678.9999932 ) );
	   }

	   public static void testDate()
	   {
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
	        System.out.println( "\ntestFlags():" );
	        System.out.println( String.format( "    '%1$s', '%1$-10.8s', '%1$.12s', '%1$-25s'", "Huge Fruit, Inc." ) );
	        //System.out.println( String.format( "    '%1$s', '%1$#s', '%1$-10.8s', '%1$.12s', '%1$-25s'", "Huge Fruit, Inc." ) );
	   }

	   public static void testGeneral()
	   {
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
