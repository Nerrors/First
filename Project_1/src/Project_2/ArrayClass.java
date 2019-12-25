package Project_2;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ArrayClass {
public static void main(String[] args)  throws Exception{

	// Η μέθοδος asList χρησιμοποιείται για να επιστρέψει μια fixed-size list που υποστηρίζεται από τον καθορισμένο πίνακα.
	//*****Δηλαδή, αυτή η μέθοδος λειτουργεί ως γέφυρα μεταξύ των array-based και collection based APIs, σε συνδυασμό με την Collections.toArray().
	try {
	Integer name0[] = {10, 20, 30, 40}; // Και όχι int, επειδή ένα collection δεν μπορεί να δεχτεί θεμελιώδεις τύπους.
	List<Integer> list = Arrays.asList(name0);
	System.out.println(list);
	}
	catch (NullPointerException e) {
		System.out.println(e.getStackTrace());
	}
	
	// Η παρακάτω μέθοδοι, ταξινομεί έναν πίνακα και κάνει binarySearch για να βρεί το στοιχείο στο δεδομένο index.
	
	int name[] = {10, 20, 30, 40};
	
	Arrays.sort(name);
	System.out.println("Found At Index" + Arrays.binarySearch(name, 2));
	
	//Η παρακάτω μέθοδος, συγκρίνει δύο πίνακες αν πέρασαν ως παράμετροι λεξικογραφικά.
	
	int name1[] = {10, 20, 34, 40};
	int name2[] = {10, 20, 34, 40};
	
	System.out.println(Arrays.compare(name1, name2));
	
	// Η μέθοδος equals(array1, array2) ελέγχει αν και οι δύο πίνακες είναι ίσοι ή όχι.
	
	int name3[] = {10, 20, 34, 40};
	int name4[] = {10, 20, 34, 40};
	System.out.println(Arrays.equals(name2,name3));
	
	
	// Η μέθοδος copyOf αντιγράφει τον καθορισμένο πίνακα, κόβοντας ή γεμίζοντας με μηδενικά (αν είναι απαραίτητο) έτσι ώστε το αντίγραφο να έχει το καθορισμένο μέγεθος.
	
	int name5[] = {10, 20, 34, 40};
	
	System.out.println(Arrays.toString(name5));
	System.out.println(Arrays.toString(Arrays.copyOf(name5,20)));
	
	// Υπάρχει και η παρόμοια μέθοδος copyOfRange (originalArray, fromIndex, endIndex).

	// Η μέθοδος fill(arrayname, fillvalue) εκχωρεί/ αναθέτει σε κάθε index του πίνακα, την fill τιμή (fillValue).

	int name6[] = {10, 20, 34, 40};
	Arrays.fill(name6,40);
	System.out.println(Arrays.toString(name6)); 
	}
}
