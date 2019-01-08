package com.home.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreateListWithAnotherList {

	public void createListwithOtherList(){
		List<String> list1 = new ArrayList<>(Arrays.asList("1","2"));
		
		List<String> list2 = new ArrayList<>(list1);
		System.out.println(list2);
	}
}
