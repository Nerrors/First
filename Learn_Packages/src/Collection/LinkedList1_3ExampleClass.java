package Collection;

public class LinkedList1_3ExampleClass {

public static void main (String[] args) {
	
	LinkedList1_2Example_Class lm = new LinkedList1_2Example_Class();
	lm.addElement("Αλέξανδρος");
	lm.addElement("Αγγελική");
	lm.addElement("Κώστας");
	lm.addElement("Βιβή");
	
	System.out.println(lm.length());
	lm.showList(); // Μέσα στην μέθοδο showList, περιέχεται η εντολή: System.out.println(position.getData());
				   // Όπου getData(); η μέθοδος στην κλάση LinkedList1.
	System.out.println();

lm.removeElement();
lm.showList(); 

lm.removeAllElements2();
System.out.println("Τα nodes είναι τα: "); // Γιατί δεν λειτουργεί
//lm.showList(); 

}

}
