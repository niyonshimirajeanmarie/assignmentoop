package _27197.passenger;

import _27197.core.Flight;
import java.time.LocalDate;

public class Reservation {

    private String reservationId;
    private Passenger passenger;
    private Flight flight;
    private LocalDate bookingDate;
    private String status;

    public Reservation(String reservationId, Passenger passenger,
                       Flight flight, LocalDate bookingDate, String status) {
        this.reservationId = reservationId;
        this.passenger = passenger;
        this.flight = flight;
        this.bookingDate = bookingDate;
        this.status = status;
    }

    public void confirmReservation() {
        status = "Confirmed";
        System.out.println("Reservation confirmed");
    }

    public void cancelReservation() {
        status = "Cancelled";
        System.out.println("Reservation cancelled");
    }

    public void updateReservation() {
        System.out.println("Reservation updated");
    }
}