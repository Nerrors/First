package Exceptionn;
import java.util.Scanner;
import java.util.*;

public class MismatchException {
public static void main (String[] args) {
int flag = 0;	
int a;
	do {	
    System.out.println("Give an Integer");
    Scanner scan = new Scanner (System.in); // Θα πρέπει οποσδήποτε να βρίσκεται μέσα στην do για να περιμένει μέχρι ο χρήστη δώσει έναν αριθμό, και να μην βρίσκεται συνέχεια σε loop.
	try {
	a = scan.nextInt();
	System.out.println("Your Integer: "+ a);
	flag = 1;
	}
	catch (InputMismatchException e) {
		System.out.println("Proglem");
	//scan.nextInt();
	}
}
	while (flag == 0); }

}

// άρα θα πρέπει να βάλουμε το try Exception εκεί που ο χρήστης πάει να βάλει έναν αριθμό.