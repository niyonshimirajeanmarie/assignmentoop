package _27197.services;

import _27197.flight.Flight;
import _27197.operations.Gate;
import java.time.LocalDateTime;

public class Schedule {

    private String scheduleId;
    private Flight flight;
    private Gate gate;
    private LocalDateTime departureTime;

    public Schedule(String scheduleId, Flight flight, Gate gate, LocalDateTime departureTime) {
        this.scheduleId = scheduleId;
        this.flight = flight;
        this.gate = gate;
        this.departureTime = departureTime;
    }
}