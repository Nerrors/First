package SwingOtherClasses;

import javax.swing.JTextArea;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextArea;

import java.awt.Container ;
import java.awt.Color ;
import java.awt.BorderLayout ;
import java.awt.FlowLayout ;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextAreaa extends JFrame implements ActionListener {
	
	// Για το JFrame.
	public static final int WEIGHT = 600;
	public static final int HEIGHT = 300;
	// Για το JTextArea.
	public static final int CHAR = 10;
	public static final int CHAR_PER_LINE = 40;
	
	
	public TextAreaa () {
		
		setSize(WEIGHT, HEIGHT);
		setTitle ("Memo");
		
		Container content = getContentPane(); // Ο Container παίρνει την επιφάνεια.
		content.setLayout (new BorderLayout());
		
		JPanel jp1 = new JPanel();
		jp1.setLayout (new FlowLayout());
		jp1.setBackground(Color.WHITE);
		
		JButton jb1 = new JButton ("Button1");
		jb1.setBackground(Color.WHITE);
		jb1.addActionListener(this);
		jp1.add(jb1);
		JButton jb2 = new JButton ("Button2");
		jb2.setBackground(Color.MAGENTA);
		jb2.addActionListener(this);
		jp1.add(jb2);
		
		
	// Φτιάχνουμε καινούργιο Panel, για να τοποθετήσουμε το JTextArea.

		JPanel jp2 = new JPanel();
		jp2.setBackground(Color.MAGENTA);
		
		JTextArea jta = new JTextArea(CHAR,CHAR_PER_LINE );
		jta.setBackground(Color.YELLOW);
		jp2.add(jta);
		
		
	// Τα τοποθετούμε και τα 2 JPanel, στο Container (getConentPane());
	
		content.add(jp1, BorderLayout.SOUTH);
		content.add(jp2, BorderLayout.CENTER);
	}
		
	// Και εδώ θα χειριστούμε τα Buttons
		
		public void actionPerformed (ActionEvent e) {
			
			String ss = e.getActionCommand();
			if (ss.equals("Button1")) {
				System.exit(0);
			}
			else if (ss.equals("Button2")) {
				System.out.println("Geia sou ti kaneis");
			}
		}
	
	public static void main () {
		TextAreaa ta = new TextAreaa ();
		ta.setVisible(true);
	}

}
