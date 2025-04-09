import java.util.Scanner;

public class WelcomeProgram {
    public static void main(String[] args) {
        // Use try-with-resources to automatically close the scanner
        try (Scanner scanner = new Scanner(System.in)) {
            // Prompt user for their name
            System.out.print("Please enter your name: ");
            String name = scanner.nextLine();
            
            // Display welcome message
            System.out.println("Welcome " + name + " to Skill Development Training using Java");
        }
    }
}