package SwingOtherClasses;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;


public class Quit_Button extends JFrame{

	public Quit_Button() { // Δημιουργούμε έναν κατασκευαστή έτσι ώστε όταν το καλέσουμε στην main να γίνει κλήση κατευθεία στην μέθοδο unitUI()
	unitUI();
	}
	
	public final void unitUI() { // Φτιάχνουμε την μέθοδο unitUI.
		JPanel panel = new JPanel();
		
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton button = new JButton("Quit");
		button.setBounds(50, 60, 80, 30);
		
		button.addActionListener(new ActionListener() {  // Δημιουργούμε το Listener και το Event για το Button
			public void actionPerformed(ActionEvent event) {
				System.out.println ("dfsdfs");
				System.exit(0);
				 // Εδω΄γράφουμε τις εντολές του Event.
				}
			});
		
		panel.add(button); // Πρεσθέτουμε το Button στο Panel.
		setTitle("Quit button");
		setSize(300, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		}
	
	public static void main (String [] args) {
		Quit_Button a = new Quit_Button(); 
		a.setVisible(true);
		}
	}

