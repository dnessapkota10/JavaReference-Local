package com.home.java8;

import java.util.Optional;

public class OptionalClass {
//https://dzone.com/articles/optional-ispresent-is-bad-for-you
	
//	public Logo getLogoOrReturnDefault(Person person) {
//	    return Optional.ofNullable(person)
//	        .map(p -> p.getLogo())
//	        .orElse(new DefaultLogo());
//	}
	
	//Another Example
//	final Optional<Person> highLevelPerson = members.stream()
//		    .filter(member -> member.getLevel() > 10)
//		    .findFirst()
//		    .map(member -> privateMethodFromManyLinesOfCode(member))
//		    .orElse(another);
	
	public static void ofNullable(){
		
		Integer value=5;
		
		System.out.println(Optional.ofNullable(value).map(i -> i.toString()).orElse(null));
		Optional<String> opt = Optional.of("Baeldung");
		opt = Optional.ofNullable(null);
		System.out.println("Optional.ofNullable(null)::" +opt.toString());
		
		String nullName = null;
	    String name = Optional.ofNullable(nullName).orElse("john");
	    System.out.println("Optional.ofNullable(nullName).orElse('john')::" +Optional.ofNullable(nullName).orElse("john"));
	    
	    final String distributor = null;
	    System.out.println(Optional.ofNullable(distributor).map(s -> "juiceplus.com/+" + s).orElse(""));
	}
}
