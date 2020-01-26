package Collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExampleClass {

	public static void main (String[] args) {
		
		
		Queue<Integer> q = new LinkedList<>();
		
		for (int i=1; i<=5;i++)
			q.add(i); // Δεν χρεάζεται q.add(new Integer(i))
		
		System.out.println(q);
		
		System.out.println(q.peek()); // Εξάγει το στοιχείο στην κορυφή της ουράς και αν είναι άδεια η ουρά, επιστρέφει null.
		System.out.println(q.element()); // Σε αντίθεση με την peek, αν είναι null ρίχνει μια εξαίρεση.
		System.out.println(q.poll()); // Εξάγει και Αφαιρεί στην κορυφή και επιστρέφει null αν είναι κενή.
		System.out.println(q.remove()); // Η ίδια λειτουργία με πάνω αλλά ρίχνει μια εξαίρεση.
		System.out.println(q);
		System.out.println(q.size());
	} 
	
	//Δεν έχει κάποιον κατασκευαστή. Είναι interface.
	//Η LinkedList επεκτείνει την διεπαφή Deque που επεκτείνει την Queue.
	//Η PriorityQueue επεκτείνει την AbstractQueue που επεκτείνει την Queue
	//NullPointerException.
	
}
