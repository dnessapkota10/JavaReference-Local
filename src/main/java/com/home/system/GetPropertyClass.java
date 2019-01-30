package com.home.system;

public class GetPropertyClass {

	public void getSystemPropertyByKey(){
		final String VIA_FILE = System.getProperty("com.nsa.integration.warehouse.universe.via041file", "15.xml");
		//First parameter is key and second is default value
		System.out.println(VIA_FILE);
	}
}
