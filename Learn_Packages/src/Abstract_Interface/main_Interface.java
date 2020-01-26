package Abstract_Interface;

public class main_Interface {

public static void main (String [] args) {
	
	Cat_Interface c;
	Monkey_Interface m;
	
	Animals_Interface g, f;
	
	c= new Cat_Interface (20, 30);
	m = new Monkey_Interface (20, 30);
	
	g = m;
	
double k = Animals_Interface.a;
System.out.println(k);	

	System.out.println(m.display(g));
	System.out.println(f.getPerimeter());	
	//System.out.println(m.display(f));
	/* Animals_Interface g;
	
	Cat_Interface c;
	Monkey_Interface m;
	c = new Cat_Interface (20, 30);
	m = new Monkey_Interface (20, 30);
	
	g = c;
	g = m;
	
	System.out.println((c.display(c)));
	System.out.println((m.display(m)));
	*/
}
}

/*
ΠΡΟΣΟΧΗ: Η κλήση μια μεθόδου δεν είναι δεσμευμένη με τον ορισμό της.

Το ίδιο το αντικείμενο καθορίζει τις ενέργειες που θα εκτελεστούν με κάθε μέθοδο.
’ρα αυτό που έχει σημασία είναι το όνομα της κλάσης κατά την δημιουργία του αντικειμένου και όχι ο τύπος της μεταβλητής.

Έστω ότι έχουμε ένα interface a και 2 κλάσεις b,c που την υλοποιούν.
Έστω και στις δύο έχουμε την μέθοδο dispay(<Interfacename name >).

Μετά στην main μπορούμε να χρησιμοποιήσουμε την display, και ως όρισμα να της βάλουμε το αντικείμενο που δημιουργήσαμε.
Αυτό είναι ένα ακόμη παράδειγμα του πολυμορφισμού.

Ελαν είχαμε μια κλάση Person και μια άλλη που την έκανε extends, δεν θα μπορούσαμε να χρησιμοποιήσουμε και στις δύο κλάσεις μια μέθοδο που έχει το ίδιο όνομα και τις ίδες παραμέτρους.






*/
