package Tasks_20th_June;

import java.util.Scanner;

public class BonusCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter Years of Experience: ");
        int years = sc.nextInt();
        double bonus = 0;

        if (years < 1) {
            bonus = 0;
        } else if (years <= 3) {
            bonus = salary * 0.05;
        } else if (years <= 6) {
            bonus = salary * 0.10;
        } else {
            bonus = salary * 0.15;
        }

        System.out.println("Bonus Amount: ₹" + bonus);
    }
}
