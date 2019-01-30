package com.home.arrays;

public class NullValues {

	
	public static void checkNullinLoop(){
		String[] test = {"test",null,null};
		String[] test1 = {null}; //{null,"a"};
		
		//System.out.println("test1---len--" +test1.length);
		for(int i = 0; i<3; i++){
			if(test1.length == i) continue;
			//System.out.println("test---" +test1[i]);
		}
	}
}
