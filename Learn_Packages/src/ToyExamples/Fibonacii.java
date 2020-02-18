package ToyExamples;
import java.util.Scanner;
public class Fibonacii {
	public static void main (String [] args) {
		int a = 0;
		int b = 1;
		int c = 1;
		Scanner in = new Scanner (System.in);
	System.out.println("Δώσε έναν αριθμό για τον Fibonacci ");
	int number = in.nextInt();
	for (int i=2; i<number; i++) {
		a = b;
		b = c;
		c = a + b;	
		System.out.println("Ο τελικός αριθμός Fibonacci είναι " +a);
	}
	System.out.println("Ο τελικός αριθμός Fibonacci είναι " +c);	
	}
}
