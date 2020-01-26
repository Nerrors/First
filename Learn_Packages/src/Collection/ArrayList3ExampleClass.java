package Collection;

import java.util.List;
import java.util.ArrayList;

public class ArrayList3ExampleClass {

public static void main (String[] args) {
ArrayList<String> al = new ArrayList<String>();

al.add("Kwstas");
al.add("Angelikh");
al.add("Bibh");
al.add("Aleksandros");
al.add("Unknown");

//Διαγράφει το index 3, δηλαδή τον Αλέξανδρο.
al.remove(3); 

//Αλλάζει Unknown με την Κική.
al.set(3,"kiki");

//Αν υπάρχει το element στην λίστα μας επιστρέφει true, αλλιώς false.
boolean name = al.contains("Kiki");
System.out.println(name);

// Μας εκτυπώνει το index του element.
int number = al.indexOf("Kwstas");
System.out.println (number);

// Μας εκτυπώνει το element του index.
String str = al.get(0);
System.out.println (str);

// Μας εκτυπώνει το μέγεθος της λίστας.
int size = al.size();
System.out.println ("To megethos einai "+ size);

//al.clear(); Για να σβήσει όλα τα στοχεία της λίστας.

printSet(al);
}
public static void printSet(ArrayList<String> newal) { //Θα πρέπει υποχρεωτικά να είναι static.
	
	int sizeofarray = newal.size();
		for (int position = 0; position<sizeofarray; position++) {
		System.out.println (newal.get(position));
		}
	}
}