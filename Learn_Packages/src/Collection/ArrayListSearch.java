package Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListSearch {
	
static ArrayList<String> ar;	
	
public static void main (String[] args) {
		
		ar  = new ArrayList<>();
		ar.add("Kwstas");
		ar.add("Angelikh");
		ar.add("Bibh");
		ar.add("Aleksandros");
		
		
		System.out.println("Δώσε ένα string");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		System.out.println(search(str));
	}

	private static String search(String str) {
		String st = "Δεν υπάρχει";
		
		for (int i = 0; i<ar.size(); i++) {
			if ( ar.get(i).equals(str))
				return "Υπάρχει" ;
		}
		return st;
	}
}


/*
 * 	private static String search(String str) {
		String st = "Δεν υπάρχει";
		
		for (int i = 0; i<ar.size(); i++) {
			if ( ar.get(i).equals(str))
				st = "Υπάρχει";
				return st ;
		}
		return st;
	}
 */
