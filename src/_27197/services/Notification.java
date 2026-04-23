package _27197.services;

import java.time.LocalDateTime;

public class Notification {

    private String notificationId;
    private String message;
    private String recipient;
    private LocalDateTime date;

    public Notification(String notificationId, String message, String recipient, LocalDateTime date) {
        this.notificationId = notificationId;
        this.message = message;
        this.recipient = recipient;
        this.date = date;
    }

    public void sendNotification() {
        System.out.println("Notification sent to " + recipient + ": " + message);
    }
}