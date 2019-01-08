package com.home.exception.handling;

public class NestedException {

	public static void nestedException(){
		boolean answer = false;
		try{
			answer = dummy();
		}
		catch(Exception ex){
			printException("First level exception catch:" +ex.getMessage());
		}
		finally{
			try{
				printException("Final before answer: " + answer);
				answer = dummy();
				printException("Final after answer: " + answer);
			}
			catch(Exception ex){
				printException("Inside final " +ex.getMessage());
				try{
					answer = dummy();
				}
				catch(Exception e){
					printException("Inside final inside catch::::" +e.getMessage());
				}
			}
		}
	}
	
	public static boolean dummy(){
		throw new RuntimeException("My Exception");
	}
	
	public static void printException(final String ex){
		System.out.println(ex);
	}
}
