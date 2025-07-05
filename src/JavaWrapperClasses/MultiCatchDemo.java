package JavaWrapperClasses;

public class MultiCatchDemo {
    public static void main(String[] args) {
        try {
             int result = 10 / 0;
             int[] arr = {1, 2, 3};
             int value = arr[5];

        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: ArithmeticException or ArrayIndexOutOfBoundsException");
        }
    }
}
