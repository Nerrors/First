package Hotel_Example;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author George
 */
public class Hotel {
    private List<Reservation> reservations; // Δημιουργούμε μια λίστα από κρατήσεις με τύπο Reservation επειδή στο reservation έχουμε όλες τις πληροφορίες για τον πελάτη, για το ξενοδοχείο, και για το δωμάτιο.
    private List<Room> rooms; // Η Room έχει και την κλάση Type αλλά και μια λίστα reservation, που ελέγχει με την χρήση της Period p εάν είναι διαθέσιμο το δωμάτιο.
    
    public Hotel() {
        reservations=new ArrayList<>();
        rooms=new ArrayList<>();
       
        Room r1 = new Room(RoomType.SINGLE);
        r1.setRoomNumber(100);
        rooms.add(r1);
        
        Room r2 = new Room(RoomType.DOUBLE);
        r2.setRoomNumber(200);
        rooms.add(r2);
        
        Room r3 = new Room(RoomType.SINGLE);
        r3.setRoomNumber(101);
        rooms.add(r3);
        
    }
    public Reservation makeReservation(Period period, Client client, RoomType roomType) {// Έτσι γίνεται
        List<Room> r=roomsOfType(roomType); // Θα έχει τύπο επιστροφής το Reservation (Δηλαδή τις πληροφορίες για τον πελάτη, δωμάτιο + τύπο, και την περίοδο).
        for (Room room : r) {
            boolean free = room.available(period);
            
           if (free) { // Εάν είναι διαθέσιμο
                Reservation newR = new Reservation(period,client,room); // Έτσι γίνεται // Τότε κάνε την κράτηση. // ***** Είναι σαν να έχουμε public int test (int a, int b). Reservation re = new Reservation (a, b).
                reservations.add(newR);// Το προσθέτουμε και στην λίστα.
                room.addReservation(newR);
                return newR;
            }
        }
        return null;
    }
    
    private List<Room> roomsOfType(RoomType roomType) {
        List<Room> rts = new ArrayList<>();
        for (Room r : rooms) {
            if (r.getRoomType()==roomType) {
                rts.add(r);
            }
        }        
        return rts;
    }
    
    //Reservation get και set.
    
    public void addReservation(Reservation r) {
        reservations.add(r);
    }
    
    public List<Reservation> getReservations() {
        return reservations;
    }
}

