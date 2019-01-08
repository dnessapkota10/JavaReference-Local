package com.home.arrays;

import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;
import java.util.stream.Stream;

public class LumpSum {

	public static void test(){
		Map<Integer, String> map = new TreeMap<>();
		map.put(1,"a");
		map.put(2,"b");
		
		System.out.println("map::" +map.get(1));
		
		final String[] salesOrderIds = {"1","2","3"};
		final String[] salesOrderIdsAll = {"5","4","3","2","1"};
				
		final int[] tempLumps = Stream.of(new Integer[]{})
                .mapToInt(i -> Optional.ofNullable(i).orElse(1))
                .map(i -> i <= 0 ? 1 : i)
                .toArray();
        final int[] lumps = new int[salesOrderIds.length];
        
        Arrays.fill(lumps, 1);
        System.arraycopy(tempLumps, 0, lumps, 0, tempLumps.length);
        
        for(int i=0;i<lumps.length;i++){
        	System.out.println(lumps[i]);
        }
		for (int i = 0; i < salesOrderIds.length; i += lumps[i]) {
			final String salesOrderId = salesOrderIds[i]==null ? salesOrderIdsAll[salesOrderIds.length-1-i] : salesOrderIds[i];
			
			System.out.println("i::"+ i + " "  +salesOrderId);
		}
	}
}
