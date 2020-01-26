package Hotel_Example;
import java.util.Date;

/**
 *
 * @author George
 */
public class Reservation { //Δηλώνει 3 ματαβλητές από 3 διαφορετικές κλάσεις. Είναι σαν να τα συγκεντρώνει όλα μαζί.
    private Period period; //*** Μπορεί να το κάνει αφού και οι δύο κλάσεις βρίσκονται στο ίδιο πακέτο. Εάν δεν βρίσκονται στο ίδιο πακέτο θα πρέπει να κάνουμε import.όνομα_πακέτου.όνομα_κλάσης.
    private Client client;
    private Room room;

    public Reservation(Period period, Client client, Room room) { // Κάθε Period period περιλαμβάνει τα στοιχεία του κατασκευαστή.
        this.period = period;
        this.client = client;
        this.room = room;
        period.getStartDate();
    }
 // *** Δηλαδή με αυτόν τον τρόπο συμπεριλαμβάνουμε σε μια κλάση πέρα από τις μεταβλητές της και άλλες μεταβλητές μιας άλλης κλάσης.
    
    // Στην κλάση Room δημιουργούμε μια λίστα List <Reservation> επειδή αυτή η κλάση περιέχει τα στοιχεία και από την Period από τον Client και το Room.

    
    public Client getClient() {
    	//period.getEndDate(); Μπορούμε να το χρησιμοποιήσουμε.
    	//Date a = period.startDate; // Μπορούμε να το χρησιμοποιήσουμε μόνο όταν η μεταβλητή startDate είναι public.
        return client;
    }

    public Period getPeriod() {
        return period;
    }

    public Room getRoom() {
        return room;
    }

    public void setPeriod(Period period) { // Προσοχή σε αυτές τις μεθόδους. Ο τύπος είναι το όνομα της κλάσης και ορίζουμε το όνομα της μεταβλητής.
        this.period = period;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setRoom(Room room) {
        this.room = room;
    }
    
    // Εδώ έχουμε τις πληροφορίες που αποθηκεύονται στο Reservation και οι αντίστοιχοι getters και setters.

    // Αυτή είναι η μόνη ιδιαίτερη μέθοδος. Για έλεγχο της περιόδου.
    public boolean overlaps(Period period) { // Έναν κατασκευαστή θα πρέπει να έχει ως όρισμα.
        return this.period.overlaps(period);
    }

}
