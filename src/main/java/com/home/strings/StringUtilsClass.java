package com.home.strings;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;

public class StringUtilsClass {

	
	private String str1 = null;
	private String str2 = "";
	
	public void checkBlank(){
		System.out.println("str1::" + str1 + "\t isNotBlank str1?::" + StringUtils.isNotBlank(str1));
		System.out.println("str1::" + str2 + "\t isNotBlank str2?::" + StringUtils.isNotBlank(str2));
	}
	
	public static void checkWordInString(){
		String response = "01StatusMessage:This property cannot be set to a null value.(6676371)";
		if (response.matches(".*StatusMessage.*") && response.split(":")[0].equals("Success")) {
			System.out.println(response.split(":")[1]);
		}
	}
	
	public void checkStringInList(String inputString){
//		String patternString1 = "Google,Facebook,Twitter";
//		Pattern pattern = Pattern.compile(patternString1);
        //Matcher matcher = pattern.matcher(inputString);
        
		
//        System.out.println(Pattern.matches("Google.*",inputString));
//        while(matcher.find()) {
//            System.out.println("found: " + matcher.group(1));
//        }
		//StringUtils.indexOfAny(inputString, new String[]{"Google", "Facebook", "Twitter"});
		
		
//		
//		String text = "Google Facebook Twitter";
//
//        String patternString = inputString;
//
//        Pattern pattern = Pattern.compile(patternString);
//        Matcher matcher = pattern.matcher(text);
//        int count = 0;
//        while(matcher.find()) {
//            count++;
//            System.out.println("found: " + count + " : "
//                    + matcher.start() + " - " + matcher.end());
//        }
        
        String  str   = StringUtils.containsOnly("Google", inputString)? "Google" 
        			  : StringUtils.containsOnly("Facebook", inputString)? "Facebook" 
        			  : StringUtils.startsWith("Twitter", inputString)? "Twitter"
        			  :"";
        
        System.out.println(inputString + "::" +str);
        //System.out.println(inputString + "::" + StringUtils.containsOnly("Google", inputString));
        
//		String text    =
//                "This is the text which is to be searched " +
//                "for occurrences of the word 'is'.";
//
//        String patternString = "is";
//
//        Pattern pattern = Pattern.compile(patternString);
//        Matcher matcher = pattern.matcher(text);
//
//        int count = 0;
//        while(matcher.find()) {
//            count++;
//            System.out.println("found: " + count + " : "
//                    + matcher.start() + " - " + matcher.end());
//        }

	}
	
	public void checkCompare(){
		final String status = "C";	
		final String statusReasonCode = "HCL";
		final String paymentType = "ACH";
		boolean canChangePayment = false;
        
		canChangePayment = !(StringUtils.startsWith(status, "H") && (!Arrays.asList("HV","HKT").contains(status)) ||
						   status.equals("C") && (Arrays.asList("IK","CB","HCL","CL").contains(statusReasonCode) ||
								                 (statusReasonCode.equals("NSF")||(StringUtils.startsWith(statusReasonCode, "R") && paymentType.equals("ACH")))));
									                  
		
		
        System.out.println("!Arrays.asList(HV,HKT).contains(status))::" +!Arrays.asList("HV","HKT").contains(status));
        
        System.out.println("Arrays.asList(item1, item2, item3).contains(string)::" +Arrays.asList("IK","CB","HCL","CL").contains(statusReasonCode));
		System.out.println("canChangePayment:" +canChangePayment);
        
		
	}
	
	
}
