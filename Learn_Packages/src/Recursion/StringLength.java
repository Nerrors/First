package Recursion;

import java.util.Scanner;

public class StringLength {
	static int count = 0;
	
	public static void main(String []args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println ("дЧСЕ щМА String");
		String str = sc.nextLine();
		System.out.println (fibbonaciiMethod(str));
	}

	public static int fibbonaciiMethod (String newstr) {
		  
		 if (newstr.length() <= 0)
		        return count;
		    
		 else {
		    count++;
		      return fibbonaciiMethod(newstr.substring(0, newstr.length()-1)); //ха ейтупысеи тгм сулбокосеияа ле емам ваяайтгяа кицотеяо.
		 }
	}
}

/* аявийопоиоулаи том летягтг ле 0.
 * 
 * вягсилопоиоулаи лиа леходо.
 * 
 * йахе жояа поу тяевеи г леходос г летягтгс аунамеи.
 * 
 * ха сталатгсеи ломо отам то лгйос тгс сглбокосеияас ха цимеи <= апо то лгйос тгс.
*/