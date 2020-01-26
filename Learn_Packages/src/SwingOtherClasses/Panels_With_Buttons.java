package SwingOtherClasses;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JComponent;
import javax.swing.SwingUtilities;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panels_With_Buttons extends JFrame {
	
	public Panels_With_Buttons () {
		Method(); //***** ΠΟΛΥ ΚΑΛΗ ΜΕΘΟΔΟΣ. ΔΗΛΑΔΗ ΑΠΟ ΤΟΝ ΚΑΤΑΣΚΕΥΑΣΤΗ, ΚΑΛΟΥΜΕ ΤΗΝ ΜΕΘΟΔΟΣ
	}
	
	public void Method() {
		
	JPanel panel = new JPanel();
	JPanel panel2 = new JPanel();
	
	Container cont = getContentPane();
	
	getContentPane().add(panel);  //Χρειάζεται την μέθοδο για να λειτουργήσει.
	panel.setLayout(null);
	
	getContentPane().add(panel2);  //Χρειάζεται την μέθοδο για να λειτουργήσει.
	panel2.setLayout(null);
	
	JButton b = new JButton ("Button");
	JButton b2 = new JButton ("Button2");
	b.setBounds(20, 20, 80, 30);
	b2.setBounds(50, 60, 80, 30);
	
	b.addActionListener(new ActionListener() //Anonymous class. Αλλως τρόπος ήταν να κάναμε implements την κλάση και μετά να υλοποιούσαμε την μέθοδο. 
	{ 
		public void actionPerformed(ActionEvent event) {
			
			System.out.println((" Θα κλείσει"));
		
			b2.addActionListener(new ActionListener()
			{ 
				public void actionPerformed(ActionEvent event) {
					
				System.out.println(("Γεια σου, τι κάνεις;"));	
				}
				
			});
		
			 // Εδώ γράφουμε τις εντολές του Event.
			}

	});
	
	panel.add(b); // Πρεσθέτουμε το Button στο Panel.
	setTitle("Quit button");
	setSize(300, 200);
	setLocationRelativeTo(null);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setVisible (true);
	
	panel2.add(b2); // Πρεσθέτουμε το Button στο Panel.
	setTitle("Quit");
	setSize(300, 200);
	setLocationRelativeTo(null);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setVisible (true);
	}
	
	
	public static void main (String [] args) {
		Panels_With_Buttons a = new Panels_With_Buttons ();
	}
}
