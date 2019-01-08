package com.home.jackson;

import java.util.Date;

public class Person {
	public String firstName;
	public String lastName;
	public Date dob;
	public Person() {	
	}
	public Person(String firstName, String lastName,
				Date dob) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
	}
	public String toString() {
	    return "[" + firstName + " " + lastName +
		       " " + dob.getTime() +"]";
	}
}
