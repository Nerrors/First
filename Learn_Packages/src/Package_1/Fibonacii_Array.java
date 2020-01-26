package Package_1;
import java.util.Scanner;
public class Fibonacii_Array {
public static void main (String[] args) {
	Scanner in = new Scanner (System.in);
	System.out.println("Δώσε έναν αριθμό");
	int size = in.nextInt();
	int [] arr = new int [size];
	arr[0] = 0; // Δεν χρειάζεται να βάλω int arr[0] = 0;. Είναι λάθος.
	arr[1] = 1;
	for (int i = 0; i<size; i++) {
		arr [size] = arr[size-1] + arr [size - 2];
		System.out.println(+arr[i]);	
	}

	
	
}
}
