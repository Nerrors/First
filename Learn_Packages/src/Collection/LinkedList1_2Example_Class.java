package Collection;

public class LinkedList1_2Example_Class {

LinkedList1_1ExampleClass header;
	
// Για να εμφανίσουμε την σενδεδεμένη λίστα.	
	public void showList() {
		LinkedList1_1ExampleClass position = header;
			while (position != null) {
				System.out.println(position.getData()); // Η getData και η getLinκ, βρίσκονται στην κλάση LinkedList1_1
				position = position.getLink();
}	
	}
	
// Για να εμφανίσουμε το μέγεθος της συνδεδεμένης λίστας.
	public int length() {
		int count = 0;
		LinkedList1_1ExampleClass position = header;
		while (position != null) {
			count++;
			position = position.getLink();
	}
		return count;
		}
	
// Για να προσθέσουμε ένα δεδομένο στην συνδεδεμένη λίστα.
	public void addElement (String a) {
		header = new LinkedList1_1ExampleClass (a ,header); //*** Για αυτό τον λόγο λέμε, ότι η LinkedList είναι μια συλλογή αντικειμένων.
	}
	
// Για να αφαιρέσουμε ένα στοιχείο στην συνδεδεμένη λίστα.
	public void removeElement () {
		if (header != null)
		{
		header.getLink(); // Απλά μετακινούμε την header, μια θέση μπροστά. Αγνοώντας το element.
		}
		else {
			System.out.println ("Deleting from an empty list.");
			System.exit(0);
			}
	}
	
// Για να αφαιρέσουμε όλα τα nodes.
	public void removeAllElements () {
		for (int i = 1; i<length(); i++) {
			header.getLink();
	}
}
	
	// Δεν είναι σωστός τρόπος. Δεν ξέρω γιατί όμως.
	public void removeAllElements2 () {
		while (header!=null) {
		header = header.getLink(); // Και όχι μόνο position.getLink() ΠΡΟΣΟΧΗΗΗΗΗΗ
	}
}
	
	public void showList2() {
		LinkedList1_1ExampleClass position = header;
		for (int i = 0; i<length(); i++) {
			System.out.println (position.getData());
			position = position.getLink(); // Έκανα λάθος και έβαλα μόνο position.getLink(); ΠΡΟΣΟΧΗ.
}	
	}

}
	
// Από ότι καταλαβαίνουμε
	
