package Swing;

import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.JTextArea;
import javax.swing.JScrollPane; //Λαμβάνει ως κατασκευαστή το αντικείμενο του JTextArea

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class JTextAreaExampleClass extends JFrame {

	private static int WEIGHT = 600;
	private static int HEIGHT = 400;
	
	private static int LINES = 10;
	private static int CHAR_PER_LINE = 20;
	
	public void method() {
		setTitle("fdfsdf");
		setSize(WEIGHT,HEIGHT);
		setVisible(true); // Εδώ μπορούμε να την βάλουμε έτσι.
		
		Container content = getContentPane();
		content.setLayout(new BorderLayout());
		JPanel jp = new JPanel();
		jp.setBackground(Color.YELLOW);
		jp.setLayout(new FlowLayout()); // Αν βάλουμε BorderLayout θα επηρεάσει την εμφάνιση και όλο το παράθυρο θα γίνει TextArea.
		content.add(jp, BorderLayout.CENTER);
		
		JTextArea jta = new JTextArea(LINES, CHAR_PER_LINE);
		jp.add(jta);
		
		JScrollPane jsp = new JScrollPane(jta);
		jp.add(jsp); // Πρέπει και αυτό να το προσθέσουμε στο ίδιο JPanel που βρίσκεται και το αντικείμενο JTextArea.
		
		/* Χρησιμοποιούμαι τις 2 παρακάτω μεθόδους για να εμφανίζονται πάντα το ScrollPane.
		
		jsp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		jsp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		
		Μπορούμε να βάλουμε είτε ALWAYS, είτε NEVER, είτε AS_NEEDED. Στην πραγματικότητα, αυτές οι τιμές είναι int αριθμοί.
		
		*/
	}
	
	public static void main (String [] args) {		
		JTextAreaExampleClass jtaec = new JTextAreaExampleClass();
		jtaec.method();
		jtaec.setVisible(true); // Δεν είναι στατική η μέθοδος setVisible(true).Αλλιώς θα γράφαμε μόνο την μέθοδο.
	}
}
