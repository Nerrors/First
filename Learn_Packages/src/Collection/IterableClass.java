package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IterableClass {
	/* ****Μια συλλογή είναι τύπου Iterable. Μπορούμε να χρησιμοποιήσουμε ένα αντικείμενο Iterator για να διασχίσουμε όλα τα στοιχεία της συλλογής.
	 * 
	 * Το Interface Iterator είναι ένα κλασικό παράδειγμα διάσχισης μιας δομής δεδομένων,
	 * χωρίς να είναι απαραίτητο να δείξουμε τον τρόπο αποθήκευσης των δεδομένων.
	 * 
	 * Η μέθοδος iterator() της διεπαφής Interable επιστρέφει ένα αντικείμενο τύπου Iterator.
	 * 
	 */
	
	public static void main (String[] args) {

	ArrayList <Integer> ari = new ArrayList<>();
	
	ari.add(10);
	ari.add(560);
	ari.add(56);
	ari.add(10234);
	
	Iterator<Integer> iter = ari.iterator();
	while (iter.hasNext()) {
		System.out.println(iter.next());
		
	}
	}	
}
