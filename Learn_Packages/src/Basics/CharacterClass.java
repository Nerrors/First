package Basics;

public class CharacterClass {
	public static void main(String []args){
	     
	      int number1 = 55; 
	      String o = "String";
	      String[] s2 = {"Element1", "Element2"}; // Κατά την αρχικοποίηση, δεν χρειάζεται new.
	      char a ='a';
	       
	      System.out.println(Character.isDigit(number1)); // Μπορούμε να χρησιμοποιήσουμε έτσι αυτές τις μεθόδους, επειδή είναι static.
	      System.out.println(Character.isDigit(a));
	      System.out.println(Character.isLetter(number1));
	      System.out.println(Character.isLetter(a));
	      System.out.println(Character.isLetterOrDigit(number1));
	      System.out.println(Character.isLetterOrDigit(a));
	      
	      System.out.println(Character.isLowerCase(number1));
	      System.out.println(Character.isUpperCase(a));
	    
	      System.out.println(Character.toUpperCase(number1));
	      System.out.println(Character.toLowerCase(a));
	     }
	}