package Collection;

import java.util.Stack;

public class Stack1ExampleClass {

	
	public static void main (String[] args) {
		
		Stack<String> st = new Stack<>();
		
		
		st.push("Jack");
		st.push("Alex");
		st.push("Tommy");
		st.push("Aris");
		st.push("John");
		
		System.out.println(st);	
	System.out.println(st.pop());
	}
	
	// Η Stack επεκτείνει την Vector που επεκτείνει μαζί με την ArrayList και την LinkedList την AbstractList.
	
	//Σε αντίθεση με την κλάση Queue:
	// Έχει κατασκευαστή.
	
	/* Έχει τις εξής παρακάτω μεθόδους:
	 * 
	 * empty() : boolean        
	 * pop() : E                -> Επιστρέφει και αφαιρεί το τελευταίο στοιχείο της στοίβας.
	 * push() : E               -> Προσθέτει ένα νέο στοιχείο στην κορυφή της στοίβας.
	 * search(o : object) : int -> Επιστρέφει την θέση ενός συγκεκριμένου στοιχείου.
	 * 
	 * 
	 * Δεν έχει τις εξής μεθόδους
	 * 
	 * offer
	 * poll
	 * element
	 * 
	 */
	
	
	
	
}
