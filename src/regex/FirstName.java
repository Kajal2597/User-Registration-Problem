/*
Author:Kajal Gaikwad
Purpose:Regular expression for a valid first name: starts with a capital letter and has at least 3 characters
*/
package regex;
import java.util.Scanner;
import java.util.regex.Pattern;

public class FirstName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Regular expression for a valid first name: starts with a capital letter and has at least 3 characters
        String regex = "^[A-Z][a-zA-Z]{2,}$";

        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();

        // Check if the input matches the regex
        if (Pattern.matches(regex, firstName)) {
            System.out.println("Valid first name.");
        } else {
            System.out.println("Invalid first name. It should start with a capital letter and have at least 3 characters.");
        }

        scanner.close();
    }
}
