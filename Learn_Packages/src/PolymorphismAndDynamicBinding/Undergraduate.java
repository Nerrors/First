package PolymorphismAndDynamicBinding;

public class Undergraduate {

	
	public static void main(String[] args) {
		
		Person p = new Person("Aleksandros");
		Person s = new Student("George ", 20); // Από πάνω πρός τα κάτω οι κλάσεις. Δεν μπορούμε αντίστροφα.

		System.out.println(p.alex());
		System.out.println(s.alex());
	
	
	/*
	
	 Ο πολυμορφισμός, αναφέρεται στην δυνατότητα να συσχετίσουμε πολλές σημασίες σε ένα όνομα μεθόδου 
	 μέσω του μηχανισμού της δυναμικής  διασύνδεσης (dynamic binding).
	 
	 */
	
	/*
	 
	 Για την ακρίβεια, όταν καλούμαι μια επικαλυμμένη μέθοδο, η ενέργεια που εκτελείται 
	 είναι αυτή που ορίζεται στην κλάση που χρησιμοποιήθηκε για την δημιουργία του αντικειμένου
	 (δηλ. new Student). ΔΕΝ εξαρτάται δηλαδή από τον ΤΥΠΟ αλλά από την ΚΛΑΣΗ ΤΟΥ ΑΝΤΙΚΕΙΜΕΝΟΥ.
	 
	 */
	
	// Όσο αναφορά την toString(), η Java χρησιμοποιεί δυναμική διασύνδεση με αυτή την μέθοδο.
	}
}
