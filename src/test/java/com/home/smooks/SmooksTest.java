package com.home.smooks;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.text.SimpleDateFormat;

import org.junit.Test;

import com.home.smooks.Order.Status;

public class SmooksTest {

	@Test
	public void whenConvert_thenPOJOsConstructedCorrectly() {
		XmlToJavaConverter xmlToJavaOrderConverter = new XmlToJavaConverter();
		try {
			Order order = xmlToJavaOrderConverter.converOrderXMLToOrderObject("src/main/resources/smooks/OrderXml.xml");

			assertThat(order.getNumber(), is(771L));
			//assertThat(order.getNumber(), is(7271L));
			assertThat(order.getStatus(), is(Status.IN_PROGRESS));
			assertThat(order.getCreationDate(), is(new SimpleDateFormat("yyyy-MM-dd").parse("2018-01-14")));
		} catch (Exception ex) {
			System.out.println(ex.getLocalizedMessage());
		}
	}
}
