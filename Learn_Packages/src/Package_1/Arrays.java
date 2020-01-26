package Package_1;

public class Arrays {
	public static void main (String [] args) {
		int a, b=0, c=0;
		int [] arr1 = new int[100]; // To κάνουμε new για να δηλώσουμε μέγεθος.
		int [] arr3 = {10,20,40,60};
		int [] arr4 = arr3; // int []arr3 = arr4 (για ισότητα).
		int [] [] arr7;
		int [] [] arr2 = new int [100] [100];
		int [] [] arr5 ={ {10,20,30,40},{50,60,70,80},{90,100,110,120,130}, {140,150,160,170} }; // ΠΡΟΣΟΧΗ ΜΕ ΤΑ ΕΞΩΤΕΡΙΚΑ {}
		for (a=0; a<100; a++) {
			arr1[a] = b++;	
			arr2 [a] [a] = c++;
			System.out.println(+arr1[a]);
			System.out.println(+arr2[a] [a]);
			System.out.println((+arr3[0]) + arr3[1] + (+arr3[2]));
			System.out.println((+arr4[0]) + arr4[1] + (+arr4[2]));
		}
}

}
