package Exceptionn;
//Second Chance.
import java.util.Scanner;
public class Example_2 {
	int a; // ΣΗΜΑΝΤΙΚΟ
	/* . Για να μπορέσουν όλες οι μεθόδοι να πάρουν την τιμή της μεταβλητής a (δηλαδή αυτή που πληκτρολογήσαμε στην αρχή) 
	 * θα πρέπει να την δηλώσουμε ακριβώς κάτω από την public class έτσι ώστε έπειτα 
	 * να την εισάγουμε στην επόμενη μέθοδο και να την διαιρέσουμε με την καινούργια τιμή της μεταβλητής b (δηλαδή την r)
	 */
	public static void main (String [] args) {
		
		Example_2 a = new Example_2 ();
		a.doit();
		// Σημαντικο. Αντί να γράφουμε καινούργια κλάση, δημιουργούμε τις μεθόδους στην Main
	}
	
	
	public void doit() { // 1η Μέθοδος
		try {
			Scanner keyboard = new Scanner (System.in);
			System.out.println("Enter the number of donuts");
			a = keyboard.nextInt();
			System.out.println("Enter the number of milks");
			int b = keyboard.nextInt();
		
		if (b<0) {
			throw new Exception ("Error");
		}
			double c = a / b;
			System.out.println(c);
		
		}
		catch (Exception e) {

			System.out.println(e.getMessage());
			System.out.println("Please buy some milks");
			tryagain(a);
			}
		System.out.println("End program");
		}
	
	public void tryagain(int g) { // 2η Μέθοδος.
		a = g;
		Scanner keyboard2 = new Scanner (System.in);
		System.out.println("Enter the number of milks again");
		int r = keyboard2.nextInt();
		int result = g/r;
		System.out.println(result);
		}
}
