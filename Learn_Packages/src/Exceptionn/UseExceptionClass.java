package Exceptionn;
import java.util.Scanner;
public class UseExceptionClass {
	int a;
	
	public static void main (String [] args) {
	Example_2 a = new Example_2 ();
	a.doit();
	}

public void doit() {
	try {
		Scanner keyboard = new Scanner (System.in);
		System.out.println("Enter the number of donuts");
		a = keyboard.nextInt();
		System.out.println("Enter the number of milks");
		int b = keyboard.nextInt();
	
	if (b<0) {
		ExceptionClass j = new ExceptionClass ("Error"); // Με αυτόν τον τρόπο, χρησιμοποιούμε τον δεύτερο κατασκευαστή της κλάσης που ορίσαμε (Exception Class).
		throw j;
	}
		double c = a / b;
		System.out.println(c);
	
	}
	catch (ExceptionClass e) {

		System.out.println(e.getMessage());
		System.out.println("Please buy some milks");
		tryagain(a);
		}
	System.out.println("End program");
	}

public void tryagain(int g) {
	a = g;
	Scanner keyboard2 = new Scanner (System.in);
	System.out.println("Enter the number of milks again");
	int r = keyboard2.nextInt();
	int result = g/r;
	System.out.println(result);
	}
}

