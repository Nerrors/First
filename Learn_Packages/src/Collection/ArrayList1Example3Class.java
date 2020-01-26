package Collection;

import java.util.ArrayList;

public class ArrayList1Example3Class {

	static ArrayList<String> ar;
	
	public static void main (String[] args) {	
		
		ar = new ArrayList<>(); // Αν δεν το γράψουμε, θα μας βγάλει error.
		addElement("How are you?");
		System.out.println(ar);
	
	}
	
	public static void addElement (String newstring) {
		ar.add(newstring);
	}
}

//***************
/* Για να μην τα κάνουμε όλα αυτά, η καλύτερη τεχνική είναι.
 * Να δημιουργήσουμε 2 κλάσεις, όπου η μία θα έχει τις μεθόδους και η άλλη θα έχει την main.
*/
