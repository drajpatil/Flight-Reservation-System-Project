package FlightReservationSystem;

import java.util.Date;

import javax.swing.text.Keymap;

public class FlightReservation {
    private String reservationNumber;
    private FlightSchedule flight;
    private Keymap< Customer, FlightSeat> seatMap;
    private Date creationDate;
    private ReservationStatus status;
}
