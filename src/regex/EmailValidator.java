package regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class EmailValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Regular expression for a valid email: 3 mandatory parts (abc, bl, co) and 2 optional (xyz, in)
        String regex = "^[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)?@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}(\\.[a-zA-Z]{2,})?$";

        System.out.print("Enter your email: ");
        String email = scanner.nextLine();

        // Check if the input matches the regex
        if (Pattern.matches(regex, email)) {
            System.out.println("Valid email address.");
        } else {
            System.out.println("Invalid email address. Please enter in the format abc.xyz@bl.co.in");
        }

        scanner.close();
    }
}
