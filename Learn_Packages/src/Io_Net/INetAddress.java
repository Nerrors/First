package Io_Net;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class INetAddress {

public static void main (String[] args) {
	
	for (int i=0; i<args.length; i++) {
		try {
		InetAddress inet =  InetAddress.getByName(args[i]);
		
		System.out.println(inet.getHostName());
		System.out.println(inet.getHostAddress());
	
		}	
		catch (UnknownHostException ex) {
			System.err.println("Unknown host or IP Address");
			}
		}
	}
}
