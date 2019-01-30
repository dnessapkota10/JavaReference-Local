package com.home.collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapClass {

	
	public static void testRetainAll(){
		Map<String,Boolean> map = new HashMap<String,Boolean>();
		Set<String> checks = new HashSet<String>();
		
		checks.add("CHANGE_ADDRESS");
		checks.add("CHANGE_PAYMENT");
		checks.add("REACTIVATE_ARO");
		checks.add("EXPEDITE_SHIPMENT");
		checks.add("DELAY_SHIPMENT");
		checks.add("CHANGE_PRODUCTS");
		checks.add("CANCEL_ORDER");
		checks.add("RETURN_AUTHORIZATION");
		checks.add("REORDER");
		
		//checks.add("CHANGE_PRODUCTS");
		map.put("CHANGE_PAYMENT", Boolean.TRUE);
		map.put("CHANGE_PRODUCTS", Boolean.TRUE);
		
		System.out.println("Checks:: " + checks);
		System.out.println("Map:: " +map);
		System.out.println("map.keySet():: " +map.keySet());
		System.out.println("map.keySet().retainAll(checks):: " +map.keySet().retainAll(checks));
		System.out.println("Map after retainAll():: " +map);
		
	}
	
	public static void emptyMap(){
		System.out.println(Collections.EMPTY_MAP);
		Map map = new HashMap<String,String>();
		System.out.println(map);
		map.put("1",null);
		System.out.println(map);
		
		Map map1 = Collections.EMPTY_MAP;
		map1.put("1",null);
		System.out.println(map1);	
	}
	
	public void map() {

		Map<Integer, MapItem> map = new TreeMap<>();

		map.put(1, new MapItem(10));
		map.put(2, new MapItem(20));

		System.out.println(map.get(1).getVal());
	}

	public class MapItem {
		private int val;

		public MapItem(int val) {
			this.val = val;

		}

		public int getVal() {
			return val;
		}

		public void setVal(int val) {
			this.val = val;
		}
			
	}
}
