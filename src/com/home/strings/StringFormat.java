package com.home.strings;

import java.util.Date;

public class StringFormat {

	public static void dateTimeFormat(){
		System.out.println(String.format("Today's date in dd/mm/yy format %1$td/%1$tm/%1$ty", new Date()));
	}
}
