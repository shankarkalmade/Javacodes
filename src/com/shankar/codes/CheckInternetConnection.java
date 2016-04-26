package com.shankar.codes;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;

public class CheckInternetConnection {

	public static void main(String[] args) {
		
		
		URL uri;
		try {
			uri = new URL("http://www.google.com");
			URLConnection connection = uri.openConnection();
			
			connection.connect();
			
			System.out.println("Connection succesful");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
	}
	
	
}
