package Collection;

import java.util.ArrayList;

public class ArrayList4_2ExampleClass {

public static void main (String[] args) {
	
	ArrayList <ArrayList4_1ExampleClass> ar = new ArrayList<>();
	ArrayList4_1ExampleClass arlec = new ArrayList4_1ExampleClass("xczx", 67);
	ArrayList4_1ExampleClass arlec2 = new ArrayList4_1ExampleClass("bxczx", 69);
	ar.add(arlec); // ******Βάζει μέσα στην λίστα, τα στοιχεία που βρίσκονται μέσα στην toString
	ar.add(arlec2);
	
	System.out.println(ar);
	
	// Όπως γνωρίζουμε, η μέθοδος toArray() επιστρέφει έναν πίνακα που περιέχει όλα τα στοιχεία (elements) αυτής της λίστα, με την σωστή σειρά.
	
	Object[] obj = ar.toArray();
	for (Object objs : obj) {
		System.out.println(objs + " ");
	}
	
	}

}
