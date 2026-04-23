package _27197.main;

import _27197.core.AirportManager;
import _27197.core.Flight;
import _27197.passenger.Passenger;
import _27197.passenger.Ticket;
import _27197.passenger.Reservation;
import _27197.passenger.BoardingPass;
import _27197.utils.FlightFactory;
import _27197.utils.InputValidator;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;

public class AirportSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Advanced Airport Management System ===");

        AirportManager manager = new AirportManager("AM001", "Kigali System", "Active",
                new Date(), new Date(), "Kigali International Airport", 1, "Admin");

        while (true) {
            System.out.println("\n--- Main Menu ---");
            System.out.println("1. Create a Booking (Demonstrate Passenger, Flight, Reservation)");
            System.out.println("2. Manage System ");
            System.out.println("3. Exit");
            int choice = InputValidator.getValidPositiveInt(sc, "Please select an option: ");

            if (choice == 1) {
                createBookingFlow(sc);
            } else if (choice == 2) {
                manager.displaySummary();
                manager.validateEntity();
                manager.createReservation();
                manager.processPayment();
                manager.generateReceipt();
                manager.trackStatus();
            } else if (choice == 3) {
                System.out.println(" Goodbye feel free to reconnect again please !");
                break;
            } else {
                System.out.println("Invalid selection.");
            }
        }
        sc.close();
    }

    private static void createBookingFlow(Scanner sc) {
        System.out.println("\n-- Wellcome to Booking page  --");
        String fullName = InputValidator.getValidString(sc, "Enter Passenger Full Name: ");
        String passport = InputValidator.getValidPassport(sc, "Enter Passport Number ( MAKESURE ITS >=6 ): ");
        String phone = InputValidator.getValidString(sc, "Enter Phone Number: ");
        String nat = InputValidator.getValidString(sc, "Enter Nationality: ");
        
        Passenger passenger = new Passenger("P100", fullName, passport, nat, phone);
        System.out.println("\n" + passenger.toString() + " registered successfully.");

        System.out.println("\nAvailable Flight Types: Domestic, International, Cargo, Charter, Emergency");
        String fType = InputValidator.getValidString(sc, "Enter chosen flight type: ");
        String fNum = InputValidator.getValidFlightId(sc, "Enter Flight Number (Ex: FL100): ");
        double bp = InputValidator.getValidPositiveDouble(sc, "Enter Base Price: ");

        Flight flight = FlightFactory.createFlight(fType, fNum, "Kigali", "Destination", bp, 200);
        
        if (flight == null) {
            System.out.println("Failed to create flight. Booking aborted.");
            return;
        }

        flight.updateDetails();
        flight.displaySummary();
        System.out.println("Calculated Final Flight Price: $" + flight.calculateFinalPrice());

        Reservation res = new Reservation("RES" + System.currentTimeMillis(), passenger, flight, LocalDate.now(), "Pending");
        res.confirmReservation();

        System.out.println("\nProcessing Payment...");
        System.out.println("Payment Successful!");

        String seat = InputValidator.getValidString(sc, "Select Seat (e.g. A12): ");
        while (!InputValidator.isValidSeat(seat)) {
            System.out.println("Invalid seat format.");
            seat = InputValidator.getValidString(sc, "Select Seat (e.g. A12): ");
        }

        Ticket ticket = new Ticket("TKT-999", passenger, flight, seat, "Economy", flight.calculateFinalPrice());
        System.out.println("\n-- Generating Ticket --");
        ticket.generateTicketDetails();

        System.out.println("\n-- Generating Boarding Pass --");
        BoardingPass bpObj = new BoardingPass("BP-" + System.currentTimeMillis(), ticket, "Gate 4", LocalDateTime.now().plusHours(2));
        bpObj.displayBoardingPass();
    }
}