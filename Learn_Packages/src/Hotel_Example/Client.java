package Hotel_Example;
/**
*
* @author George
*/
public class Client { // Δηλώνει 2 μεταβλητές για τον χρήστη.

   private String name;
   private String telephone;

   /**
    * Creates a new instance of Client
    */
   public Client(String name, String telephone) {
       this.name = name;
       this.telephone = telephone;
   }

   public String getName() {
       return name;
   }

   public String getTelephone() {
       return telephone;
   }

}
