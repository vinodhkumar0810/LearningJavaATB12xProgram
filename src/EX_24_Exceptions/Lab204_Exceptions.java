package EX_24_Exceptions;

public class Lab204_Exceptions {
    public static void main(String[] args) {
        System.out.println("Start the program");

        String ip = args[0]; // java.lang.ArrayIndexOutOfBoundsException
        int a = Integer.parseInt(ip); // java.lang.NumberFormatException
        int b = 100/a; // java.lang.ArithmeticException: / by zero

        System.out.println(b);
        System.out.println("End the program");
    }
}
