package Swing;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color; // Η AWR είναι ένα πακέτο κλάσεων, και η Color βρίσκεται σε αυτό το πακέτο (όπως και η Container).
import java.awt.Container;

public class ColorExampleClass extends JFrame {
	public ColorExampleClass () {
		super ();
		
		setTitle ("First Window");
		setSize (400, 500);
		getContentPane().setBackground(Color.YELLOW);
		//addWinmdowListener (new WindowDestroyer());
	}
	public static void main (String [] args) {
		ColorExampleClass e = new ColorExampleClass ();	
		e.setVisible (true);
		}
	}
/* *** Την επεκτείνουμε και δεν την κάνουμε με τον παρακάτω τρόπο επειδή η main δημιουργώντας ένα αντικείμενο της κλάσης δεν μπορεί να πάρει και τις μεθόδους της JFrame.
public class Example_2_Colors {
private JFrame p;

public Example_2_Colors () {
super();
p.setTitle("dcs");
p.setSize (...,...);

***

*/