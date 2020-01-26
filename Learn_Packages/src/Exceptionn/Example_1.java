package Exceptionn;
import java.util.Scanner;
public class Example_1 {
public static void main (String [] args) {
	try {
	Scanner keyboard = new Scanner (System.in);
	System.out.println("Enter the number of donuts");
	int a = keyboard.nextInt();
	System.out.println("Enter the number of milks");
	int b = keyboard.nextInt();
	
	if (b<0) {
		throw new Exception ("Error"); // Δημιουργείται ένα νέο αντικείμενο, της κλάσης Exception. Το "errors" έιναι ένα όρισμα String
	
	/* Η παραπάνω γραμμή, είναι ισοδύναμη με την παρακάτω:
	 * Exception n = new Exception ("Error");
	 * throw n;
	 */
	}
		double c = a / b;
		System.out.println(c);
	
	}
catch (Exception e) { // Σύλληψη της εξαίρεσης.
	Exception p = e; // Αυτό το κομμάτι του κώδικα εκτελείται, όταν εκτελείται η εντολή throw.
System.out.println(p.getMessage()); // Αφού δώσαμε το όρισμα, τώρα με αυτήν την μέθοδο το εμφανίζουμε στην οθόνη.
System.out.println("Please buy some milks");	
}
	System.out.println("End program");
}
	}
// Μια εξέρεση, είναι ένα αντικείμενο.	
