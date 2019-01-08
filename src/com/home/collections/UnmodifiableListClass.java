package com.home.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UnmodifiableListClass {

	public void getImmutableList(){
		final List<String> countries = Collections.unmodifiableList(new ArrayList<String>(Arrays.asList("GER", "UAE")));
		System.out.println(countries);
	}
}
