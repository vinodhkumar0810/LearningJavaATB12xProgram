package Java_Programming_Assessment;

import java.util.Scanner;

public class ArithmeticAssignmentDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        int addition = num1 + num2;
        int subtraction = num1 - num2;
        int multiplication = num1 * num2;
        int division = num1 / num2;
        int modulus = num1 % num2;
        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + division);
        System.out.println("Modulus: " + modulus);
        int a = num1;
        a += num2;  // a = a + num2
        System.out.println("After a += num2: " + a);
        a -= num2;  // a = a - num2
        System.out.println("After a -= num2: " + a);
        a *= num2;  // a = a * num2
        System.out.println("After a *= num2: " + a);
        a /= num2;  // a = a / num2
        System.out.println("After a /= num2: " + a);
        scanner.close();
    }
}
