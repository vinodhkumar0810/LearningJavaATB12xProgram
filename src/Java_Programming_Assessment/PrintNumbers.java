package Java_Programming_Assessment;

import java.util.Scanner;

public class PrintNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();
        for (int i = 1; i <= N; i++) {
            System.out.print(i);
            if (i != N) {
                System.out.print(" ");
            }
        }
        System.out.println();
        scanner.close();
    }
}
