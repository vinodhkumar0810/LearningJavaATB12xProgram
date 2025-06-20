package Tasks_20th_June;

import java.util.Scanner;

public class LoanEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter Credit Score: ");
        int creditScore = sc.nextInt();

        if (age < 18 || age > 80 || age <= 0) {
            System.out.println("Invalid Age.");
        } else if (salary < 30000) {
            System.out.println("Salary too low.");
        } else if (creditScore < 650 || creditScore > 850) {
            System.out.println("Credit score not eligible.");
        } else {
            System.out.println("Eligible for Loan.");
        }
    }
}
