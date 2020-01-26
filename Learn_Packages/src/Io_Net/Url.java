package Io_Net;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.File;
import java.util.Scanner;
import java.net.URL;

public class Url {
	
	public static void main (String [] args) {
		try {
		ObjectOutputStream oos = new ObjectOutputStream (new FileOutputStream (new File ("C:\\Users\\Aleksandros\\Documents\\maya\\projects\\default\\images\\Wikipedia.txt")));	
	URL wiki = new URL ("https://www.google.gr/"); // Υπάρχει η μέθοδος: openStream(); Για να διαβάσουμε τα περιεχόμενα της σελίδας.
	
	Scanner s = new Scanner (new InputStreamReader(wiki.openStream())); // διαβάζει τα δεδομένα μέσα από την ιστοσελίδα.
	while (s.hasNextLine()) {
		String line = s.nextLine();
		oos.writeUTF(line);
		System.out.println(line); // Μας εμφανίζει τον πηγαίο κώδικα
	}
	
ObjectInputStream ois = new ObjectInputStream (new FileInputStream (new File ("C:\\Users\\Aleksandros\\Documents\\maya\\projects\\default\\images\\Wikipedia.txt")));

System.out.println(ois.readUTF()); // Και αυτό μας εμφανίζει τον πηγαίο κώδικα.

String path = wiki.getPath();
int port = wiki.getPort();
String host = wiki.getHost();
Object content = wiki.getContent();
String userinfo = wiki.getUserInfo();
String filename = wiki.getFile();
System.out.println(path + " " + port + " " + host + " " + userinfo + " " + filename);

		}
		catch (FileNotFoundException e) {
			System.out.println("FileNotFound");
		}
		catch (IOException e) {
			System.out.println("IOException");
			
		}
		}

}
