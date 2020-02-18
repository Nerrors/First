package Basics;

public class Call_By_ValueClass {
	int a = 20;

	public void change (int a) {
		//this.a = a; // Επειδή το this, είναι για implicit παραμέτρους.
		a += 20;
	}
	
	public void change2 () {
		a += 40;  //*****Έτσι μπορεί να αλλαχθεί. Και θα γίνει 20 + 40 = 60.
	}
	
	
	public static void main(String[] args) {
		Call_By_ValueClass call = new Call_By_ValueClass();
		System.out.println (call.a);
		call.change(500);
		System.out.println (call.a);
		
		// Άρα δεν αλλάζει με το Call By Value.
	    //*****Θα αλλάξει αν προσθέσουμε την εντολή this.a = a;
		
		call.change2();
		System.out.println(call.a);
	}
}