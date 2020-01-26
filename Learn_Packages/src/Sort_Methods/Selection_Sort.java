package Sort_Methods;
import java.util.*;
public class Selection_Sort {
	public static void main (String[] args) {
		double [] arr1 = new double[10];
		int i,j;
		double temp; // Δεν μπορούμε να βάλουμε int επειδή θα πάρει τις τιμές του arr1 που ειναι double
		Scanner in = new Scanner (System.in);
		System.out.println ("Dwse 10 times ston pinaka");
		for (i=0; i<10; i++) {
			arr1[i] = in.nextDouble();
		}
		//Selection Sort (Start)
		for (i=0; i<10-1; i++) {
			for (j=i+1; j<10; j++) {
				if (arr1[i] > arr1[j]) {
					temp = arr1 [i];
					arr1 [i] = arr1[j];
					arr1 [j] = temp;
				}
			}
		}//Selection Sort (End)
		System.out.println ("Twra o pinakas einai miatetagmenos");
		for (i=0; i<10; i++) {
			System.out.println(arr1[i]);
		}
	} 
}
