package Io;

import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.util.Scanner;

public class PrintWriterProgram {
	
	public static void main (String [] args) {
	String g;
		try {
		PrintWriter printwriter = new PrintWriter 
				(new FileOutputStream 
					(new File ("C:\\Users\\Aleksandros\\Documents\\maya\\projects\\default\\images\\tet.txt"),true));
		// Χρησιμοποιούμαι την κλάση FileOutputStream για το δεύτερο όρισμα, το true.
	
		Scanner user = new Scanner (System.in);
		System.out.println("Give a String ");
		String l = user.nextLine();
		
		printwriter.println(l); // Με αυτή την μέθοδο της κλάσης PrintWriter, εισάγουμε το String στο αρχείο.
		
		Scanner scan = new Scanner (new FileInputStream (new File ("C:\\\\Users\\\\Aleksandros\\\\Documents\\\\maya\\\\projects\\\\default\\\\images\\\\test.txt")));
	    //Διάβασε όχι από το πληκτρολόγιο, αλλά από ένα αρχείο.
		while (scan.hasNextLine()) {
			 g = scan.nextLine();
			System.out.println(g);
		}
		scan.close();
		}
		catch (FileNotFoundException e){
			System.out.println("Error");
			System.exit(0);
		}
		
	}
}

/* Την PrintWriter την χρησιμοποιούμαι για αρχεία κειμένου.
 * 
 * Ορισμός: Εκτυπώνει μορφοποιημένες παραστάσεις αντικειμένων σε μια ροή, εξόδου κειμένου.
 * 
 * Έχει τις εξής επιπλέον μεθόδους.
 * 
 * 
 */


/*            ***File-Methods***
 *  canRead();
 *  canWrite();
 *  delete();
 *  exists();
 *  getName();
 *  getPath();
 *  length();
 */
