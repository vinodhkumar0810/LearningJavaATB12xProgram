package Tasks_19th_June;

import java.util.Scanner;

public class PositiveNegativeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num > 0)
            System.out.println("Positive Number");
        else if (num < 0)
            System.out.println("Negative Number");
        else
            System.out.println("Zero");
    }
}
