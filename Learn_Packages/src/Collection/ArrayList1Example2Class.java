package Collection;

import java.util.ArrayList;

public class ArrayList1Example2Class {
	
	static ArrayList<Integer>  ari; //***** Θα πρέπει υποχρεωτικά να είναι static. Γιατί αναφερόμαστε σε αυτή την μεταβλητή σε μια static μέθοδο. Άρα και αυτή θα πρέπει να έιναι static.
								    //***** Την τοποθετούμε εδώ πάνω την μεταβλητή (Και όχι κατευθείαν μέσα στην main), για να μπορεί και η άλλη μέθοδος να την διαβάσει.
	public static void main (String[] ars) {
		
	ari = new ArrayList<>();
	ari.add(10);
	ari.add(560);
	ari.add(56);
	ari.add(10234);
	
	ari.remove(0); // To 0 είναι ο index.
	ari.remove(Integer.valueOf(10));
	//ari.remove(String.valueOf("Stringname")); Εάν είναι String.
	
	
	//Αυτές οι τρείς οι μεθόδοι, παίρνουν όρισμα index.
	
	//hsi.set(2, 7);
	//hsi.get(2);
	//hsi.remove(2);

	getSet3();
}
	
	public static void getSet3 () { // *****Θα πρέπει υποχρεωτικά να είναι static. Γιατί κάνουμε αναφορά αυτής της μεθόδου, σε μια μέθοδο (την main) που είναι εξ'ορισμού static.
	Object[] obj = ari.toArray();   //***** Μπορούμε για να τα αποφύγουμε όλα αυτά, να μην φτιάξουμε μέθοδο, και να βάλουμε τις εντολές μέσα στην main.
	for (Object objs : obj) {
		System.out.println(objs + " ");
	}
}
}

//ΑΠΟΡΙΑ..

//Γιατί όμως όταν στην main αναφερόμαστε σε μια μέθοδο ενός αντικειμένου, που δεν είναι static (η μέθοδος) δεν μας βγάζει σφάλμα?