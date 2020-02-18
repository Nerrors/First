package ToyExamples;
import java.util.Scanner;
public class MinMaxClass2 {
public static void main (String [] args) {
	Scanner s = new Scanner (System.in);
	int [] arr = new int[10];
	int i, max = 0, min = 10;
	for (i=0; i<10; i++) {
	arr[i] = s.nextInt();
	if (arr[i] < min) {
		min = arr[i];
	}
	if (arr[i] > max) {
		max = arr[i];
	}
		
	}
	System.out.println("Ο μικρότερος αριθμός είναι" + min);
	System.out.println ("Ο μεγαλύτερος αριθμός είναι" + max);	
}
}
