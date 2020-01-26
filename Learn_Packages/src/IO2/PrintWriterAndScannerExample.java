package IO2;

import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileOutputStream;

public class PrintWriterAndScannerExample {

	
	public static void main (String[] args) {
		
		PrintWriter pw = null; // Θα πρέπει να το γράψουμε εδώ, για να μπορούμε να το δούμε και μετά το cache.
		
		System.out.println("Δώσε αρχείο");
		Scanner scan = new Scanner (System.in);
		String name = scan.nextLine();
		
		
		try { // Try- cacth για το Exception
			pw = new PrintWriter (new FileOutputStream(name, true)); // Το γράφουμε έτισ για να μπορούμε σε ένα ήδη υπάρχον αρχείο, το νέο κείμενο να γραφτεί μετά το παλιό κείμενο.
		}
		catch (FileNotFoundException e) {
			System.out.println(e.getStackTrace());
		}
		
		// Μετά από αυτό, γράφουμε στο αρχείο.
		
		Scanner sc = new Scanner (System.in);
		pw.println (sc.nextLine());
		pw.close();
			
	}
	
	//********
	// Άρα γενικά, στα αρχεία κειμένου, χρησιμοποιούμε την PrintWriter για να ΓΡΑΨΕΙ κάτι (ΕΞΟΔΟΣ)
	// και την Scanner για να ΔΙΑΒΑΣΕΙ κάτι (ΕΙΣΟΔΟΣ). είτε είναι κείμενο στο System είτε κάτι από αρχείο.
	
}
