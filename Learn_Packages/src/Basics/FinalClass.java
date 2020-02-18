package Basics;

public class FinalClass {
	
	final int a= 30; // 1) Θα πρέπει αναγκαστικά να είναι static γιατί το χρησιμοποιούμαι σε μια static μέθοδο.
	
	/*
	int g;
	g = 50; Προφανώς αυτό δεν γίνεται, γιατί εδώ ο χώρος είναι μόνο για δηλώσεις και direct αρχικοποιήσεις.
	 */
	
	/* ΓΙΑ ΠΑΡΑΔΕΙΓΜΑ ΑΥΤΟ ΜΠΟΡΟΥΜΕ ΝΑ ΤΟ ΚΑΝΟΥΜΕ.
	 	int k;
	{
		k = 50;
	} 
	 */
	
	
	final int b; // 2) A blank final variable.
	{
		b = 50;
	}
	
	static final int c; // 3) A blank static final variable.
	static{
		c = 80;
	}
	
	final int d; // 4) Constructor for initializing
	
	public FinalClass(int d) {
		this.d = d;
	}
	
	
	public static void main(String[] args) {
		// a = 30;
		
		final int k; //ΣΕ ΑΝΤΙΘΕΣΗ ΜΕ ΠΡΙΝ, ΕΔΩ ΜΠΟΡΟΥΜΕ ΝΑ ΤΟ ΚΑΝΟΥΜΕ ΑΥΤΟ. 
		k = 30;
		
	}
}

/*
 * Final Variables ->  Για να δημιουργήσουμε σταθερές.
 * 
 * Final Methods -> Για να αποτρέψουμε το method overriding.
 * 
 * Final Classes -> Για να αποτρέψουμε την κληρονομικότητα.
*/