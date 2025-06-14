package Tasks1;
import java.util.Scanner;
public class Task_24th_May_Switch_month {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
            // Input: month and year
            System.out.println("Enter month number (1-12): ");
            int month = scanner.nextInt();
            System.out.println("Enter year: ");
            int year = scanner.nextInt();
            int days;
            switch (month) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    days = 31;
                    break;
                case 4: case 6: case 9: case 11:
                    days = 30;
                    break;
                case 2:
                    // Check for leap year
                    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                        days = 29;
                    } else {
                        days = 28;
                    }
                    break;
                default:
                    System.out.println("Invalid month number!");
                    return;
            }

            System.out.println("Number of days: " + days);
        }
    }