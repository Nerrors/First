package Inheritance;

import Collection.LinkedList1_1ExampleClass;

public class FirstClass {
	public static String data;
	public static int link;


	//Constructor
	public FirstClass (String newdata, int newlink) {
	    data = newdata;
	    link = newlink;
	}

	//Get-Set (4) Methods

//*****Από την στιγμή που θέλουμε να δημιουργήσουμε μια static μέθοδο, θα πρέπει να είναι static και η μέθοδος που θα χρησιμοποιήσουμε
//***** Επιπλέον, μια static μέθοδος, δεν μπορεί να αναφέρεται σε μια non-static.	
	
	public static void setData(String newdata) {
	    data = newdata;
	}
	public String getData() {
	    return data;
	}
	public void setLink(int newlink) {
	    link = newlink;
	}
	public int getLink() {
	    return link;
	    }
	public String toString() {
		return data + link;
	}
}

