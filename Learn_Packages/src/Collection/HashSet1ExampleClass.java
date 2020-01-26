package Collection;

import java.util.HashSet;

public class HashSet1ExampleClass {

		public static void main (String[] args) {
		
		HashSet<String> hsi = new HashSet<>();
		
		hsi.add("hkgjhg");
		hsi.add("hkgjhg");
		hsi.add("hkgjhg");
		hsi.add("hkgjhg");
		hsi.add("hkgjhg");
		
		//***Επειδή δεν υπάρχει κάποια standard σειρά, δεν ισχύουν και οι παρακάτω μέθοδοι που λειτουργούν με indexes.
		
		//hsi.set(2, 7);
		//hsi.get(2);
		//hsi.remove(2);
		
		//Με αυτόν τον τρόπο, μπορούμε να διαγράψουμε ένα στοιχείο.
		hsi.remove(String.valueOf("hkgjhg"));
		// Αυτή την μέθοδο την έχουμε ξαναδεί όταν θέλαμε να μετατρέψουμε ένα String σε int τιμή. Ένας άλλος τρόπος είναι να χρησιμοποιήσουμε την μέθοδο intValue();
		
		System.out.println(hsi);
		}
	}
