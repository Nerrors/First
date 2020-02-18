package Io;
import java.io.File;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileOutputStream;


public class DataInputStreamProgram {
public static void main (String[] args) {
	try {
	File file = new File ("C:\\Users\\Aleksandros\\Eclipse Projects\\Project_1\\src\\Basics\\text2.txt");
	FileOutputStream fos = new FileOutputStream (file);
	DataOutputStream dos = new DataOutputStream(fos);
	dos.writeUTF("Hello World");
	}
	catch (IOException e) {
		System.out.println("Eroor");
		
	}
} 
}


/*

Οι ροές DataInputStream και DataOutputStream, διαβάζουν και γράφουν τιμές πρωτογενών τιμών της java και αλφαριθμητικά
με έναν τρόπο ανεξάρτητο από την μηχανή, επομένως, ένας άλλος σε μια διαφορετική μηχανή μπορεί να τα διαβάσει αυτά τα δεδομένα.

*/