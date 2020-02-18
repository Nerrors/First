package InnerClassPackage;

class Outer_Demo {
   int num;
   
   // Accessing he inner class from the method within
   void display_Inner() {
      Inner_Demo inner = new Inner_Demo();
      inner.print();
   }  
   
   
   // inner class
   private class Inner_Demo {
	   
	   public void print() {
       System.out.println("This is an inner class" + num);
      }
   }
}


/*

Φυσικά μόνο οι εσωτερικές κλάσεις μπορούν να δηλωθούν private ή protected. Και όπως θα δούμε και παρακάτω και static.

’ρα μια εξωτερική μέθοδος έχει πρόσβαση σε μια μέθοδο που βρίσκεται μέσα στην εσωτερική κλάση,
μόνο εάν φτιάξει ένα αντικείμενο της κλάσης.

Από την στιγμή που η inner κλάση δεν είναι static, δεν μπορεί να έχει static fields και methods.

*/