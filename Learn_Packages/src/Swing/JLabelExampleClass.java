package Swing;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.Color;

public class JLabelExampleClass extends JFrame{

	public static final int WEIGHT = 300;
	public static final int HEIGHT = 300;
	
	public JLabelExampleClass() {  // ***Αρχικοποιεί όλα αυτά, από την στιγμή που φτιαχτεί ο κατασκευαστής.
		
		//addWindowListener(new WindowDestroyer());
		setSize(WEIGHT,HEIGHT);
		setTitle ("SecondExample");
		
		Container cont = getContentPane();
		BorderLayout br = new BorderLayout();
		
		cont.setLayout(br);
		cont.setBackground(Color.YELLOW);
		
		//----------JLabel-----------\\
		
		JLabel label1 = new JLabel ("First Lable");
		cont.add(label1, BorderLayout.NORTH);
		JLabel label2 = new JLabel ("Second Lable");
		cont.add(label2, BorderLayout.CENTER); // Σε αυτή την περίπτωση, και WEST να βάλουμε είναι το ίδιο πράγμα.
		JLabel label3 = new JLabel ("Third Lable");
		cont.add(label3, BorderLayout.SOUTH);
		
		//---------------------------\\
	}

public static void main (String[] args) {
	
	JLabelExampleClass l = new JLabelExampleClass();
	l.setVisible(true);
}
}
