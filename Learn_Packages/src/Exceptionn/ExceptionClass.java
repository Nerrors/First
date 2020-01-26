package Exceptionn;

public class ExceptionClass extends Exception {
	public ExceptionClass () { // 1ος Κατασκευαστής.
		super ("Error_2"); // Για να θυμηθούμε: Exception a = new Exception ("Error"); throw a;
	}
	public ExceptionClass (String message) { // 2ος Κατασκευαστής
		super (message); // Για να θυμηθούμε: Exception a = new Exception ("Error"); throw a;
	}
	// Με την  super κανουμε κλήση τον κατασκευαστή.
}
