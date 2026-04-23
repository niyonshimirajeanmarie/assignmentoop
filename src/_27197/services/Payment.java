package _27197.services;

public class Payment {

    private String paymentId;
    private double amount;
    private String paymentMethod;
    private String paymentStatus;

    public Payment(String paymentId, double amount, String paymentMethod, String paymentStatus) {
        this.paymentId = paymentId;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
        this.paymentStatus = paymentStatus;
    }

    public void processPayment() {
        paymentStatus = "Completed";
        System.out.println("Payment successful: " + amount);
    }
}