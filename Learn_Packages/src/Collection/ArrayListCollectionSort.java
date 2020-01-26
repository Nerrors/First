package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListCollectionSort {

public static void main (String[] args) {
	
	ArrayList<Integer> hsi = new ArrayList<>();
	
	hsi.add(5);
	hsi.add(1000);
	hsi.add(4985);
	hsi.add(6);
	hsi.add(6);
	
	Collections.sort(hsi);
	System.out.println(hsi);
	
	Collections.sort(hsi, Collections.reverseOrder());
	System.out.println(hsi);
}
}
