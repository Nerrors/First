package Swing;

	import javax.swing.JButton;
	import javax.swing.JLabel;
	import javax.swing.JFrame;
	import javax.swing.JPanel;
	import javax.swing.JTextField;

	import javax.swing.border.BevelBorder;
	import javax.swing.border.EmptyBorder;
	import javax.swing.border.LineBorder;
	import javax.swing.border.MatteBorder;
	import javax.swing.border.EtchedBorder;

	import java.awt.Color;
	import java.awt.Container; //*** Όλα τα Layouts μαζι με το Color, το Container, το Insets και το Dimension είναι στην βιβλιοθήκη java.awt.
	import java.awt.Insets;
	import java.awt.BorderLayout;
	import java.awt.FlowLayout;
	import java.awt.GridLayout;	

	import java.awt.event.ActionListener;
	import java.awt.event.ActionEvent;

	public class BorderExampleClass extends JFrame implements ActionListener {
	
	public static final int WEIGHT = 600; //** Τα κεφαλαία ονόματα μεταβλητών, είναι συνήθως static μεταβλητές.
	public static final int HEIGHT = 400;

	private JTextField jtf;

	public void method() {

	setTitle("Windows");
	setSize (WEIGHT,HEIGHT);

	Container content = getContentPane();; //***ΌΧΙ new Container()....getContentPane();
	content.setLayout(new BorderLayout());
		// Ο Container δεν έχει μέθοδο setBorder().

	JPanel jp3 = new JPanel();
	jp3.setBackground(Color.MAGENTA);
	jp3.setLayout(new FlowLayout());
		jp3.setBorder(new LineBorder(Color.WHITE,10)); // Προσθέτει περίγραμμα στο component.

	JButton jp1 = new JButton("Save");
	JButton jp2 = new JButton("Exit");
	jp1.addActionListener(this);
	jp2.addActionListener(this);
	jp3.add(jp1);
	jp3.add(jp2);
		jp1.setBorder(new EmptyBorder(40,40,10,10)); //Εισάγει χώρο γύρο από το component.
		//Για JButton υγκεκριμένα, αντί για EmptyBorder, μπορούμε να χρησιμοποιήσουμε και την μέθοδο setMargin(new Insets (int top, int left, int bottom, int right));
		jp2.setBorder(new EtchedBorder (400,Color.YELLOW,Color.BLUE)); 
		// Το EtchedBorder είναι παρόμοιο με ένα BevelBorder();. Δηλαδή, δημιουργεί ένα σκαλισμένο περίγραμμα όπου μπορούμε να ορίσουμε και με μεγεθός του.
		//***Δεν μπορούμε να βάλουμε 2 setBorder. ΓΙΑΤΙ ΜΟΥ ΤΟ ΕΜΦΑΝΙΖΕΙ ΠΟΛΥ ΜΙΚΡΟ. δΕΝ ΔΟΥΛΕΥΕΙ Η ΜΕΘΟΔΟΣ setMargin();
		
	JPanel jp4 = new JPanel();
	jp4.setBackground(Color.BLACK);
		jp3.setBorder(new MatteBorder(10,20,20,20,Color.BLUE)); // Είναι το ίδιο με το LineBorder, απλά με το MatteBroder, μπορούμε να ορίσουμε και τις διαστάσεις κάθε πλευράς.
	
	jtf = new JTextField(20);
	jtf.setBackground(Color.WHITE);
	jp4.add(jtf);
		jtf.setBorder(new BevelBorder(BevelBorder.RAISED));
		// Δημιουργεί ένα λοξοτμημένο περίγραμμα που είναι είτε υπερυψωμένο είτε χαμηλομένο, ανάλογα νε την σταθερά (BevelBorder.RAISED, BevelBorder.LOWERED).
	
		
	content.add(jp3,BorderLayout.SOUTH); // *** ΠΡΟΤΙΜΟΤΕΡΟ ΝΑ ΤΙΣ ΕΧΟΥΜΕ ΜΑΖΙ ΑΥΤΕΣ ΤΙς ΕΝΤΟΛΕΣ.
	content.add(jp4,BorderLayout.CENTER);
	
	}
	
	public void actionPerformed (ActionEvent e) {
	if  (e.getActionCommand().equals("Save"))
	jtf.setText("A Very Good Name");
    if (e.getActionCommand().equals("Exit"));
    jtf.setText(" ");
	}

	public static void main (String[] args) {
	BorderExampleClass bec = new BorderExampleClass();
	bec.method();
	bec.setVisible(true);
	}
	}
	
	/*						 Constructors (Κατασκευαστές)
	 * 
	 * public BevelBorder (int bevel);
	 * 
	 * public EmptyBorder (int top, int left, int bottom, int right);
	 * 
	 * public EtchedBorder (int etch, Color highlightColor, Color shadowColor);
	 *
	 * public LineBorder (Color thecolor, int thickness);
	 * public LineBorder (Color thecolor, int thickness, boolean roundedCorners);
	 * 
	 * public MatteBorder (int top, int left, int bottom, int right, Color theColor);
	 * public MatteBorder (int top, int left, int bottom, int right, ImageIcon theIcon);
	 */
	