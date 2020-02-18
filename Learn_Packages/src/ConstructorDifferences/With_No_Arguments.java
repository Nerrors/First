package ConstructorDifferences;

public class With_No_Arguments {
	private int number;
	private boolean bool;
	private String name;
	
	public With_No_Arguments() { //Constructor 1
		number =20;
		bool = true;
		name = "Aleksandros";
	}
	
	//toString()
	public String toString() {
		return " " + number + " " + bool + " " + name;
	}
	
public static void main (String[] args) {
	
	With_No_Arguments dfi = new With_No_Arguments();
	System.out.println(dfi);
}
	
}