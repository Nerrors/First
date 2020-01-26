package Inheritance;

public class Person {
private static String name;
public int b;

public Person () { // First Constructor
	name = "No name yet";
	b = 0;
}
public Person (String newName) { // Second Constructor
 name = newName;
	b = 30;
}

/* Εάν ορίσουμε έναν κατασκευαστή τότε δεν θα είναι ο προεπιλεγμένος.
 * Εάν δεν δημιουργήσουμε κατασκευαστή, παράγεται αυτόματα ο προεπιλεγμένος κατασκευαστής που δεν λαμβάνει πραμέτρους.
 * Τα πεδία που είναι μη-αρχικοποιημένα, θα οριστούν στις προεπιλεγμένες τιμές τους (0,  null...).
 * 
 * Εάν βάλουμε όμως έναν κατασκευαστή δικό μας, τότε χάνεται ο προεπιλεγμένος.
 */


//System.out.println("fdgdfg"); Δεν μπορούμε να γράψουμε εντολές, εξαιρείται η δήλωση μεταβλητών) εκτός από το εσωτερικό μιάς μεθόδου (και μετά (εάν επιστρέφει κάτι η μέθοδος) την λέξη return;).
//int g; Για παράδειγμα, αυτή η εντολή επιτρέπεται.
public int getB() {
	return b;
}

public void setB(int b) {
	this.b = b;
}
public String getName() { // First Method
	return name;
	}
public static void setName(String a) { //Second Method
	name = a;
	}
public void writeOutput () { // Third Method
	System.out.println("Το όνομα είναι"+ getName());
}

public static void main (String [] args) {
	
	Person l2 = new Student_extend_Person ("sdff2", 123);
	setName("dsfsdfs");
}





// Η Person δεν μπορεί να χρησιμοποιήσει μια μέθοδο της Student_entend_Person ή της Undergraduate_extends_Student.
// Το αντίστροφο γίνεται.

//ΠΡΟΣΟΧΗ: Δημιουργούμε τους getters, και setters επειδή, δεν μπορούν οι κλάσεις που τις επεκτείνουν να πάρουν τις μεταβλητές τους κατευθείαν (παρά μόνο τις μεθόδους) σε αντίθεση με τις abstract κλάσεις και τα interfaces: (k = μεταβλητή του interface) σε άλλη μέθοδο int k = b; ή στην main int k = <Interface_Name>.b;
}
