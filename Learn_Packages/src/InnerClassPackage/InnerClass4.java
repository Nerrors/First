package InnerClassPackage;

public class InnerClass4 {
	static int b = 50; //Για παράδειγμα σε αυτή την μεταβλητή δεν έχει πρόσβαση η Inner κλάση. Θα πρέπει να είναι static.
	
	static void rrr() {
		System.out.println("sdfsdfsdfsfdsfd");
	}
	
	static class Nested_Demo {
		public void my_method() {
			int a = 50;
			b = 100;
			System.out.println("This is my nested class " + a + " " + b);
			rrr();
		
		/* Αυτό όμως μπορούμε να το κάνουμε εάν θέλουμε να έχουμε πρόσβαση στα outer members (χωρίς να είναι static).
		
			InnerClass4 inn = new InnerClass4();
			return inn.b;
		
	    */
		}
	}
}


/*
 
Φυσικά μόνο οι εσωτερικές κλάσεις μπορούν να δηλωθούν static.

Είναι ένα static member μιας outer κλάσης.

***Σε αντίθεση με τις κανονικές inner κλάσεις, οι static inner classes μπορούν να έχουν static fields και methods.

Ακριβώς όπως τα static members, μια static nested κλάση, δεν έχει πρόσβαση στις μεταβλητές και στις μεθόδους της outer κλάσης.
εκτός αν είναι static. 

Οι static inner classes δεν απαιτούν την δημιουργία (την πρόσβαση) ενός Outer αντικειμένου.

*/