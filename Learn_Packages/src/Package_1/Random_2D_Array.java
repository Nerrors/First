package Package_1;
import java.util.Random;
public class Random_2D_Array {
public static void main (String [] args) {
	Random numbers = new Random ();
	int [] [] Samples = new int [10] [10];
	for (int i = 0; i<10; i++) {
		for (int j=0; j<10; j++) {
			if (i == j)
				Samples [i] [j] = 0;
			else if (j == 10-i-1) 
				Samples [i] [j] = 1;
			else
				Samples [i] [j] = numbers.nextInt(49) + 1;
			System.out.printf(+ Samples[i] [j] + "  ");
		}
		System.out.println();
	}
	
	
}
}
