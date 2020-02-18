package InnerClassPackage;

public class InnerClass3 {
	
	void my_Method() {
	     int num = 23; //******** Εδώ μόνο final επιτρέπεται. Για αυτό είναι καλό να το βάζουμε, σε αντίθεση αυτή την φορά που δεν το έχω βάλει.
	     
	     //-----Inner Local Method-----\\
	     class MethodInner_Demo {   // method-local inner class
	         public void print() {
	        	 
	        	       //******** Για παράδειγμα, εδώ δεν μπορούμε να γράψουμε num = 30;
	            System.out.println("This is method inner class "+ num);	   
	         }   
	      }    
	     //-----------------------------\\
	     
	      MethodInner_Demo inner = new MethodInner_Demo();
	      inner.print();     
	 } 
}

/*

Μια inner-local-method δεν δηλώνεται ποτέ με access specifier/modifier (δηλαδή public ή private),
αφού την βλέπει μόνο η outer μέθοδος στην οποία βρίσκεται.

Για να έχουμε πρόσβαση σε μια Inner-Local-Method θα πρέπει στην Outer-Method που την δημιούργησε να 
δημιουργήσουμε ένα αντικείμενο της inner κλάσης και να καλέσουμε την inner-local μέθοδο.

Για παράδειγμα, δεν μπορούμε να δημιουργήσουμε αντικείμενο της Inner-Local-Method, έξω από την μέθοδο (την Outer) που την δημιούργησε.

Αυτό γίνεται επειδή μόνο η μέθοδος (και κανείς άλλος), της εξωτερικής κλάσης γνωρίζει την ύπαρξη της Inner-Local-Method.

Στο παράδειγμα InnerClass1, δημιουργήσαμε ένα αντικείμενο της inner κλάσης, σε μια μέθοδο της Outer και μετά στην main
δημιουργήσαμε, αντικείμενο της outer για να καλέσουμε την μέθοδο που βρίσκεται το αντικείμενο της inner.

*/