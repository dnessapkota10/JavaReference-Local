package com.home.hacker.rank;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

public class HackerRankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		String [] a = {"a", "b"};
//		String [] b = {"b","a"};
//		
//		System.out.println(same(a,b));
//		same(a,b);
		//String[] str = {"car", "cheating", "dale","deal","lead", "listen", "silent","teaching"};
		String[] str = {"car", "cheatingdale","deal","leadlisten", "silent","teaching"};
		String[] out = friendlyWords(str);
		
		for(int i = 0; i< out.length;i++){
			System.out.println(out[i]);
		}
		//System.out.println(friendlyWords(str));
//
	}
	
	
	public static String[] friendlyWords(String[] input){
		
		final ArrayList<String> outputList = new ArrayList<String>();
		ArrayList<String> secondLst = new ArrayList<String>();
		boolean f = false;
		for(int i = 0;i < input.length ;i++){
			String first = input[i].chars()
				    .sorted()
				    .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
				    .toString();
			
			if(secondLst.contains(first)){
				continue;
			}
			String secondList = "";
			f = false;
			for(int j = i+1; j<input.length; j++){
				String second = input[j].chars()
					    .sorted()
					    .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
					    .toString();
				System.out.println(first + ">>>" + second);
				if(first.toLowerCase().contains(second.toLowerCase()) || second.toLowerCase().contains(first.toLowerCase())){
					//System.out.println(first + ">>>" + second);
					secondList = !secondList.isEmpty() ? secondList + " " + input[j] : input [j];
					secondLst.add(second);	
					f = true;
				}
			}
			if(f)
			
			outputList.add(input[i] + " " + secondList);
			
			
		}
		
		return outputList.toArray(new String[outputList.size()]);
		//return new String[]{};
	}
	
	public static boolean same(String[] a, String[] b){
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		for(int i = 0;i < a.length; i++){
			//System.out.println(b[i]);
			if (!a[i].equals(b[i]))
	            return false;
		}
		return true;
	}

}
