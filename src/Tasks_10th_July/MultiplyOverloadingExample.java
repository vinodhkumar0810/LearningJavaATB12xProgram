package Tasks_10th_July;
// Class with overloaded multiply methods
class MathOperations {

    // Method to multiply two integers
    int multiply(int a, int b) {
        return a * b;
    }

    // Overloaded method to multiply three integers
    int multiply(int a, int b, int c) {
        return a * b * c;
    }
}

public class MultiplyOverloadingExample {
    public static void main(String[] args) {
        MathOperations operations = new MathOperations();

        int productTwo = operations.multiply(4, 5);         // Calls two-parameter version
        int productThree = operations.multiply(2, 3, 4);     // Calls three-parameter version

        System.out.println("Product of two numbers: " + productTwo);
        System.out.println("Product of three numbers: " + productThree);
    }
}
