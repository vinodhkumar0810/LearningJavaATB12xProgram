package Tasks_17th_June;

import java.util.Scanner;

public class PositiveNegativeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number >= 0) {
            System.out.println("The number is Positive.");
        } else {
            System.out.println("The number is Negative.");
        }

        scanner.close();
    }
}
