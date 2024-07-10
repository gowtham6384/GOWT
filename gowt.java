// Import the Scanner class to read input
import java.util.Scanner;

public class HelloWorld {

    // Main method - execution starts here
    public static void main(String[] args) {
        // Print Hello, World! to the console
        System.out.println("Hello, World!");

        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();  // Read user input

        // Greet the user
        System.out.println("Hello, " + name + "!");

        // Close the scanner
        scanner.close();
    }
}
