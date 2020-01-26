package Io_Net;

import java.net.ServerSocket;
import java.net.Socket;

import java.io.PrintWriter;
import java.util.Scanner;

import java.io.InputStreamReader;
import java.io.DataOutputStream;

public class ServerProg {

	public static void main (String[] args) {

	ServerSocket ssocket = null;
	int port = 6367;
	String s = null;

	try {
	ssocket = new ServerSocket (port);
	Socket socket = ssocket.accept();

	// Με τις 2 παρακάτω εντολές, δημιουργούμε τα ρεύματα.
	// Χρησιμοποιούμαι τις ίδιες κλάσεις(PrintWriter, Scanner) με αυτές στα ρεύματα των αρχείων κειμένων.
	
	Scanner	isr = new Scanner (new InputStreamReader (socket.getInputStream()));
	PrintWriter dos = new PrintWriter (new DataOutputStream (socket.getOutputStream()));

	//Για να διαβάσουμε το μήνυμα που έστειλε ο Client.
	while (isr.hasNextLine()) {
	s = isr.nextLine(); // Λαμβάνουμε τα μηνύματα από τον client, και τα αποθηκεύουμε στην μεταβλητή s.
	System.out.println (s); // Λαμβάνουμε το κείμενο από το client, με χρήση του ρεύματος, και το εμφανίζουμε στην οθόνη του υπολογιστή μας (δηλαδή, στο σύστημα).
	}

	dos.flush(); // Για να αδειάσει το ρεύμα. ΠΡΟΣΟΧΗ μόνο για το Output.
	isr.close();
	dos.close();
	
	}
	catch (Exception e) {
	System.out.println("Error");	
		}
	}
}

/* Για πολλαπλούς Clients.

while(true) {	
	Socket socket = serverSocket.accept();
	Thread thread = new ThreadClass(Socket);
	thread.start();
}
 */
	
