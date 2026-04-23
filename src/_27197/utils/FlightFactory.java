package _27197.utils;

import _27197.core.*;
import java.util.Date;

public class FlightFactory {

    public static Flight createFlight(String type, String flightNumber, String origin, String destination, double basePrice, int capacity) {

        Date now = new Date();

        switch (type.toLowerCase()) {
            case "domestic":
                return new DomesticFlight("EID-" + flightNumber, "Dom-" + flightNumber, "Active", now, now,
                        flightNumber, origin, destination, basePrice, capacity,
                        25.0, true, "STATE-DC");

            case "international":
                return new InternationalFlight("EID-" + flightNumber, "Int-" + flightNumber, "Active", now, now,
                        flightNumber, origin, destination, basePrice, capacity,
                        150.0, "Requirements apply", true);

            case "cargo":
                return new CargoFlight("EID-" + flightNumber, "Cgo-" + flightNumber, "Active", now, now,
                        flightNumber, origin, destination, basePrice, capacity,
                        5000.0, "General Goods", false);

            case "charter":
                return new CharterFlight("EID-" + flightNumber, "Chrt-" + flightNumber, "Active", now, now,
                        flightNumber, origin, destination, basePrice, capacity,
                        "VIP Charters", true, 2000.0);

            case "emergency":
                return new EmergencyFlight("EID-" + flightNumber, "Emg-" + flightNumber, "Active", now, now,
                        flightNumber, origin, destination, basePrice, capacity,
                        "Medical Evacuation", 1, "Red Cross");

            default:
                System.out.println("Unknown flight type: " + type);
                return null;
        }
    }
}