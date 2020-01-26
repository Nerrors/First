package Exceptionn;
//import java.lang.ArithmeticException;

import java.util.Scanner;

public class Arithmetic {
	public static double divide (int numb1, int numb2) throws ArithmeticException {
		if (numb2 == 0) 
			throw new ArithmeticException ("Error ");
		
	return numb1/numb2;		
	}
	
	
	public static void main (String[] args) {
		int flag = 0;	
		double result;
		int number1, number2;
		
			do {	
		    System.out.println("Give two numbers");
		    Scanner scan = new Scanner (System.in);
		    
		  try {
		    	number1 = scan.nextInt();
			    number2 = scan.nextInt();
			  result =  divide(number1, number2);
			System.out.println("Result: "+ result);
			flag = 1;
			}
			catch (ArithmeticException e) {
				System.out.println(e + "Proglem: Try Again");
		//scan.nextInt();
			}
		}
			while (flag == 0); }

		}
