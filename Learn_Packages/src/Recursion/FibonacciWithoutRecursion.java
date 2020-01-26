package Recursion;

import java.util.Scanner;

public class FibonacciWithoutRecursion {

public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
System.out.println ("Δώσε τον αριθμό");
int number = sc.nextInt();
fibbonaciiMethod(number);
}

public static void fibbonaciiMethod (int newnumber) {
	   
    int old = 0;
    int old2 = 1;
    int result = 0;
    int i = 1;
   
  for (i = 1; i<=newnumber; i++) {
   
    result = old + old2;
    old = old2;
    old2 = result;
   
    System.out.println (result);  
      
            }
  
        }
    
}
