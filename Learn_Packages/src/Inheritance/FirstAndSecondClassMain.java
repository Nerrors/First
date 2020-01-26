package Inheritance;

public class FirstAndSecondClassMain {

public static void main (String[] args) {
	
	FirstClass a = new FirstClass("ddddd ", 5645);
	FirstClass ghgfh = new FirstClass("fffff ", 56475);
	
	//FirstClass.setData("fgdfgfd ");
	//a.setData("ppppppp ");
	
	System.out.println(a);
	System.out.println(ghgfh);
	
	//Από τν στιγμή που κάναμε την μεταβλητή και την μέθοδο static. Η μεταβληρή και για τα δύο αντικείμενα έχει ίδια τιμή
	
	// Ακόμη και να μην χρησιμοποιήσουμε την μέθοδο, απλά με τους δύο κατασκευαστές, η μεταβλητή θα έχει τιμή και στα δύο αντικείμενα.
	// Δηλαδή έτσι όπως είναι το πρόγραμμα (σε αυτή την περίπτωση), και τα δύο printf θα βγάλουν έξοδο:
	
	/*
	
	fffff 56475
	fffff 56475
	
	*/
}

}
