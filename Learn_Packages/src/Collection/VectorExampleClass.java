package Collection;

import java.util.Vector;

/* Η κλάση Vector, είναι παρόμοια με την ArrayList με την διαφορά ότι περιέχει συγχρονισμένες
 * μεθόδους προσπέλασης και τροποποίησης του vector.
 * 
 * Οι συγχρονισμένες μέθοδοι, αποτρέπουν την κατάστρεψη των δεδομένων, όταν προσπελαύνονται και
 * τροποποιούνται από δύο ή περισσότερα νήματα.
 * 
 * 
 */

public class VectorExampleClass {

	public static void main (String[] args) {
		
		Vector<String> vec = new Vector<>(20);
		
		vec.addElement("dsfsdf");
		vec.add("dsfsdf");
		
		System.out.println(vec);
	}
	
}
