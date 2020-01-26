package Sort_Methods;

import java.util.Scanner;

public class Bubble_Sort {
	public static void main (String[] args) {
		double [] arr1 = new double[10];
		int i,j;
		double temp; // Δεν μπορούμε να βάλουμε int επειδή θα πάρει τις τιμές του arr1 που ειναι double
		Scanner in = new Scanner (System.in);
		System.out.println ("Dwse 10 times ston pinaka");
		for (i=0; i<10; i++) {
			arr1[i] = in.nextDouble();
		}
		//Bubble Sort (Start)
		for (i=1; i<10; i++) {
			for (j=10-1; j<=i; j--) {
				if (arr1[j] == arr1[j-1]) {
					temp = arr1 [i];
					arr1 [i] = arr1[j];
					arr1 [j] = temp; //Πρόβλημα
				}
			}
		}//Bubble Sort (End)
		System.out.println ("Twra o pinakas einai miatetagmenos");
		for (i=0; i<10; i++) {
			System.out.println(arr1[i]);
		}
	} 
}