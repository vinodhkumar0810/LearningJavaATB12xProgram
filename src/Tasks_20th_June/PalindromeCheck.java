package Tasks_20th_June;

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt(), original = num, reverse = 0;

        while (num != 0) {
            reverse = reverse * 10 + num % 10;
            num /= 10;
        }

        if (original == reverse)
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");
    }
}
