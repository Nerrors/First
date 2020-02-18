package Basics;

public class StringMethods2 {

	public static void main(String[] args) {
        
        String s1 = "Γεια σου τι κάνεις?"; // Η String είναι κανονική κλάση. Που περιέχει τις παρακάτω μεθόδους. Και τώρα κάνουμε μια αναφορά σε αυτήν.
        String s2 = "Καλά είμαι εσύ?";
        
        System.out.println(s1 + s2);
        System.out.println(s1.length()); // ΠΡΟΣΟΧΗ. Η μέθοδος length σκέτο, είναι για να βρίσκουμε το μέγεθος ενός array.
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.trim()); // Κόβει όλα τα κενά από μια συμβολοσειρά.
        
        System.out.println(s1.charAt(0));
        System.out.println(s1.concat(s2));
        System.out.println(s1.compareTo(s2));
        
        System.out.println(s1.contains("Γειά"));
  
        System.out.println(s1.replace('ρ', 'α'));
        System.out.println(s1.replaceAll("Γεια", "τι κάνεις"));
        
        System.out.println(s1.hashCode());
        
        System.out.println(s1.substring(0, 3)); // Θα εκτυπωθεί το Γει.
     
      // System.out.println (s1.startWith("Γ"));
      // System.out.println (s1.endWith("?"));
       
		char[] ar;
		ar = s1.toCharArray();
		for (int i =0; i <ar.length; i++) { // Δεν μπροούμε να χρησιμοποιήσουμε την μέθοδο .length() επειδή διαβάζει μόνο String arrays.
			System.out.print(ar[i]);
		}
   }
}