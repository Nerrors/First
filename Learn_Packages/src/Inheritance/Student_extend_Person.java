package Inheritance;
public class Student_extend_Person extends Person {
private int studentNumber = 20;
private String name = "dcsadcds";
private Person l;
public Student_extend_Person ()
{
super();
studentNumber = 0;
}
public Student_extend_Person (String newName, int b) {
	super(newName); // ΠΡΟΣΟΧΗ: ΘΑ ΠΡΕΠΕΙ ΝΑ ΕΧΟΥΜΕ ΤΟ ΙΔΙΟ ΟΝΟΜΑ ΜΕ ΤΗΝ ΜΕΤΑΒΛΗΤΗ ΤΟΥ CONSTRUCTOR ΠΑΤΕΡΑ.
	
	studentNumber = b;
}

public void reset (String s, int newStudentNumber) { // ΠΡΟΣΟΧΗ: ΘΑ ΠΡΕΠΕΙ ΝΑ ΕΧΟΥΜΕ ΤΟ ΙΔΙΟ ΟΝΟΜΑ ΜΕ ΤΗΝ ΜΕΤΑΒΛΗΤΗ ΤΟΥ ΠΑΤΕΡΑ.
	setName(s); // Χρησιμοποιούμε το όνομα της μεθόδου αντί της μεταβλητής. Σε αντίθετη περίπτωση θα είχαμε: name = s;
	studentNumber = newStudentNumber;
}
public int getNam (int g) {
	//***setB(g); Εάν θέλουμε να αλλάξουμε με μέθοδο την μεταβλητή B της κλάσης Person.
	//*** Ένας άλλος τρόπος για να αλλάξουμε τις μεταβλητές μιας κλάσης μέσα σε μια άλλη κλάση θα πρέπει να κάνουμε το εξής: public void setbb (Person c) { this.c = c;  } .. Δηλαδή μέσω του Constructor της κλάσης Person για παράδειγμα.
	System.out.println(b);//Αυτή η εντολή δεν είναι αποδεκτή εάν η μεταβλητή είναι private (επειδή δεν μπορεί να βρεί μεταβλητή στην κλάση που επεκτείνει). Για να είναι αποδεκτή θα πρέπει να είναι public.
	return getB();
	// Μπορούμε με την εντολή super να κάλέσουμε με μέθοδο της κλάσης Person.
}

public int getStundentNumber () {
	return studentNumber;
}
public void setStudentNumber (int newStudentNumber) {
	studentNumber = newStudentNumber;
}
public void writeOutput2() {
		super.writeOutput();
		System.out.println("Student Number:" + studentNumber + getB());
}
}

/* ΠΡΟΣΟΧΗ ΚΑΝΟΝΑΣ: Η πολλαπλή κληρονομικότητα στην Java δεν επιτρέπεται.
 * Εξαιρέθηκε από την γλώσσα ως απόφαση σχεδίου, για να αποφευχθούν οι κυκλικές εξαρτήσεις.
 * 
 * Όμως μια κλάση έχει την δυνατότητα να υλοποιήσει παραπάνω από ένα interface.
 * 
 * 
 */
