package com.home.collections;

import java.util.Collections;
import java.util.List;

public class SingletonListClass {

	public void getSingletonLst(){
		final List<String> countries = Collections.singletonList("GER");
		
		System.out.println(countries.get(0));
	}
}
