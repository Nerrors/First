package Basics;


public class StringMethods {

	public static void main (String[] args) {
		String a = "Γεια σου τι κάνεις";
		String b = "Καλά είμαι";
		
		System.out.println(a);
		System.out.println(b);
		System.out.println ("-----------------------------");
		
		//Boolean
		
		if (a.isEmpty() == false) {
			System.out.println("Το String a δεν είναι άδειο");
		}
		
		if (a.equals(b) == true) { // Είναι περιττό σε αυτή την περίπτωση το ==true. Συγκρίνει αυτή την συμβολοσειρά με ένα καθορισμένο αντικέιμενο (Object object);
			System.out.println("Το String a είναι ίδιο με το b.");
		}
		if (a.matches("Το Γεια ταιριάζει με το String a")) {
			System.out.println("Το Γεια ταιριάζει με το String a");
		}
		if (a.endsWith("ς")) { // Θέλει string.
			System.out.println ("Η συμβολοσειρά a τελειώνει με την συμβολοσειρά ς");
		}
		if (a.startsWith("Γεια")) { // Θέλει string.
			System.out.println ("Η συμβολοσειρά a αρχίζει με την συμβολοσειρά Γειά");
		}
		if (a.startsWith("σου", 2)) { // Με αυτόν τον αριθμό μπορούμε να ορίσουμε και ένα offset.
			System.out.println ("Η συμβολοσειρά a αρχίζει με την συμβολοσειρά Γειά");
		}
		
		
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		
		System.out.println(a.replace('α', 'c'));
		System.out.println(a.replaceAll("Γεια", "τι κανεις"));
		
		// int
		
		int c = a.length(); // Το χρησιμοποιούμε πολύ στο for.
		int h = a.hashCode();
		System.out.println ("Το μήκος είναι" + c + " Το Hash code είναι" + h);
		
		int l = a.compareTo(b); // Προσοχή μας επιστρέφει έναν Interger τύπο.
		int l2 = a.compareToIgnoreCase(b);
		System.out.println("To l είναι " + l + " Το l2 είναι " + l2);
		
		// char[]
		
		char [] ar;
		ar = a.toCharArray();
		for (int i =0; i <ar.length; i++) { // Δεν μπροούμε να χρησιμοποιήσουμε την μέθοδο .length() επειδή διαβάζει μόνο String arrays.
			System.out.print (ar[i]);
		}
	}
}