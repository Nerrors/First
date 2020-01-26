package Basics;
import java.util.Random;
public class Random_Numbers {
public static void main (String [] args) {
    Random numbers = new Random ();
	int n = numbers.nextInt (49) +1; //Όπως και το Scanner in ...in.nextInt();
	System.out.println(n);
}
}
// Ένας άλλος τρόπος (εκτός με χρήση της κλάσης) είναι ο:
/*double random = Math.random() * 49 + 1;
or
int random = (int )(Math.random() * 50 + 1);
*/