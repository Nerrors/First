package Io;

public class IO_Theory {

}

/*
			Όσο αναφορά την ιεραρχία.

Η root κλάση Object χωρίζεται σε 2 τμήματα:
Input Stream και OutputStream

Η κλάση InputStream (abstract) χωρίζεται σε:
FileInputStream, FilterInputStream, ObjectInputStream.

Η κλάση OutpuStream (abstract) χωρίζεται σε:
FileOutputStream, FilterOutputStream, ObjectOutputStream.

Αντίστοιχα οι κλάσεις FilterInput/OutputStream χωρίζονται και αυτές σε:
DataInputStream, DataOutputStream
BufferedInputStream, BufferedOutputStream

Επιπλέον: θα αναφερθούμε και στις  κλάσεις:
File, PrintWriter, Scanner, FileReader, FileWriter, Reader, Writer

			Όσο αναφορά τα Exceptions:
			
Τα βασικότερα είναι τα εξής:
FileNotFoundException, IOException, EOFexception, ObjectStreamException, UTFDataFormatException

			Όσο αναφορά τις μεθόδους που βρίσκονται στις κλάσεις InputStream και OutputStream
			
Επιπλέον οι κλάσεις InputStream και OutputStream, υλοποιούν την κλάση AutoClosable και μπορούμε να χρησιμοποιήσουμε και την μέθοδο .close() η οποία κλείνει έναν πόρο. 
			
InputStream:

close() : void
available() : int
mark (int readlimit) : void
read() : abstract int, int
read(byte[] b) : int
reset() : void
skip() : long

OutputStream:

close() : void
flush() : void
write(byte[] b) : void
write(int b) : abstract void

*/