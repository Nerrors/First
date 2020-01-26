package Io_Net;

import java.io.PrintWriter;
import java.util.Scanner;

import java.io.InputStreamReader;
import java.io.DataOutputStream;

import java.net.Socket;

public class ClientProg {

public static void main (String[] args) {

//Δημιουργώ κάποιες αρχικοποιήσεις.

int port = 6357;
String ipaddress = "192.168.1.12";

// Αρχικά θα πρέπει να ανοίξουμε τα ρεύματα, μέσω των οποίων θα στέλνουμε και θα λαμβάνουμε μηνύματα.

try {
Socket socket = new Socket (ipaddress, port);
Scanner isr = new Scanner (new InputStreamReader (socket.getInputStream())); // Με αυτή την εντολή, ορίζουμε κατά έναν τρόπο ότι το socket, θα χρησιμοποιήσει αυτό το ρεύμα για την αποστολή δεδομένων.
PrintWriter dos = new PrintWriter (new DataOutputStream(socket.getOutputStream())); // Αντίστοιχα, με αυτή την μέθοδο, ορίζουμε το ρεύμα που θα χρησιμοποιηθεί για την αποστολή δεδομένων, στο Socket.

// Αφού άνοιξα τα ρεύματα, θα πρέπει να στείλω ένα μύνημα στον server, μέσω του ρεύματος.
//Και αυτό θα το κάνω μέσω του ρεύματος εξόδου.

dos.println ("Το στέλνω ένα μήνυμα"); // Ένα πολύ σημαντικό κομμάτι είναι ότι, δεν χρησιμοποιούμαι το System.out.println, αλλά το dos.println, αφού δεν θέλουμε να σταλθούν στην οθόνη του υπολογιστή (δηλαδή στο System) αλλά στο ρεύμα.

dos.flush();
dos.close();
isr.close();

  }
catch (Exception e) {
	System.out.println("Error");	
}
}
        }