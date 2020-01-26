package Io;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.EOFException;
import java.util.Scanner;

public class BinaryFiles {
	
	public static void main (String[] args) {
		// Από εδώ και κάτω, δημιουργούμε ένα binary αρχείο και του εισάγουμε δεδομένα.
		try {
		ObjectOutputStream oos = new ObjectOutputStream	
				(new FileOutputStream
						(new File ("C:\\Users\\Aleksandros\\Documents\\maya\\projects\\default\\images\\t.txt")));
		oos.writeInt(200000);
		oos.writeUTF("Γεια σου τι κανεις");
		oos.close();
		
		// Από εδώ και κάτω τα εμφανίζουμε στην κονσόλα.
		
		ObjectInputStream ois = new ObjectInputStream (new FileInputStream (new File ("C:\\Users\\Aleksandros\\Documents\\maya\\projects\\default\\images\\t.txt")));
		int i = ois.readInt();
		String utf = ois.readUTF();
		System.out.println(i + "\n" + utf);
		}
		catch (FileNotFoundException e) {
			System.out.println("File Not Exist");
			
		}
		catch (IOException e) {
			System.out.println("Problem with output to file");
			
		}
	}
}

/* ***ObjectOutputStream/ObjectInputStream Methods***
 * 
 * ObjectOutputStream
 * 
 * close(); (void)
 * drain(); (protected void)
 * flush(); (void)
 * reset(); (void)
 * defaultWriteObject(); (void)
 * writeBoolean, Byte, Char (int val), Chars (String str)
 * writeClassDescriptor(ObjectStreamClass desc) (protected void)
 * writeDouble, Fields, Long, Object, Short, Long, Float, Int, UTF
 * 
 * ObjectInputStream
 * 
 * available(); (int)
 * close(); (void)
 * defaultWriteObject(); (void)
 * read();
 * readBoolean();
 * readByte();
 * readChar, Double, Float, Int, Short, Long, Object, UTF();
 * readStreamHeader(); (protected void)
 * 
 */
