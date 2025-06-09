package Tasks1;

import java.util.Scanner;

public class Task_25th_May_8_GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get score from user
        System.out.print("Enter the numerical score (0-100): ");
        int score = scanner.nextInt();

        // Validate score range
        if (score < 0 || score > 100) {
            System.out.println("Invalid score! Please enter a value between 0 and 100.");
        } else {
            char grade;

            if (score >= 90) {
                grade = 'A';
            } else if (score >= 80) {
                grade = 'B';
            } else if (score >= 70) {
                grade = 'C';
            } else if (score >= 60) {
                grade = 'D';
            } else {
                grade = 'F';
            }

            System.out.println("Your grade is: " + grade);
        }
    }
}
