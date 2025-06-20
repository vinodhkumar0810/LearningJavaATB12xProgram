package Tasks_20th_June;

import java.util.Scanner;

public class NetSalaryCalculator {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter Basic Pay: ");
    double basicPay = sc.nextDouble();

    double hra = 0.20 * basicPay; // House Rent Allowance
    double da = 0.10 * basicPay;  // Dearness Allowance
    double gross = basicPay + hra + da;

    double tax = 0;
    if (gross > 50000)
        tax = 0.10 * gross;

    double netSalary = gross - tax;

    System.out.println("Gross Salary: ₹" + gross);
    System.out.println("Tax Deducted: ₹" + tax);
    System.out.println("Net Salary: ₹" + netSalary);
}
}
