import java.util.Scanner;
import java.util.regex.Pattern;

public class NameValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Regular expression for valid first and last names: start with a capital letter and have at least 3 characters
        String regex = "^[A-Z][a-zA-Z]{2,}$";

        // Validate first name
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();
        if (Pattern.matches(regex, firstName)) {
            System.out.println("Valid first name.");
        } else {
            System.out.println("Invalid first name. It should start with a capital letter and have at least 3 characters.");
        }

        // Validate last name
        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();
        if (Pattern.matches(regex, lastName)) {
            System.out.println("Valid last name.");
        } else {
            System.out.println("Invalid last name. It should start with a capital letter and have at least 3 characters.");
        }

        scanner.close();
    }
}
