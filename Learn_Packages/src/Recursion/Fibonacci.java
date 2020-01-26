package Recursion;

import java.util.Scanner;

public class Fibonacci {

	static int old = 0; //’ν τους βάζαμε τους αριθμούς μέσα στην main, συνέχεια θα αρχικοποιούνταν και η έξοδος θα μας εμφάνιζε μόνο τον αριθμό 1.
	static int old2 = 1;
	static int result = 0;
	static int i = 1;
	    
	public static void main(String []args){
		
	
	Scanner sc = new Scanner(System.in);
	System.out.println ("Δώσε τον αριθμό");
	int number = sc.nextInt();
	fibbonaciiMethod(number); //*******ΔΕΝ ΧΡΕΙΑΖΕΤΑΙ ΕΔΩ ΝΑ ΒΑΛΟΥΜΕ System.out.println (fibbonaciiMethod(number)); από την στιγμή που έχουμε sysout μέσα στην μέθοδο.
	}
	
	
	public static int fibbonaciiMethod (int newnumber) {
	    
	    if ( newnumber == 1)
	        return result;

	    else {
	    		result = old + old2;
	    		old = old2;
	    		old2 = result;
	    		System.out.println (result);  
	    		
	    		return fibbonaciiMethod (newnumber-1); // Κάποτε θα γίνει το newnumber == 1 και θα τερματίσει.
	    
	        }
	    }
	}

/* 
[1] = 1 + 1, [1] = 2
[2] = 1 + 2, [2] = 3
[3] = 2 + 3, [3] = 5    
[4] = 3 + 5, [4] = 8
*/     
