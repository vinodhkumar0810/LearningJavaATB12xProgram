package Tasks_17th_June;

import java.util.Scanner;

public class MaxOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println("Maximum is: " + a);
        } else {
            System.out.println("Maximum is: " + b);
        }

        scanner.close();
    }
}
