package Tasks_16th_July;
/*What is Method Overloading?
Definition:
Method overloading means defining multiple methods with the same name in a class but with different parameters (type, number, or order).

Example Use Case:
You may want a print() method that works with different data types (int, String, double).*/

class Calculator {
    // Method with 2 int parameters
    int add(int a, int b) {
        return a + b;
    }

    // Overloaded method with 3 int parameters
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method with double parameters
    double add(double a, double b) {
        return a + b;
    }
}
public class OverloadingExample {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(2, 3));         // 5
        System.out.println(calc.add(2, 3, 4));      // 9
        System.out.println(calc.add(2.5, 3.5));     // 6.0
    }
}
