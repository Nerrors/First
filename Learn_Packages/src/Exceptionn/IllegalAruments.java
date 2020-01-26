package Exceptionn;
import java.util.Scanner;
import java.util.*;

public class IllegalAruments {
	
public static double toString (double radius) throws IllegalArgumentException, InputMismatchException { // Στο Throws χρησιμοποιούμαι το κόμμα.
	if (radius<0)
		throw new IllegalArgumentException ("Error");
	return radius;
}
	
public static void main (String[] args) {
System.out.println("Δώσε ένα Double");
try {
Scanner scan = new Scanner (System.in);
Double str = scan.nextDouble();
	System.out.println(toString(str));

}
catch (IllegalArgumentException | InputMismatchException e) { // Στο catch χρησιμοποιούμαι τον '|' συμβολισμό.
	System.out.println(e + "Error");
	}
}
}

/*
Όσο αναφορά την IllegalArgumentException

Ένα όρισμα που περνάει σε μια μέθοδο και είναι μή νόμιμο ή ακατάλληλο.

*/