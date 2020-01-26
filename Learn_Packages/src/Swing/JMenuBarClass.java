package Swing;

import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.JMenuBar; //Στο JMenuBar μπαίνει το κάθε JMenu.
import javax.swing.JMenu;    // Στο JMenu μπαίνουν το κάθε JMenuItem.
import javax.swing.JMenuItem;

// Και στην συνέχεια, βάζουμε το JMenuBar στο JPanel, που μπαίνει με την σειρά του στο Container.

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.Color;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JMenuBarClass extends JFrame implements ActionListener {
	
	private static int WEIGHT = 300;
	private static int HEIGHT = 500;
	
public void JMenuBarmethod () {
		
	setSize (WEIGHT, HEIGHT);
	setTitle ("Window");
	
	Container content = getContentPane();
	content.setLayout(new BorderLayout());
	
	JPanel jp = new JPanel();
	jp.setBackground(Color.BLUE);
	jp.setLayout(new FlowLayout());
	
	//-----------Menu---------------\\
	
	JMenuBar jmb = new JMenuBar();
	jp.add(jmb);
	setJMenuBar(jmb); //ΠΡΟΣΟΧΗ ΣΕ ΑΥΤΗ ΤΗΝ ΚΛΑΣΗ.
	
	JMenu jm = new JMenu ("File");
	jmb.add(jm);
	
	JMenuItem jmi1 = new JMenuItem("Open");
	JMenuItem jmi2 = new JMenuItem("Exit");
	jm.add(jmi1);
	jm.add(jmi2);
	jmi1.addActionListener(this); // ΒΑΖΟΥΜΕ ΚΑΙ LISTENERS
	jmi2.addActionListener(this);
	
	//------------------------------\\
   
	content.add(jp, BorderLayout.CENTER); // Μπορούμε να το βάλουμε έτσι, γιατί είναι μεταβλητή το BorderLayout.CENTER.
		
	}
	
public void actionPerformed (ActionEvent e) {
	
	if (e.getActionCommand().equals("Open")) {
		JFrame jf1 = new JFrame("Second Window");  // ΑΝ ΔΕΝ ΔΗΜΙΟΥΡΓΟΥΣΑ ΚΑΙ ΑΛΛΟ ΑΝΤΙΚΕΙΜΕΝΟ ΘΑ ΑΛΛΑΖΕ ΤΟ ΠΑΡΑΘΥΡΟ ΠΟΥ ΕΙΧΑΜΕ ΗΔΗ ΚΑΙ ΔΕΝ ΘΑ ΣΗΜΙΟΥΡΓΟΥΣΕ ΚΑΙ ΑΛΛΟ ΠΑΡΑΘΥΡΟ
		
		jf1.setSize (200, 400);
		//jf1.setBackground(Color.CYAN); Δεν λειτουργεί αυτή η μέθοδος.
		jf1.setTitle ("Window");
		jf1.setVisible(true);
	}
	
	if (e.getActionCommand().equals("Exit")) {
	System.exit(0);
	
	
	}
}

public static void main (String[] args) {
	JMenuBarClass jmbm = new JMenuBarClass();
	jmbm.JMenuBarmethod();
	jmbm.setVisible(true);

}

}