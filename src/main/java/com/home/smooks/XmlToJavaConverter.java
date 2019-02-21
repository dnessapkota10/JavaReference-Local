package com.home.smooks;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.xml.transform.stream.StreamSource;

import org.milyn.Smooks;
import org.milyn.SmooksException;
import org.milyn.payload.JavaResult;
import org.xml.sax.SAXException;

public class XmlToJavaConverter {

	public Order converOrderXMLToOrderObject(String path) 
			  throws IOException, SAXException {
			  
//		Smooks smooks = new Smooks("src/main/resources/smooks/XmlToJavaSmooks.xml");
//			    try {
//			        JavaResult javaResult = new JavaResult();
//			        smooks.filterSource(new StreamSource(path), javaResult);
//			        return (Order) javaResult.getBean("order");
//			    } finally {
//			        smooks.close();
//			    }
		
		
//		ClassLoader classLoader = getClass().getClassLoader();
//		File file = new File(classLoader.getResource("XmlToJavaSmooks.xml").getFile());
//		System.out.println(file.getAbsolutePath());
		
		// Instantiate Smooks with the config...
		Smooks smooks = new Smooks("src/main/resources/smooks/XmlToJavaSmooks.xml");
		JavaResult javaResult = new JavaResult();

		// Filter the input message to the JavaResult...
		smooks.filterSource(new StreamSource(new FileInputStream(path)), javaResult);

		// Extract the Order bean from the JavaResult using the beanId...
		Order order = (Order) javaResult.getBean("order");
		return order;
	}
}
