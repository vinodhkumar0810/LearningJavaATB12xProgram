package Tasks_20th_June;

import java.util.Scanner;

public class ATMWithdrawal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 10000;
        System.out.print("Enter amount to withdraw: ");
        int amount = sc.nextInt();

        if (amount <= 0) {
            System.out.println("Invalid amount.");
        } else if (amount % 100 != 0) {
            System.out.println("Amount must be multiple of 100.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining Balance: ₹" + balance);
        }
    }
}
