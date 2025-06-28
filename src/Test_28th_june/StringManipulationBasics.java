package Test_28th_june;

import java.util.Scanner;

public class StringManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        int length = input.length();
        char firstChar = input.charAt(0);
        String substring = "";
        int lastSpace = input.lastIndexOf(" ");
        if (lastSpace != -1 && lastSpace < input.length() - 1) {
            substring = input.substring(lastSpace + 1);
        } else {
            substring = input;
        }
        System.out.println("Length: " + length);
        System.out.println("First char: " + firstChar);
        System.out.println("Substring: " + substring);
        scanner.close();
    }
}
