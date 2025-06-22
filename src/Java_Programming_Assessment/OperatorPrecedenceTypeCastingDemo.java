package Java_Programming_Assessment;

import java.util.Scanner;

public class OperatorPrecedenceTypeCastingDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int intVal = scanner.nextInt();
        System.out.print("Enter a double: ");
        double doubleVal = scanner.nextDouble();
        int exprResult = intVal + 5 * 3 - 2;
        System.out.println("Expression result (intVal + 5 * 3 - 2): " + exprResult);
        double implicitCastResult = intVal + doubleVal;
        System.out.println("Implicit casting (int + double): " + implicitCastResult);
        int explicitCastResult = (int) (intVal + doubleVal);
        System.out.println("Explicit casting (int)(intVal + doubleVal): " + explicitCastResult);
        scanner.close();
    }
}
