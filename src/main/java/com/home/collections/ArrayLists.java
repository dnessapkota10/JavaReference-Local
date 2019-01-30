package com.home.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {

	private List<String> stringList;
	
	public void copyList(){
		List<String> sourceList = new ArrayList<String>();
		sourceList.add("Test1");
		sourceList.add("Test2");
		
		stringList = new ArrayList<String>(sourceList);
		
	}
}
