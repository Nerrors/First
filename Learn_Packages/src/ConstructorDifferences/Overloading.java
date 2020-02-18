package ConstructorDifferences;

/*
 Το overloading εμφανίζεται όταν διάφορες constructor methods έχουν το ίδιο όνομα 
 αλλά διαφορετικές παραμέτρους.
 
 Compile-time error εμφανίζεται όταν ο compiler δεν μπορεί να ταιριάξει τις παραμέτρους.
 
 Η διαδικασία εύρεσης ενός ταιριάσματος, καλείται overloading resolution.
 */

public class Overloading {
	private int number;
	private boolean bool;
	private String name;
	
	public Overloading() { //Constructor 1
		number =20;
		bool = true;
		name = "Aleksandros";
	}
	public Overloading(String name) { //Constructor 2
		number =20;
		bool = true;
		this.name=name;
	}
	
	//toString()
	public String toString() {
		return " " + number + " " + bool + " " + name;
	}
	
public static void main (String[] args) {
	
	Overloading dfi = new Overloading();
	Overloading dfi2 = new Overloading("Alex");
	System.out.println(dfi);
	System.out.println(dfi2);
}

}


