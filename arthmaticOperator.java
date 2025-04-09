import java.util.*;

public class arthmaticOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        // Arithmetic operators
        double addition = num1 + num2;
        double subtraction = num1 - num2;
        double multiplication = num1 * num2;
        double division = num1 / num2;
        double modulus = num1 % num2;

        // Display results
        System.out.println("Arithmetic Operators Results:");
        System.out.println("-------------------------------");
        System.out.println("Addition: " + num1 + " + " + num2 + " = " + addition);
        System.out.println("Subtraction: " + num1 + " - " + num2 + " = " + subtraction);
        System.out.println("Multiplication: " + num1 + " * " + num2 + " = " + multiplication);
        System.out.println("Division: " + num1 + " / " + num2 + " = " + division);
        System.out.println("Modulus: " + num1 + " % " + num2 + " = " + modulus);
    }
}

 
    

