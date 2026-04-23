package _27197.utils;

import java.util.Scanner;

public class InputValidator {

    public static boolean isEmpty(String input) {
        return input == null || input.trim().isEmpty();
    }

    public static boolean isValidPassport(String passport) {
        return passport != null && passport.matches("[A-Z0-9]{6,15}");
    }

    public static boolean isPositive(double value) {
        return value > 0;
    }

    public static boolean isValidFlightId(String id) {
        return id != null && id.matches("FL\\d+");
    }

    public static boolean isValidSeat(String seat) {

























































        return seat != null && seat.matches("[A-Z]\\d+");
    }

    // New validation methods
    public static String getValidString(Scanner scanner, String prompt) {
        String input;
        do {
            System.out.print(prompt);
            input = scanner.nextLine();
            if (isEmpty(input)) {
                System.out.println("Error: Input cannot be empty. Please try again.");
            }
        } while (isEmpty(input));
        return input;
    }

    public static double getValidPositiveDouble(Scanner scanner, String prompt) {
        double value = -1;
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine();
            try {
                value = Double.parseDouble(input);
                if (isPositive(value)) {
                    break;
                } else {
                    System.out.println("Error: Value must be positive.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Invalid numeric format.");
            }
        }
        return value;
    }
    
    public static int getValidPositiveInt(Scanner scanner, String prompt) {
        int value = -1;
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine();
            try {
                value = Integer.parseInt(input);
                if (value > 0) {
                    break;
                } else {
                    System.out.println("Error: Value must be positive.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Invalid integer format.");
            }
        }
        return value;
    }

    public static String getValidPassport(Scanner scanner, String prompt) {
        String input;
        do {
            System.out.print(prompt);
            input = scanner.nextLine();
            if (!isValidPassport(input)) {
                System.out.println("Error: Invalid passport format. Must be at least 6 alphanumeric characters.");
            }
        } while (!isValidPassport(input));
        return input;
    }

    public static String getValidFlightId(Scanner scanner, String prompt) {
         String input;
         do {
             System.out.print(prompt);
             input = scanner.nextLine();
             if (!isValidFlightId(input)) {
                 System.out.println("Error: Invalid Flight ID format. Ex: FL123");
             }
         } while (!isValidFlightId(input));
         return input;
    }
}