package Íet;

import java.net.MalformedURLException;
import java.net.URL;


public class URLExampleClass {
	
	public static void main (String[] args) throws MalformedURLException {
		
		URL urlname = new URL ("https://www.youtube.com/watch?v=1ekZEVeXwek&list=RDkN0iD0pI3o0&index=3");
		
		System.out.println("URL: " + urlname.toString());
		System.out.println("Protocol: " + urlname.getProtocol());
		System.out.println("Host: " + urlname.getHost());
		System.out.println("Default Port: " + urlname.getDefaultPort());
		System.out.println("Query: " + urlname.getQuery());
		System.out.println("Path: " + urlname.getPath());
		System.out.println("File: " + urlname.getFile());
	}

}
