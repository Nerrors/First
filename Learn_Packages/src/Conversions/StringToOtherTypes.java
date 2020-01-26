package Conversions;

public class StringToOtherTypes {
	
	public static void main (String[] args) {
		
		String a = "20";
		String f = "HelloWorld";
		int b = Integer.parseInt(a);
		double g = Double.parseDouble(a);
		char[] alex = f.toCharArray();
		
		System.out.println(b);
		System.out.println(g);
		System.out.println(alex[1]); //Εάν θέλουμε να εκτυπώσουμε όλο το char, χρησιμοποιούμαι μια for.
		
	//Εάν αντί για έναν αριθμό στο String, βάλουμε συμβολοσειρά, θα μας βγάλει error.
	
	//Ένας άλλος τρόπος είναι και με χρήση της μεθόδου valueOf();
		
		String y = "20";
		int p = Integer.valueOf(y);
		System.out.println(y);
	}
	
	//****** Η parseInt και η valueOf είναι static, για αυτό μπορούμε να τις γράψουμε έτσι.
}

