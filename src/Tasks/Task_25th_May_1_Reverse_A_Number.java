package Tasks;
import java.util.Scanner;

public class Task_25th_May_1_Reverse_A_Number {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the Number :");
        int number = scanner.nextInt();
        int reverse = 0;

        // Use a for loop to reverse the number
        for (; number != 0; number /= 10) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
        }

        System.out.println("Reversed number: " + reverse);
    }
    }
}
