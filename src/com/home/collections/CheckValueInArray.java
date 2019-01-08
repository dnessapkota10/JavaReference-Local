package com.home.collections;

import java.util.Arrays;

public class CheckValueInArray {

	public static void checkValue(){
		String[] arr = {"66","44","666"};
		boolean test = Arrays.asList(arr).contains("666");
		
		System.out.println(test);
		
		boolean test2 = Arrays.stream(arr).anyMatch("66"::equals);
		
		System.out.println(test2);
	}
}
