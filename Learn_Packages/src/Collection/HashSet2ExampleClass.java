package Collection;

import java.util.HashSet;

public class HashSet2ExampleClass {


	public static void main (String[] args) {
	
	HashSet<Integer> hsi = new HashSet<>();
	
	hsi.add(5);
	hsi.add(1000);
	hsi.add(4985);
	hsi.add(6);
	hsi.add(6);
	
	System.out.println(hsi);
	}
}