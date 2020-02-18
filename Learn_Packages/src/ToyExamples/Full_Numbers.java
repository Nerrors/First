package ToyExamples;

public class Full_Numbers {
public static void main (String  [] args) {
	int i=0;
	int sum=0;
	for (i=0; i<10; i++) { // for (i=0; i<10; i+=2)
		if (i % 2 == 0)
			sum +=i;		
	}
	System.out.println (+ sum);
}
}
