package Abstract_Interface;

public class Cat extends Animals {
	private int amoun;
	private int g;
	
public Cat (int fo, int th) {
	super(fo , th);
	
}
	public void food(int amount) {
		 drink+=amount; // Όσο αναφορά για την μεταβλητή drink της κλάσης Animals, δεν χρειάζεται να δηλώσουμε τους τύπους. Το κάναμε στην abstact. Ούτε στις extend δεν μπορούμε να το κάνουμε αυτό , ούτε στα interfaces.
	}
	public void drink(int amount) {
		
		food+=amount / 4;
	}
	public int cat_method(int  g) {
		this.g = g;
		return g;
	}
	public String toString() {
		return super.toString() + food;
	}

public static void main (String[] args) {
	
	int h = Animals.g; // *** Μπορούμε να το γράψουμε αυτό. Αλλά θα πρέπει να την δηλώσουμε στην abstract κλάση ως static (δηλ. pubic static int g = 30;)
	System.out.println(h);
	
	Animals n = new Cat (1,3);
	System.out.println(n.a());
	System.out.println (n); // Για να εκτελεστεί η toString.
	//n.cat_method(40); Δεν μπορούμε να την χρησιμοποιήσουμε με αυτόν τον τρόπο την μέθοδο της Cat κλάσης, ακόμη και αν έχουμε δημιουργήσει και αντικείμενο cat.
	// Εδώ έρχεται το down casting.
	((Cat) n).cat_method(40); // Αυτός είναι ο σωστός τρόπος. ’ρα αντί για n. έχουμε ((Cat) n).
	
}
}

/*
’ρα μια abstract κλάση θα πρέπει να επεκταθεί από μία άλλη η οποία θα υλοποιήσει όλες τις κλάσεις της.

Μεθόδους που βάζουμε μέσα στις abstract κλάσεις θα πρέπει να είναι γενικές για κάποιο πράγμα (π.χ. για τα ζώα: τρωφή και νερό)

’ρα βάζουμε συγκεκριμένες/Βασικές μεθόδους που χρειάζονται ΥΠΟΧΡΕΩΤΙΚ’ για να υλοποιηθεί μια άλλη κλάση που την κάνει extend (την abstract) και θέλει να διαχειρίζεται τις κλάσεις διαφορετικά.

*** Μια κλάση όταν κάνει extends μια abstract ή όταν κάνει υλοποίηση ένα interface είναι ένας τρόπος για τον προγραμματιστή να εγγυηθεί ότι αυτή η κλάση ορίζει συγκεκριμένες μοθόδους.

Επιπλέον, μια abstract κλάση, μπορεί να δηλώσει και μια μέθοδο δικιά της χωρίς να χρειάζεται να υλοποιηθεί.

*/