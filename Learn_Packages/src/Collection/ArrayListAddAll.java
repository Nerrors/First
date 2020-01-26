package Collection;

import java.util.ArrayList;

public class ArrayListAddAll {
public static void main (String[] args) {
		
		ArrayList<String> ar1  = new ArrayList<>();
		ar1.add("Kwstas");
		ar1.add("Angelikh");
		ar1.add("Bibh");
		ar1.add("Aleksandros");

		ArrayList<String> ar2  = new ArrayList<>();
		ar2.add("Orestis");
		ar2.add("Victor");
		ar2.add("Theia");
		ar2.add("Theios");
		
		ar1.addAll(ar2);
		System.out.println(ar1);

}
}