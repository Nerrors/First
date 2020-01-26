package Io;
import java.io.FileOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.EOFException;
import java.io.FileNotFoundException;

public class FileInputWriterClass {
	
public static void main (String[] args) {
	try {
	File file = new File ("C:\\Users\\Aleksandros\\Eclipse Projects\\Project_1\\src\\Basics\\text.txt");
	FileOutputStream fis = new FileOutputStream (file, true);
	fis.write(8467567);
	
	}
	catch (IOException e) {
		System.out.println("File Not Found");
	}
}
}

/* ΠΡΟΣΟΧΗ: Οι κλάσεις FileInputStream και FileOutputStream δεν εισάγουν νέες μεθόδους,
 * και κληρονομούνται οι μεθόδοι από τις κλάσεις InputStream και OutputStream.
 *
 * Επομένως, η κλάση FileInputStream δημιουργεί ένα (δυαδικό) αρχειο text.txt και εισάγει μέσα τον αριθμό 8467567.
 * 
 * Το πολύ θετικό που έχει η κλάση FileOutputStream είναι το , true
 */