package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListCollectionsnCopies {
	
	public static void main (String[] args) {
	
		ArrayList <String> ar  = new ArrayList<>(Collections.nCopies(6, "Γεια σουυυ"));
	
System.out.println (ar);
	}	
}

// Όχι collection, προσοχή. Η Collections είναι κλάση και όχι interface.
// Όλες οι μέθοδοι και οι τρείς σταθερές (List EMPTY_LIST, Map EMPTY_MAP , Set EMPTY_SET) είναι static.
// Επομένως, μπορούμε να τις χρησιμοποιήσουμε κατευθείαν δηλ. Collections.<Όνομα της κλάσεις()>.