package Hotel_Example;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author George
 */
public class Room {
    private List<Reservation> reservations; // Τοποθετούμε σε μια λίστα όλα τα δεδομένα που έχει συλλέξη η κλάση Reservation.
    private RoomType roomType; // Παίρνουμε και τον τύπο.
    private Period p;
    private int roomNumber; // Δεν την αρχικοποιούμε στον κατασκευαστή.
    
    public Room() {
        reservations = new ArrayList<>();  // Την λίστα δεν θέλουμε να την πειράξουμε.
        p.getStartDate();
    }
    public Room(RoomType roomType) {
        reservations = new ArrayList<>();
        this.roomType=roomType; // Μόνο το roomType δεν έχει δηλωθεί σαν όρισμα (όυτε και στην κλάση Reservation (που έχει τις κλάσεις Client, Room, Period).)
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void addReservation(Reservation reservation) { // Άρα στον ορισμό της μεθόδου θα πρέπει να δώσουμε τα 3 αντικείμενα.
        this.reservations.add(reservation); // Η add είναι μια μέθοδος της λίστας.
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }
    
    public int getRoomNumber() {
        return roomNumber;
    }

  
    
    // Μέθοδος ελέγχου.
    
    public boolean available(Period period) {
        for (Reservation rsv : reservations) {
            if (rsv.overlaps(period)) {
                return false;
            }
        }
        return true;
    }
    
    
    
}
