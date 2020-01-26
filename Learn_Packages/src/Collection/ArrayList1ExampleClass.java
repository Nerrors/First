package Collection;

import java.util.ArrayList;

public class ArrayList1ExampleClass {
	static ArrayList<Integer>  ari; // Μπορούμε και να μην το γράψουμε το <Integer>.
	
	public static void main (String[] ars) {
		
	ari = new ArrayList<>();
	ari.add(10); // index = 0, element = 1.
	ari.add(560);
	ari.add(56);
	ari.add(10234); // index = 3, element = 4.

		//3 ΔΙΑΦΟΡΕΤΙΚΟΙ ΤΡΟΠΟΙ ΓΙΑ ΤΗΝ ΕΜΦΑΝΙΣΗ ΜΙΑΣ ΛΙΣΤΑΣ.
		System.out.println(ari);
		getSet1(ari);
		getSet2(ari);
		getSet3();
}
	
	public static void getSet1 (ArrayList <Integer> v) {
		for (int i = 0; i<v.size(); i++) {
			System.out.println(v.get(i)); 
		}
	}
	public static void getSet2 (ArrayList <Integer> v) {
		for (Integer in : v) {
			System.out.println(in); 
		}
	}
	
	public static void getSet3 () {
	
	Object[] obj = ari.toArray(); // Μετατρέπουμε ένα  ArrayList σε ένα array. // Υπενθύμιση, για να μετατρέψουμε ένα String σε ένα array, χρησιμοποιούμαι την μέθοδο: char[] a = <Stringname>.toCharArray(); 
	for (Object objs : obj) {
		System.out.println(objs + " ");
	}
}
}


//ΑΠΟΡΙΕΣ

// Τι επιστρέφει η v.get(i);
//Για παράδειγμα μπορεί να μην θέλουμε να χρησιμοποιήσουμε την sysout μέσα στην μέθοδο.