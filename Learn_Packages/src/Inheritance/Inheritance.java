
package Inheritance;

public class Inheritance {
public static void main (String [] args) {
	
	
	//Student_extend_Person l2 = new Student_extend_Person ("sdffg", 16723);
	Person l2 = new Student_extend_Person ("sdff2", 123);
	Person l3 = new Undergraduate_extends_Student ("sdff", 123, 546); // Στον πολυμορφισμό, δεν παίζει ρόλο ο τύπος αλλά η κλάση στο new.
	Person l4 = new Person ("Test");// Έτσι μπορούμε να πάρουμε μόνο τις μεθόδους της Person επειδή new Person ("", ...);
	// l.setStudentNumber (123);
	l3.writeOutput(); // Εδώ έχουμε πολυμορφισμό. Δηλαδή, πολλαπλές έννοιες στο ίδιο όνομα μεθόδου.
	System.out.println (l2.getName()); //Προσοχή εδώ στα αποτελέσματα. Εάν βάλουμε μια μέθοδο που να δηλώωει την Name με κάποιο άλλο όνομα τότε και η κλάση Student_extend_Person και η Undergraduate_extends_Student  θα έχουν αυτό το όνομα, ακόμη και αν το αλλάξουμε στους κατασκευαστές τους. 
	System.out.println (l3.getName());
	//Αυτό δεν γίνεται System.out.println(l4.getStundentNumber ());
	System.out.println(l4.getName ());// Δεν μπορούμε να δημιουργήσουμε ένa αντικείμενο Person και να καλέσουμε την μέθοδο της Undergraduate_extends_Student.

}
}

// Αν δημιουργήσουμε μια getName και της αλλάξουμε το όνομα μόνο στην κλάση Student_extends_Person, θα πάει και στην Undergraduate_extends_Student, και ας την αλλάξουμε στον κατασκευαστή.
// Αυτό πρέπει να το κοιτάξω.