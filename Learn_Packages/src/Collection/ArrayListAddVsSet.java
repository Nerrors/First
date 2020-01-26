package Collection;

import java.util.ArrayList;

public class ArrayListAddVsSet {

	public static void main (String[] args) {
		
		ArrayList<String> ar  = new ArrayList<>();
		ar.add("Kwstas");
		ar.add("Angelikh");
		ar.add("Bibh");
		ar.add("Aleksandros");
		
		System.out.println(ar);
		ar.set(0, "Giannis");
		System.out.println(ar);
		
		//ar.set(4, "Orestis"); ******Δεν επιτρέπεται.
		//Με την set, δεν μπορούμε να προσθέσουμε στοιχείο.
	}
}
