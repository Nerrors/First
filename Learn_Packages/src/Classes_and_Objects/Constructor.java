package Classes_and_Objects;

public class Constructor {
public static void main (String [] args) {
	Main Name = new Main (20,10); // Δημιουργώ το αντικείμενο, με 2 παραμέτρους, όπως και ο κατασκευαστής.
	// Η πρώτη Main είναι τύπος.
	//Καλώ τον κατασκευαστή.
	
	System.out.println ("Δσωσε τον πρώτο αριθμό" + Name.x3()); // Καλώ την μέθοδο.
	System.out.println ("New Radius" + Name.x4 (10));
}
}
