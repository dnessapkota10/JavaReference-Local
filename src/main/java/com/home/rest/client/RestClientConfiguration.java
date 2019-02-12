package com.home.rest.client;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class RestClientConfiguration {

	public static Properties getRestConfig(){
		Properties prop = new Properties();

		try {
		    prop.load(new FileInputStream("src/main/resources/rest/RESTConfiguration.properties"));
		    return prop;
		} catch (IOException e) {
		    System.out.println("Exception:: " +e);
		}
		return null;
	}
}
