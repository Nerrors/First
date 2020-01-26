package Inheritance;

public class SecondClassExtendsFirst extends FirstClass {
	
	private String g;
	
	public SecondClassExtendsFirst (String s, int i, String g) {
		super(s, i);
		this.g = g;
	}

	public String toString() {
		
		return data ;
	}
}

//Εάν η μεταβλητή είναι private, δεν μπορούμε να την προσπελάσουμε (ακόμη και αν αυτή η κλάση κάνει extends την FirstClass)

/*
Εάν αυτή η κλάση κάνει extends την FirstClass, και είναι public η μεταβλητή,
τότε μπορούμε να προσπελάσουμε την μεταβλητή γράφοντας date;
*/

/*
Εάν αυτή η κλάση δεν κάνει extends την FirstClass, και η μεταβλητή είναι static,
τότε μπορούμε να προσπελάσουμε την μεταβλητή γράφοντας FirstClass.date;
*/

/*
Εάν αυτή η κλάση κάνει extends την FirstClass, αλλά και η μεταβλητή είναι static,
τότε μπορούμε να την προσπελάσουμε και με τους δύο παραπάνω τρόπους. (Είναι κάπου χρήσιμη αυτή η περίπτωση?)
*/