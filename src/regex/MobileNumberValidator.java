package regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class MobileNumberValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Regular expression for a valid mobile number: Country code followed by space and a 10-digit number
        String regex = "^[6-9]{2} [0-9]{10}$";

        System.out.print("Enter your mobile number (e.g., 91 9919819801): ");
        String mobileNumber = scanner.nextLine();

        // Check if the input matches the regex
        if (Pattern.matches(regex, mobileNumber)) {
            System.out.println("Valid mobile number.");
        } else {
            System.out.println("Invalid mobile number. Please enter in the format 91 9919819801.");
        }

        scanner.close();
    }
}
