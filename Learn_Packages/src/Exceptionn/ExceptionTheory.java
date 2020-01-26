package Exceptionn;

public class ExceptionTheory {

}

/*

Υπάρχουν τρία σημεία στις εξαιρέσεις:

Δήλωση, Ρίψη, Σύλληψη

Όσο αναφορά την δήλωση:
public void myMethod () throws IOException, EOFException {}

Δείχνει ότι η myMethod είναι πιθανόν να ρήξει μια IOException εξαίρεση.
Θα πρέπει κάθε μέθοδος να δηλώσει τους τύπους εξαιρέσεων που θέλει να ρίξει.


Όσο αναφορά την ρίψη:
throw new IllegalArgumentException("text");

Όταν ένα πρόγραμμα ανιχνεύει ένα σφάλμα, μπορεί να δημιουργήσει ένα στιγμιότηπο της εξαίρεσης και να το ρήξει.


Στην πράξη, θα τα δούμε στην κλάση Arithmetic.java
*/