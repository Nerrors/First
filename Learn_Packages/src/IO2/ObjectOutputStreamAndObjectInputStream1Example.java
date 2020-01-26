package IO2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class ObjectOutputStreamAndObjectInputStream1Example {
	
	public static void main (String[] args) {
		
		ObjectOutputStream ois = null;
				
		System.out.println("Δώσε το όνομα του δυαδικού αρχείου");
		Scanner scan = new Scanner (System.in);
		String filename = scan.nextLine();
				
			try {
				ois = new ObjectOutputStream (new FileOutputStream (filename));
				Scanner sc = new Scanner (System.in);
				String text = sc.nextLine();
				ois.writeUTF(text);
				ois.close();
				
			}catch (FileNotFoundException e) {
				System.out.println(e.getStackTrace());
			}catch (IOException e) { // Όταν διαβάζουμε και γράφουμε ένα δυαδικό αρχείο.
				System.out.println(e.getStackTrace());
			}
			
		
			
			
			
	}

}
