package ConstructorDifferences;

/*
 Εάν δεν ορίσουμε ρητά ένα πεδίο σε έναν constructor, αυτόματα θα ορίσει τις προεπιλεγμένες τιμές:
 
  number -> 0
  boolean -> false
  object -> null 
  
 */

public class Default_Field_Intiliazation {
	
	private int number;
	private boolean bool;
	private String name;
	
	//toString()
	public String toString() {
		return " " + number + " " + bool + " " + name;
	}
	
public static void main (String[] args) {
	
	Default_Field_Intiliazation dfi = new Default_Field_Intiliazation();
	System.out.println(dfi);
}
	
}
