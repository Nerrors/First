package Swing;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class JButtonExampleClass extends JFrame implements ActionListener {
	public JButtonExampleClass () {
		super();
		setSize(300,400);
		setTitle("Buttons");
		JLabel label1 = new JLabel ("Το περιεχόμενο της ετικέτας");
		getContentPane().add (label1);
		BorderLayout b = new BorderLayout();
		getContentPane().setLayout(b);
		JButton button1 = new JButton("Green");
		JButton button2 = new JButton("Red");
		button1.addActionListener(this);
		button2.addActionListener(this);
		getContentPane().add(button1, BorderLayout.NORTH);
		getContentPane().add(button2, BorderLayout.SOUTH);
	}
	public void actionPerformed (ActionEvent e) {
		if (e.getActionCommand().equals("Green")) {
			getContentPane().setBackground(Color.MAGENTA);
		}
			else {
				if (e.getActionCommand().equals("Red")) {
					getContentPane().setBackground(Color.RED);
			}
		}
	}
	
	public static void main (String [] args) {
		JButtonExampleClass a = new JButtonExampleClass ();
		a.setVisible(true);
}
}
