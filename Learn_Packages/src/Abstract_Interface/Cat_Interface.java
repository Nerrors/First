package Abstract_Interface;

public class Cat_Interface implements Animals_Interface {
private double myWidth;
private double myHeight;

public Cat_Interface (double myWidth, double myHeight) {
	this.myWidth = myWidth;
	this.myHeight = myHeight;
}
public double getPerimeter () {
	int k = a; // όπως και στις abstract κλάσεις μπορώ να το χρησιμοποιήσω. Εάν είμαστε στην Main,  μπορούμε να γράψουμε int k = Animals_Interface.a;
	return 2 * (myWidth + myHeight);
	
}

public double getArea( ) {
	return myWidth * myHeight ;
} 
public String display (Animals_Interface c) {
	
	return "Το width είναι" + c.getPerimeter() + "Το Area είναι" + c.getArea();
	}
}

/* Interfaces
 * 
 * Όπως και στις abstract κλάσεις, όταν μια κλάσει κάνει implements ένα interface, θα πρέπει να υλοποιεί όλες τις μεθόδους που έχουν δηλωθεί μέσα στο interface.
 * 
 * Μία από τις βασικές διαφορές στο τρόπο σύνταξης μεταξύ της anstract και του interface είναι ότι:
 *
 * Στα interfaces, μπορούμε να δηλώσουμε μόνο σταθερές μεταβλητές και μεθόδους (χωρίς κώδικα).
 * Στις abstract κλάσεις, δεν έχουμε αυτούς τους περιορισμούς, και μπορούμε να δηλώσουμε και κατασκευαστές, και μεταβλητές(public, private...), αλλά και δικές τις μεθόδους, χωρίς να χρειάζεται η κλάση που την κάνει extends, να τις υλοποιήσει.
 * 
 * Μια άλλη διαφορά είναι ότι μια κλάση μπορεί να κάνει extends μόνο μια άλλη κλάση, ενώ μπορεί να κάνει implements όσα interface θέλει.
 * 
 * Μια άλλη διαφορά είναι ότι η abstract είναι κλάση σε αντίθεση με το Interface. Πράγμα που σημαίνει ότι είναι πιο πολύ δαπανηρή στην χρήση, επειδή πρέπει να γίνεται μια αναζήτηση ότι κληρονομούμαι από αυτήν.
 * 
 * Ένα κοινό των abstract και των interfaces, είναι ότι η κλάση main δεν μπορεί να δημιουργήσει αντικείμενα (δηλαδή του τύπου: Animals_Interface v = new Animals_Interface(), αλλά μπορεί έτσι Animals_Interface v = new Cat_Interface(..., ...); ).
 */
