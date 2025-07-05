package JavaWrapperClasses;

public class GenericArrayPrinter {
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String[] strArray = {"A", "B", "C"};
        printArray(strArray);  // Output: A B C
    Integer[] intArray = {1, 2, 3};
        printArray(intArray);  // Output: 1 2 3
    }
}
