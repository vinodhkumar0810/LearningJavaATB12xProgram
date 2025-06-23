package Tasks_21st_june;

import java.util.Scanner;

public class DaysConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of days: ");
        int totalDays = sc.nextInt();

        int years = totalDays / 365;
        int remainingDays = totalDays % 365;

        int months = remainingDays / 30;
        int days = remainingDays % 30;

        System.out.println("Equivalent: " + years + " years, " + months + " months, and " + days + " days.");
    }
}
