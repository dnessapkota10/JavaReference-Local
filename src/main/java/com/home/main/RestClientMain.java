package com.home.main;

import com.home.rest.client.CustomerRestClient;

public class RestClientMain {

	public static void main(String[] args){
		//Get Customer		
		CustomerRestClient.callGetCustomerOrderSecured();
		CustomerRestClient.updateShippingAddress();
		CustomerRestClient.callGetCustomerShippingAddress();
	}
}
