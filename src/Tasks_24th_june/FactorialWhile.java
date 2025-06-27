package Tasks_24th_june;

import java.util.Scanner;

public class FactorialWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int fact = 1, i = 1;

        while (i <= num) {
            fact *= i;
            i++;
        }
        System.out.println("Factorial = " + fact);
    }
}
