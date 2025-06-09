package Tasks1;

import java.util.Scanner;

public class Task_24th_May_Factorial_HR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        long fact = 1;

        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return;
        } else if (n > 20) {
            System.out.println("Number too large! Use BigInteger for accurate results.");
            return;
        }

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        System.out.println("Factorial of " + n + " is: " + fact);
    }
}
