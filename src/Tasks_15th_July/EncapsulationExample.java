package Tasks_15th_July;
/*Encapsulation in Java
Definition: Wrapping data (variables) and code (methods) into a single unit.
Variables are made private, and accessed via public getters/setters.*/
class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}
public class EncapsulationExample {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);
        account.deposit(500);
        System.out.println("Balance: " + account.getBalance());
    }
}
