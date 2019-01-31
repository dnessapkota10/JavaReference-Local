package com.home.rest.client;

import java.util.Properties;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import com.home.pojo.Customer;

//https://docs.jboss.org/resteasy/docs/3.0-beta-3/userguide/html/RESTEasy_Client_Framework.html
//https://www.programcreek.com/java-api-examples/?api=org.jboss.resteasy.client.jaxrs.ResteasyClient
public class CustomerRestClient {

	public static void callGetCustomer(){
		final Properties config = RestClientConfiguration.getRestConfig(); 
		final String customerId = "1430991";
			
		Client client = ClientBuilder.newBuilder().build();		
		        
		WebTarget target = client.target(config.get("TestRoot") + "/customer/" +customerId);
		
		//target.path(config.get("TestRoot") + "/Customer/" +customerId);		
		Response response = target.request()
								   .header("Origin", config.get("origin"))
								   //.accept(MediaType.APPLICATION_JSON)								   
								   .get();
		
		System.out.println(response.getStatus());
		String output = response.readEntity(String.class);
        //final Customer customer = response.readEntity(Customer.class);
        
        System.out.println(output);
        
        
        response.close();  // You should close connections!
		
	}
	
}
