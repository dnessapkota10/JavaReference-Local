package com.home.jackson;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class JSONObjectDateConverter 
{
    public static void getJsonConvertedDate() throws IOException
    {
    	ObjectMapper objectMapper = new ObjectMapper();
    	//Set pretty printing of json
    	objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
    	
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());		
		cal.add(Calendar.DATE,30);
		System.out.println(cal.getTime());
    	
    	Person objPerson = new Person("Mike", "harvey", cal.getTime());
    	
    	//Person objPerson = new Person("Mike", "harvey", new Date());
    	
    	//Convert Person object to json
    	String json = objectMapper.writeValueAsString(objPerson);
    	System.out.println("1. Convert Person to JSON - Date as timestamp");
    	System.out.println(json);
    	
    	//Disable the timestamp serialization
    	objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);  
    	
    	json = objectMapper.writeValueAsString(objPerson);
    	System.out.println("2. Convert Person to JSON - Date without timestamp");
    	System.out.println(json);
    	
    	//Convert to json to person object    	
    	System.out.println("3. Deserialize JSON to person object");
    	Person objFromJson = objectMapper.readValue(json, Person.class);
    	System.out.println(objFromJson); 
    }
}
