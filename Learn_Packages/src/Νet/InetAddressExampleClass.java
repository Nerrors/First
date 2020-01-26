package Νet;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressExampleClass {

	public static void main (String [] args) {
		
		try {
			
		InetAddress inet1, inet2;
		InetAddress [] inet3;
		
// Η μέθοδοι getByAddress(byte[] addr), getByAddress(String host, byte[] addr), getAllByName(String host), getByName(String host),επιστρέφουν static InetAddress.
		
	// getByName -> Καθορίζει την διεύθυνση IP ενός κεντρικού υπολογιστή.
	// getHostAddress -> Επιστρέφει τη συμβολοσειρά διεύθυνσης IP σε παρουσίαση κειμένου.
	
	 
	// Παίρνω IP, από ένα δεδομένο DNS/Hostname.	
	inet1 = InetAddress.getByName("www.codejava.net");
	 System.out.println(inet1.getHostAddress());
	 
	 
	 // Παίρνω Host από την IP του.
	 inet2 = InetAddress.getByName("8.8.8.8");
	 System.out.println(inet2.getHostName());
	 
	 //Δημιουργία λίστας με όλες τις IP διευθύνσεις, που σχετίζονται με ένα  DNS/Hostname.
	 inet3 =InetAddress.getAllByName("google.com");
	 for (InetAddress addr: inet3) {					// Προσοχή με αυτή την for.
		 System.out.println(addr.getHostAddress());
	 }
		
		}
		catch (UnknownHostException e) {
			System.out.println("Error");
			
		}
	}
}
