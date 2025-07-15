package Tasks_10th_July;
// Class with overloaded methods
class Calculator {

    // Method to add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add two doubles
    double add(double a, double b) {
        return a + b;
    }
}
public class MethodOverloadingExample {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int sumInt = calculator.add(5, 10);             // Calls int version
        double sumDouble = calculator.add(5.5, 3.2);     // Calls double version

        System.out.println("Sum of integers: " + sumInt);
        System.out.println("Sum of doubles: " + sumDouble);
    }
}
