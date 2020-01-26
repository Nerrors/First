package IO2;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class PrintWriterAndScanner2Example {

	public static void main (String [] args) {
		
	Scanner sc = null; // Αλλιώς δεν μπορούμε να το δούμε έξω από το try-cacth.
		
	System.out.println("Δώσε το όνομα του αρχείου");	
	Scanner scan = new Scanner (System.in);
	String filename = scan.nextLine();
	
	try {
	sc = new Scanner (new File(filename));	
	}
	catch (FileNotFoundException e) {
		System.out.println(e.getMessage());		
}
	while (sc.hasNextLine()) {
		System.out.println(sc.nextLine());
		
	}
}
	}


// Υπάρχουν και οι μέθοδοι:

//hasNextDouble()
//hasNextLine()...
