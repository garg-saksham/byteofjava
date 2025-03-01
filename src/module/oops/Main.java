package module.oops;

import java.util.Scanner; // Import Scanner class for user input

public class Main {
    public static void main(String[] args) {
        // Print a message
        System.out.println("Hello, World!");

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); // Read user input

        System.out.println("Welcome, " + name + "!");

        scanner.close();//closing the scanner 
    }
}
