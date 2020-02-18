package ConstructorDifferences;

public class Constructor_Parameter_Names {
	private int number;
	private boolean bool;
	private String name;
	
	public Constructor_Parameter_Names(int anumber, boolean abool, String aname) { //Constructor 1
		number =anumber;
		bool = abool;
		name = aname;
	}
	public Constructor_Parameter_Names(int number, boolean bool) { //Constructor 2
		this.number =number;
		this.bool = bool;
		//Το τρίτο, θα το αρχικοποιήσει ως null. Δηλαδή θα πάρει την default τιμή.
	}
	
	
	//toString()
	public String toString() {
		return " " + number + " " + bool + " " + name;
	}java\
	
	
	
public static void main (String[] args) {
	
	Constructor_Parameter_Names dfi = new Constructor_Parameter_Names(30, true, "Aleksandros");
	Constructor_Parameter_Names dfi2 = new Constructor_Parameter_Names(20, false);
	
	System.out.println(dfi);
	System.out.println(dfi2);
}
}
