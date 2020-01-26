package SwingOtherClasses;
import javax.swing.JFrame; // Η JFrame είναι μια κλάση από την βιβλιοθήκη Swing, όπως είναι και η JLable,Jbutton....
import javax.swing.JLabel;

/*
 *  Με πολύ απλό τρόπο, μπορούμε να εκτελέσουμε και έτσι το πρόγραμμα.
public class Example {

	public static void main (String [] args) {
JFrame a = new JFrame();
JLabel b = new JLabel("ghfdghfdhfg");
a.setSize (300,200);
a.setTitle("sfgdfgd");
a.setVisible(true);
a.getContentPane().add(b);
	}
}
*/
public class Example extends JFrame { //  Αφού την κάνει extends την JFrame, μπορούμε να χρησιμοποιήσουμε τις μεθόδους τις, χωρίς να δημιουργήσουμε αντικείμενο.
	public static int Weight = 400;
	public static int Height = 400;
	public Example () { // Δημιουργούμε έναν κατασκευαστή, για να αρχικοποιήσει τις τιμές.
		super ();
		setSize (Weight, Height);
		setTitle ("First Window");
		getContentPane().add (new JLabel ("Γεια σου τι κανεις"));
		//WindowDestroyer myListener = new WindowDestroyer ();
		//addWindowListener (myListener);
	}
	public Example (int a, int b, String Title, String Label) {
		super ();
		setSize (a, b);
		setTitle (Title);
		getContentPane().add (new JLabel (Label));
	}


public static void main (String [] args) {
	Example e = new Example ();	
	e.setVisible (true);
	Example v = new Example (400,500, "Second Window", "Γειά σου τι κάνεις");	
	v.setVisible (true);
}
}
//Σε αυτό το παράδειγμα, χργησιμοποιούμε δύο κατασκευαστές, και με την δημιουργία 2 αντικειμένων, τους καλούμαι.