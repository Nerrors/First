package Io;

import java.io.EOFException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class ObjectOutputStreamClass {

	private ObjectInputStream ois = null; //***** μέσα σε μια public μέθοδο, δεν μπορούμε να έχουμε private μεταβλητές.
	private ObjectOutputStream oos = null; 
	
// Επειδή δεν χρησιμοποιούμε κανέναν κατασκευαστή, χρησιμοποιείται ο προεπιλεγμένος.
	
	public void connectToOutputFile() {
		try {
			Scanner s = new Scanner (System.in);
			String ss = s.nextLine();
			oos = new ObjectOutputStream (new FileOutputStream (new File (ss)));
			
		}
		catch (IOException e) {
			System.out.println("Problem");
			System.out.println(e.getMessage());
			
		}
	}
	
	public void connectToInputFile() {
		try {
			Scanner s = new Scanner (System.in);
			String ss = s.nextLine();
			ois = new ObjectInputStream (new FileInputStream (new File (ss)));
			
		}
		catch (FileNotFoundException e) { // ***Αυτό θα πρέπει αναγκαστικά να μπεί πάνω από το IOException.
			System.out.println("Problem");
			System.out.println(e.getMessage());
			
		}
		catch (IOException e) {
			System.out.println("Problem");
			System.out.println(e.getMessage());
			
		}
	}
	
	public void closestreams () {
		
		try {
		ois.close();
		oos.close();
		}
		
		catch (IOException e) {
			System.out.println("Problem");
			System.out.println(e.getMessage());
	}
	}
	
	
	public void output () { // Είναι void και δεν επιστρέφει τίποτα, γιατί με την System.out.println(); τα μεταφέρουμε κατευθεία στην κονσόλα.
		
	try {
		while (true) {
			String t = ois.readUTF();
			System.out.println(t);
		}	
	}
	catch (IOException e) {
		System.out.println("Problem");
		System.out.println(e.getMessage());
		
	}
	}
	
	
	
	public static void main (String[] args) {
		ObjectOutputStreamClass objectclass = new ObjectOutputStreamClass ();
	
		objectclass.connectToOutputFile();
		objectclass.connectToInputFile();
		objectclass.output();
		objectclass.closestreams();
	}

	
	
}

/* Οι κλάσεις ObjectInputStream και ObjectOutputStream επιτρέπουν την υλοποίηση Ε/Ε για αντικείμενα.
 * 
 * Οι ObjectInputStream και ObjectOutputStream παρέχουν όλες τις λειτουργίες των κλάσεων
 * DataInputStream και DataOutputStream, επομένως μπορούν να τις αντικαταστήσουν πλήρως.
 * 
 * Επιπλέον, υλοποιεί τα interfaces ObjectInput και ObjectStreamConstants
 * Η ObjectInput είναι μια υπο-διεπαφή της DataInput.
 */