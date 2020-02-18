package ToyExamples;
import java.util.Scanner;
public class Pow_Numbers {
public static void main (String [] args) {	
	Scanner s = new Scanner (System.in);
	System.out.println ("Δώσε την βάση");
	int a = s.nextInt();
	System.out.println ("Δώσε τον εκθέτη");
	int b = s.nextInt();
	int sum = 1;
	for (int i = 0; i<b; i++) {
		sum  = sum * a;
	}
	System.out.println("Το α είς την β είναι " +sum);
}
}
