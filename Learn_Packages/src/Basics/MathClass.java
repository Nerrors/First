package Basics;

public class MathClass {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			int n = (int) (Math.random() * 50) + 1; // Casting με το int.
			System.out.println("Ο τυχαίος αριθμός αυτή την φορά είναι = " + n);
		}
	}
}

		// Κάθε βιβλιοθήκη δεν χρειάζεται να την κάνουμε import.


		/*  
		 * ----------------------------------------------------
		 *  Oναμα ->  Περιγραφή    ->    Παράδειγμα           |
		 * ----------------------------------------------------
		 * 
		 * pow     | Δύναμη            |Math.pow (2.0, 3.0);  | 
		 * 
		 * abs     | Απόλυτη τιμή      |Math.abs (-3.5);      |
		 * 
		 * max     | Μέγιστο           |Math.max (5.5, 5.4);  |
		 * 
		 * min     | Ελάχιστο          |Math.min (5.5, 5.4);  |
		 * 
		 * random  | Τυχαίος αριθμός   |Math.random ();       |
		 * 
		 * round   | Στρογγυλοποίηση   |Math.round (6.3);     |
		 * 
		 * ceil    | ’νω όριο          |Math.ceil (3.2);      |
		 * 
		 * floor   | Κάτω όριο         |Math.floor (3.2);     |
		 * 
		 * sqrt    | Τεατραγωνική ρίζα |Math.sqrt (4.0);      |
		 *
		 * ----------------------------------------------------
		 *  
		 * ΠΡΟΣΟΧΗ: 
		 * 
		 * Ο random βγάζει double ώς τύπο επιστροφής, ο round (όπως είναι και λογικό) int, long και
		 * ο pow, ceil, floor, sqrt ο τύπος ορισμούς τους είναι πάντα double και επιστρέφουν πάντα double.
		 * 
		 * double a = 3.24;
		 * int lowAnswer = (int) Math.round (a);
		 
		 */