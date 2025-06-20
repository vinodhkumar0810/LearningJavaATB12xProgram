package Tasks_19th_June;

import java.util.Scanner;

public class MinOfTwo {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter two numbers: ");
    int a = sc.nextInt();
    int b = sc.nextInt();

    if (a < b)
        System.out.println(a + " is smaller");
    else if (b < a)
        System.out.println(b + " is smaller");
    else
        System.out.println("Both are equal");
}
}
