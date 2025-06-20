package Tasks_20th_June;

import java.util.Scanner;

public class TravelEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine(); // Consume newline
        System.out.print("Enter Visa Status (valid/invalid): ");
        String visaStatus = sc.nextLine().toLowerCase();

        if (age >= 18 && visaStatus.equals("valid")) {
            System.out.println("Eligible to Travel.");
        } else {
            System.out.println("Not Eligible to Travel.");
        }
    }
}
