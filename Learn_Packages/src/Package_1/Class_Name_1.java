package Package_1;
import java.util.*;
public class Class_Name_1 {
public static void main (String [] args) {
	Scanner in = new Scanner (System.in);
	int a = 10;
	int b;
	int c=0;
	String s1 = new String ();
	String s2 = new String ();
	int [] arr1 = new int[100];
	arr1 [0] = 100;
	for (a=0; a<10; a++)
	{
		arr1[a] = c++;
		System.out.println("Αυτη την στιγμη το arr1[a] ειναι" + arr1[a] );
	}
	System.out.println(arr1[0]);
	System.out.println ("H timh tou arr[0] einai" +(arr1[0]));
	System.out.println("Dwse mia timh");
	b = in.nextInt();
	System.out.println("H timh pou edwses einai " +b);
	s1 = "Ti kaneis kala eisai";
	s2 = "Nai, kala eimai";
	System.out.println ((s1) + (s2));
	System.out.println ("Kala eimai nai" +a +s1 + (s2)); //Οταν γραφουμε μηνυμα και μετα τιμή η String δεν μπορούμε να βάλουμε μέσα σε παρένθεση '+', εκτός από την περίπτωση όταν θέλουμε να κάνουμε pintln έναν αριθμό (Και όχι String).
	System.out.printf("%s %d", s1 , a);
	System.out.println(a);
	System.out.println(+(a) +b);
	System.out.println(s1);
	
}
}
