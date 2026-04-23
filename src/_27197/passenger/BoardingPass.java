package _27197.passenger;

import java.time.LocalDateTime;

public class BoardingPass {

    private String boardingPassId;
    private Ticket ticket;
    private String gateNumber;
    private LocalDateTime boardingTime;

    public BoardingPass(String boardingPassId, Ticket ticket,
                        String gateNumber, LocalDateTime boardingTime) {
        this.boardingPassId = boardingPassId;
        this.ticket = ticket;
        this.gateNumber = gateNumber;
        this.boardingTime = boardingTime;
    }

    public void displayBoardingPass() {
        System.out.println("Boarding Pass ID: " + boardingPassId);
        System.out.println("Gate: " + gateNumber);
        System.out.println("Boarding Time: " + boardingTime);
    }
}