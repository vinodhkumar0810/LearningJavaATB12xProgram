package Java_Programming_Assessment;

import java.util.Scanner;

public class IncrementDecrementDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         System.out.print("Enter a number: ");
        int i = scanner.nextInt();
        System.out.println("Original: " + i);
        int preInc = ++i;
        System.out.println("Pre-increment: " + preInc);
        int postInc = i++;
        System.out.println("Post-increment: " + postInc + " (returned " + postInc + ")");
        System.out.println("Value after post-increment: " + i);
        int preDec = --i;
        System.out.println("Pre-decrement: " + preDec);
        int postDec = i--;
        System.out.println("Post-decrement: " + postDec + " (returned " + postDec + ")");
        System.out.println("Value after post-decrement: " + i);
        scanner.close();
    }
}
