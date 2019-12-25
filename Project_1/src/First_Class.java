import java.util.Scanner;

public class First_Class {
	

	public static void main (String[] args) {
		
		Calculator cal = new Calculator(20.1, 20.3);
		
		System.out.println(Calculator.str); // Θα πρέπει η μεταβλητή να είναι public για να μπορέσουμε να το κάνουμε αυτό.

	// Αν είναι public και static, μπορούμε και με τον εξής τρόπο, χωρίς να χρησιμοποιήσουμε αντικείμενο.
	// Calculator.a;
	
		Scanner scan = new Scanner(System.in);			
	
		System.out.println(cal.add());
		System.out.println(Calculator.a);
		System.out.println(cal.add(20.3, 20.4));
	}
}

// Γιατί δεν μας βγάζει Exception και μας βγάζει null, αντί για NullPointerEXception.