package Arrays;


public class Array_2D {
public static void main (String []args) {
	int i,j;
	int [] [] arr_1 = new int [10] [10]; 
	for (i=0; i<10; i++) {
		for (j=0; j<10; j++) {
			if (i<j) {
				arr_1 [i] [j] = 1;
			}
				else {
				arr_1 [i] [j] = 0;
				
				}
			System.out.print(+arr_1 [i] [j]);
			}
		System.out.println();
		}	
	}	
}
/* Result:
 * 0 1 1 1 1 1 1 1 1 1
 * 0 0 1 1 1 1 1 1 1 1
 * 0 0 0 1 1 1 1 1 1 1
 * 0 0 0 0 1 1 1 1 1 1
 * 0 0 0 0 0 1 1 1 1 1
 * 0 0 0 0 0 0 1 1 1 1
 * 0 0 0 0 0 0 0 0 1 1
 * 0 0 0 0 0 0 0 0 0 1
 */

