package SwingOtherClasses;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class setToolTipText extends JFrame {
	public setToolTipText () {
		method();
		}
	public  void method () { // Έβαλα static και μου το έβγαλε λάθος
		JPanel panel = new JPanel();
		getContentPane().add(panel);
		
		panel.setLayout(null);
		panel.setToolTipText("Tip"); // Εμφανίζεται το παρακάτω μήνυμα όταν το ποντίκι βρίσκεται έξω από το πεδίο του Button.
		
		JButton b = new JButton ("Button");
		b.setBounds(100, 60, 100, 30);
		b.setToolTipText("A button component"); // Όταν έχουμε πολύ ώρα το ποντίκι πάνω στο κουμπί και δεν το πατάμε, εμφανίζεται το εξής μήνυμα
		
		panel.add(b);
		
		setTitle("Tooltip");
		setSize(300, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible (true);
		}
	public static void main (String []args) {
		setToolTipText  t = new setToolTipText ();	
		}	
	}
