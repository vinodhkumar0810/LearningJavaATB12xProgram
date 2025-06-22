package Java_OOPs_and_Exception_Handling;

public class Multi_Exception_Handling {

    public static void main(String[] args) {
    String num1 = "10";
    String num2 = "0";
    String invalidNum = "abc";
    int[] arr = {1, 2, 3};

        try {
        int a = Integer.parseInt(num1);
        int b = Integer.parseInt(num2);
        int result = a / b;
        System.out.println("Result: " + result);
    } catch (ArithmeticException e) {
        System.out.println("ArithmeticException: Cannot divide by zero");
    }

        try {
        int n = Integer.parseInt(invalidNum);
    } catch (NumberFormatException e) {
        System.out.println("NumberFormatException: Invalid number format");
    }

        try {
        System.out.println(arr[5]); // Invalid index
    } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("ArrayIndexOutOfBoundsException: Array index out of bounds");
    }
}
}
