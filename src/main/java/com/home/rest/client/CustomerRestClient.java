package com.home.rest.client;

import java.util.Properties;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.home.pojo.AddressXML;
import com.home.pojo.Customer;
import com.home.pojo.ShippingAddressXML;

//https://docs.jboss.org/resteasy/docs/3.0-beta-3/userguide/html/RESTEasy_Client_Framework.html
//https://www.programcreek.com/java-api-examples/?api=org.jboss.resteasy.client.jaxrs.ResteasyClient
public class CustomerRestClient {

	final static String customerId = "1430991";
	final static Properties config = RestClientConfiguration.getRestConfig(); 	
	final static String ENDPOINT = "/customer/" +customerId + "/orders/6002041/";
	final static String CUSTAPI_ENDPOINT = "customer/orders/6002041/";
	final static String COOKIE = "JSESSIONID=H6SVwzxvrnEwZaIOB2BFV5G2; XSRF-TOKEN=570ebde5-7563-4ace-a7b9-b3a352e1b5a4; _gcl_au=1.1.1271794339.1544049478; _ga=GA1.2.384651703.1544049478; __qca=P0-1429655026-1544049479093; __unam=ad08de3-167990486b7-614d736f-1; __idcontext=eyJjb29raWVJRCI6IjJITFlHMk9KQTJTN1BQVFRMS1NHRU5GRkZGSDVJNFpJWUpaS0hJMzJYWVhBPT09PSIsImRldmljZUlEIjoiMkhMWUcyT0pBMkRNWkgzSk1YUlVDMk9WRUZISUlWSldZRkY3WFlDRTJWRkE9PT09IiwiaXYiOiJBN0ZNM01aQlhONUpKVkZOREFIQ1BHR0ZLRT09PT09PSIsInYiOjF9; _gid=GA1.2.1568022408.1548955810; BIGipServerDev-Portal-JBoss-8082=2550857738.37407.0000; _fbp=fb.1.1549050623487.427684470; _dc_gtm_UA-17384372-1=1; _gat=1; _gat_UA-17384372-1=1";
	final static Client client = ClientBuilder.newBuilder().build();
	
	public static void callGetCustomerShippingAddress(){	
			
				
		        
		WebTarget target = client.target(config.get("TestRoot") + ENDPOINT + "shipping");
		
		//target.path(config.get("TestRoot") + "/Customer/" +customerId);		
		Response response = target.request()
								   //.header("Origin", config.get("origin"))
								   .accept(MediaType.APPLICATION_JSON)								   
								   .get();
		
		System.out.println(response.getStatus());
		String output = response.readEntity(String.class);
		System.out.println(output);
        //final AddressXML address = response.readEntity(AddressXML.class);        
        //System.out.println(address.getAddressLine1());       
        
        response.close();  // You should close connections!		
	}
	
	public static void callGetCustomerOrderSecured(){
					
		//Client client = ClientBuilder.newBuilder().build();		
		        
		WebTarget target = client.target(config.get("ApiRoot") + CUSTAPI_ENDPOINT);
		
		//target.path(config.get("TestRoot") + "/Customer/" +customerId);		
		Response response = target.request()
								   .header("Origin", config.get("origin"))
								   .header("Cookie", COOKIE)
								   .accept(MediaType.APPLICATION_JSON)								   
								   .get();
		
		System.out.println(response.getStatus());
		String output = response.readEntity(String.class);
		System.out.println(output);
        //final Order order = response.readEntity(Order.class);        
        //System.out.println(order.getOrderId());       
        
        response.close();  // You should close connections!		
	}
	
	//PUT
	public static void updateShippingAddress(){
		
		WebTarget target = client.target(config.get("ApiRoot") + CUSTAPI_ENDPOINT + "shipping");
		final AddressXML shipping = new AddressXML();
		{
			shipping.setTitle("RestClient-Title");
			shipping.setName("RestClient-TESTName");
			shipping.setFirstName("RESTClient-FName");
			shipping.setLastName("RESTClient-LName");
			shipping.setAddressLine1("RESTClient-AddressLine1");
			shipping.setCity("Memphis");
			shipping.setCountry("USA");
			shipping.setPostalCode("38016");
			shipping.setPhone("1234567890");
			shipping.setClean(true);
			shipping.setEmail("RESTClient.test@test.com");
			
		}
		Response response =  target.request()
								   .header("Origin", config.get("origin"))
								   .header("Cookie", COOKIE)
								   .accept(MediaType.APPLICATION_JSON)
								   .put(Entity.entity(shipping, MediaType.APPLICATION_JSON));
		System.out.println(response.getStatus());
		String output = response.readEntity(String.class);
		System.out.println(output);
	}
}
