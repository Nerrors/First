package ToyExamples;

import java.util.Scanner;

public class OddNumbers {
	
	static int count = 0;
	static int sum = 0;

	public static void main(String []args){


	Scanner sc = new Scanner(System.in);
	System.out.println ("Δώσε ένα integer");
	int str = sc.nextInt();
	fibbonaciiMethod(str);
	}
	
	public static int fibbonaciiMethod (int newstr) {   
		int i;
		for (i = 0; i<=newstr; i++) { //Προσοχή, πρέπει να βάλουμε και το =.
		if (i % 2 == 0) {
		       count++;
		       sum += i; 
		       System.out.println(count + " " + sum);
		       }
		}
		return count; //το ξέρω ότι αυτό δεν χρησιμεύει κάπου.
		}
	}
