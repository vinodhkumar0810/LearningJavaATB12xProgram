package Tasks;

import java.util.Scanner;

public class Task_25th_May_6_ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int originalNum = num;
        int result = 0;
        int n = String.valueOf(num).length(); // Number of digits

        while (num != 0) {
            int digit = num % 10;
            result += Math.pow(digit, n); // Raise digit to power of n
            num /= 10;
        }

        if (result == originalNum) {
            System.out.println(originalNum + " is an Armstrong number.");
        } else {
            System.out.println(originalNum + " is NOT an Armstrong number.");
        }
    }
}
