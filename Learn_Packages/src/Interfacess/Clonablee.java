package Interfacess;

/*
 *  Η διεπαφή Cloneable είναι μια ειδική περίπτωση επειδή είναι κενή. Δηλαδή είναι διεπαφή σηματοδότης.
 * 
 * Χρησιμοποιείται για να δηλώσει ότι ότι μια κλάση περιέχει συγκεκριμένες επιθυμητές ιδιότητες.
 * 
 * Στο παρακάτω παράδειγμα, έχουμε κλωνοποιήσει το αντικείμενο obj1 στο αντικείμενο obj2.
 * 
 * Η κλάση μας Clonablee κάνει overrides την μέθοδο clone() της κλάσης Object.	
 * 
 * Το πρόγραμμα θα πετάξει exception εάν δεν κάνουμε Implements το interface Clonable.
 * 
 * Ο έλεγχος θα πρέπει να γίνεται έτσι: obj1.equals(obj2) και όχι obj1 == obj2.
 * 
 */


public class Clonablee implements Cloneable {

	   private String dname;

	   public Clonablee (String dname) {
		this.dname = dname;
	   }

	   public String getName() {
		return dname;
	   }
	   
	   public void setName(String dname) {
		   this.dname = dname;
	   }
	   public String toString () {
		   return dname;
	   }
	   
	   public Object clone() throws CloneNotSupportedException { 
		   return (Clonablee)super.clone();
	   }
	   
	 ///--------------------------------------------------\\\  
	   
 public static void main (String[] args) {
		   
  Clonablee cl1 = new Clonablee ("Tommy");
		   
   try {
			   
		Clonablee cl2 = (Clonablee) cl1.clone();
		System.out.println(cl1);
		System.out.println(cl2);
		
		if (cl1.equals(cl2) == true)
			System.out.println("True");
		else
			System.out.println("False");
			   
		  } catch (CloneNotSupportedException e) {
		   e.printStackTrace();
		  }	   
	 }
}

// Δεν πρέπει να το κάνουμε έτσι Clonablee cl1 = cl2; γιατί απλά δίνουμε 2 ονόματα στο ίδιο το αντικείμενο.

