package Basics;
import java.math.BigInteger;
import java.math.BigDecimal;
import java.util.ArrayList;

public class NumberClass {
public static void main (String[] args) {
	Number max = 0;
	
	ArrayList <Number> al = new ArrayList<>();
	BigInteger num = new BigInteger("879879879");
	BigInteger num3 = new BigInteger("979879879");
	BigDecimal num2 = new BigDecimal ("2312313.323121");
	
	al.add(num);
	al.add(num2);
	al.add(num3);
	
	Number ab = al.get(0); // Προσοχή, θα πρέπει να αρχικοποιηθεί.
	try {	
	if (al == null || al.size() == 0 ) { //| al.isEmpty() Είναι το ίδιο πράγμα.
		System.out.println("Empty"); // Έλεγχος ΠΟΛΥ ΣΗΜΑΝΤΙΚΟΣ ΑΛΛΑ ΔΕΝ ΔΟΥΛΕΥΕΙ!
	}
	else {
		for (int i = 0; i<al.size(); i++) {
			if (al.get(i).doubleValue() > ab.doubleValue()) { //Την doubleValue, γιατι την γράφουμε έτσι.
			ab = al.get(i).doubleValue();	
			}
		}
		System.out.println(ab);
		}
	}
	catch (IndexOutOfBoundsException e) {
	e.getStackTrace();	
	}
	}
}

/*
 *  Οι μέθοδοι intValue(), longValue(), FloatValue(), doubleValue() δεν μπορούν να υλοποιηθούν στην κλάση Number, και ορίζονται ως αφηρημένες μεθόδους.
 * 
 * H byteValue() και η shortValue υλοποιούνται από την intValue()
 * public byte byteValue() {
 * return (byte) intValue();
 * }
 * public short shortValue () {
 * return (short) intValue();
 * }
 * 
*/