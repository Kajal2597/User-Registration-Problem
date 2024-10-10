package regex;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Rule 1: Password must have a minimum of 8 characters
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        // Check if password meets all the rules
        if (isValidPassword(password)) {
            System.out.println("Password is valid.");
        } else {
            System.out.println("Invalid password. It must have at least 8 characters.");
        }

        scanner.close();
    }

    // Method to validate the password based on rules
    public static boolean isValidPassword(String password) {
        // Rule 1: Minimum 8 characters
        if (password.length() < 8) {
            return false;
        }

        // Future rules can be added here
        return true;
        public static boolean isValidPassword(String password) {
            // Rule 1: Minimum 8 characters
            if (password.length() < 8) {
                return false;
            }

            // Rule 2: At least one uppercase letter
            if (!password.matches(".*[A-Z].*")) {
                return false;
            }

            // Rule 3: At least one digit
            if (!password.matches(".*[0-9].*")) {
                return false;
            }

            // Rule 4: At least one special character
            if (!password.matches(".*[!@#$%^&*(),.?\":{}|<>].*")) {
                return false;
            }

            return true;  // All rules passed
        }

    }
}
