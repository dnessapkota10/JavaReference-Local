package com.home.socket;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.URL;
import java.net.URLConnection;

public class HostServerRunningTest {

	final static String SERVER_ADDRESS = "https://ps.gcsip.nl/wdl/wdl";
	final static int TCP_SERVER_PORT = 443;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//System.out.println("Is Host " + SERVER_ADDRESS + ":" + TCP_SERVER_PORT + " running? " +hostAvailabilityCheck());
		
     
		System.out.println("Is Host " + SERVER_ADDRESS + ":" + TCP_SERVER_PORT + " running? " +getStatus(SERVER_ADDRESS));
		
	}
	
	public static boolean pingHost() {
	    try (Socket socket = new Socket()) {
	        socket.connect(new InetSocketAddress(SERVER_ADDRESS,TCP_SERVER_PORT), 1000);
	        return true;
	    } catch (IOException e) {
	        return false; // Either timeout or unreachable or failed DNS lookup.
	    }
	}
	
	public static boolean hostAvailabilityCheck() { 
	    try (Socket s = new Socket(SERVER_ADDRESS, TCP_SERVER_PORT)) {
	        return true;
	    } catch (IOException ex) {
	        /* ignore */
	    }
	    return false;
	}
	
	public static String getStatus(String url) throws IOException {
		 
		String result = "";
		int code = 200;
		try {
			URL siteURL = new URL(url);
			HttpURLConnection connection = (HttpURLConnection) siteURL.openConnection();
			connection.setRequestMethod("GET");
			connection.setConnectTimeout(3000);
			connection.connect();
 
			code = connection.getResponseCode();
			if (code == 200) {
				result = "-> Green <-\t" + "Code: " + code;
				;
			} else {
				result = "-> Yellow <-\t" + "Code: " + code;
			}
		} catch (Exception e) {
			result = "-> Red <-\t" + "Wrong domain - Exception: " + e.getMessage();
 
		}
		System.out.println(url + "\t\tStatus:" + result);
		return result;
	}

}
