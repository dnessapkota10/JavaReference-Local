package com.home.smooks;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

import java.text.SimpleDateFormat;

import org.junit.Test;

import com.home.smooks.Order.Status;

public class SmooksTest {

	@Test
	public void whenConvert_thenPOJOsConstructedCorrectly() {
		XmlToJavaConverter xmlToJavaOrderConverter = new XmlToJavaConverter();
		try {
			//final String xmlFilePath = "src/main/resources/smooks/OrderXml.xml";
			//final String smooksConfigXml = "src/main/resources/smooks/XmlToJavaSmooks-Order.xml";
			
			final String xmlFilePath = "src/main/resources/smooks/OrderSupplierItems.xml";
			final String smooksConfigXml = "src/main/resources/smooks/XmlToJavaSmooks-OrderSupplierItems.xml";
			Order order = xmlToJavaOrderConverter.converOrderXMLToOrderObject(smooksConfigXml, xmlFilePath);

			assertThat(order.getNumber(), is(771L));
			//assertThat(order.getNumber(), is(7271L));
			assertThat(order.getStatus(), is(Status.IN_PROGRESS));
			assertThat(order.getCreationDate(), is(new SimpleDateFormat("yyyy-MM-dd").parse("2018-01-14")));
			
			assertNotNull(order.getItems());
			assertNotNull(order.getSupplier());
			
			//assertThat(order.getItems().get(1).getPrice(), is(9.99));
			assertThat(order.getItems().get(0).getPrice(), is(9.99));
			
		} catch (Exception ex) {
			System.out.println(ex.getLocalizedMessage());
		}
	}
}
