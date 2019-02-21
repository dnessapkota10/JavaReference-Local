package com.home.strings;

public class CharacterOperations {

	// check if a character in a string is a digit or letter
	public static void checkAlphabets() {
		final String str = "F98gh4AD";
		for (int i = 0; i < str.length(); i++) {

			/*
			 * if (Character.isLetter(str.charAt(i))){
			 * System.out.println(str.charAt(i)); }
			 

			if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {
				System.out.println(str.charAt(i) + " is not character");
			} else
				System.out.println(str.charAt(i) + " is a character");*/

			if ((str.charAt(i) >= 'a' && str.charAt(i) <= 'z') || (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'))
				System.out.println(str.charAt(i) + " is an alphabet.");
			else
				System.out.println(str.charAt(i) + " is not an alphabet.");

		}
	}
}
