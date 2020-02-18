package EnumPackage;

public class EnumClassTest {

	public static void main(String[] args) {
		EnumClass ec;
		ec = EnumClass.Polygon;
		System.out.println(ec);
		
		System.out.println(EnumClass.Polygon.toString()); // Μπορούμε και έτσι.
		
		//-----------\\
		
		EnumClass ec2 = Enum.valueOf(EnumClass.class, "Polygon"); // Ορίζει στο ec2 το EnumClass.Polygon.
		System.out.println(ec2);
		
		//-----------\\
		
		// Κάθε enumarated type έχει μια static μέθοδο, την value() που επιστρέφει έναν πίνακα με όλες τις τιμές.
	
		EnumClass [] ec3 =  EnumClass.values();
		for (int i=0; i<ec3.length; i++) {
			System.out.println(ec3[i]);
		}
		
		//-----------\\
		// Μπορούμε εάν επιθυμούμε, να προσθέσουμε constructors, methods και πεδία. Για παράδειγμα:
		
		/*
		  
		  
		 
		  
		  
		 
		 */
		 */
	}
}
