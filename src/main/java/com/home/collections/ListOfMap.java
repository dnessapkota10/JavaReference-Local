package com.home.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class ListOfMap {

	public static void collectFromListofMap(){
		
		final List<Map<String, String>> invRecords = new ArrayList<Map<String, String>>();
		
		Map<String,String> map = new HashMap<String, String>();
		map.put("key1", "value1");
	
		Map<String, String> map1 = new HashMap<String,String>();
		map1.put("key2", "value2");
		
		
		invRecords.add(map);
		invRecords.add(map1);
		
		AtomicInteger counter = new AtomicInteger(1);
		
		final String itemsDesc = invRecords.stream().map(inv -> {																    
																	System.out.println("Inside");
																	return inv.get("key" +counter.getAndIncrement());
																	
																 }).collect(Collectors.joining(", "));    
		
		System.out.println(itemsDesc);
	}
}
