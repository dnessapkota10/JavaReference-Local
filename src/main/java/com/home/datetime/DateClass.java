package com.home.datetime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateClass {

	public static void stringToDate(){
		String labelDate1 = "2019-01-10";
		String labelDate2 = "01-10-2019";
		
		String labelDate3 = "2019/01/10";
		String labelDate4 = "2019-01-10";
		Date d1 = null;
		
		// Custom date format
		SimpleDateFormat formatter1 = new SimpleDateFormat("yyyy-MM-dd"); 
		SimpleDateFormat formatter2 = new SimpleDateFormat("MM-dd-yyyy");
		
		SimpleDateFormat formatter3 = new SimpleDateFormat("yyyy/MM/dd"); 
		SimpleDateFormat formatter4 = new SimpleDateFormat("yyyy-MM-dd");
		 
		try {
			
			String jacksonInput = "2000-10-22";
			d1 = formatter1.parse(jacksonInput);
			System.out.println(d1);
			
			d1 = formatter1.parse(labelDate1);
			System.out.println("Input::" +labelDate1);
			System.out.println("Parsed1:" +d1);
			System.out.println("Formatted1::" +formatter4.format(d1));
			
			System.out.println("\n=====================");
			System.out.println("Input::" +labelDate2);
			d1 = formatter2.parse(labelDate2);			
			System.out.println("Parsed2:" +d1);
			System.out.println("Formatted2::" +formatter2.format(d1));
			
			System.out.println("\n=====================");
			System.out.println("Input::" +labelDate3);
			d1 = formatter3.parse(labelDate3);			
			System.out.println("Parsed3:" +d1);
			System.out.println("Formatted3::" +formatter3.format(d1));
			
			System.out.println("\n=====================");
			System.out.println("Input::" +labelDate4);
			d1 = formatter4.parse(labelDate4);			
			System.out.println("Parsed3:" +d1);
			System.out.println("Formatted3::" +formatter4.format(d1));			
			
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
