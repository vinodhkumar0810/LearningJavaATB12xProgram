package Tasks_23rd_june;

import java.util.Scanner;

public class AgeCategory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();

        if (age >= 0 && age <= 12) {
            System.out.println("Category: Child");
        } else if (age >= 13 && age <= 19) {
            System.out.println("Category: Teenager");
        } else if (age >= 20 && age <= 64) {
            System.out.println("Category: Adult");
        } else if (age >= 65) {
            System.out.println("Category: Senior Citizen");
        } else {
            System.out.println("Invalid age entered.");
        }
    }
}
