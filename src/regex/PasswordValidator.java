package regex;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Password rules:
        // Rule 1: Minimum 8 characters
        // Rule 2: At least one uppercase letter
        // Rule 4: Exactly one special character
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        // Check if password meets all the rules
        if (isValidPassword(password)) {
            System.out.println("Password is valid.");
        } else {
            System.out.println("Invalid password. It must have at least 8 characters, at least one uppercase letter, and exactly one special character.");
        }

        scanner.close();
    }

    // Method to validate the password based on rules
    public static boolean isValidPassword(String password) {
        // Rule 1: Minimum 8 characters
        if (password.length() < 8) {
            return false;
        }

        // Rule 2: At least one uppercase letter
        if (!password.matches(".*[A-Z].*")) {
            return false;
        }

        // Rule 4: Exactly one special character
        // Special characters are considered: ! @ # $ % ^ & * ( ) _ + - = [ ] { } | ; : ' " , < . > / ? ~ ` (adjust based on your requirements)
        if (!password.matches("^[^!@#$%^&*(),.?\":{}|<>]*[!@#$%^&*(),.?\":{}|<>][^!@#$%^&*(),.?\":{}|<>]*$")) {
            return false;
        }

        return true;  // All rules passed
    }
}
