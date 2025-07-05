package JavaWrapperClasses;

public class GenericBoundedTypeSum {
    public static <T extends Number> double sumOfArray(T[] array) {
        double sum = 0.0;
        for (T element : array) {
            sum += element.doubleValue();
        }
        return sum;
    }
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3};
        System.out.println("Sum: " + sumOfArray(intArray));
        Double[] doubleArray = {1.5, 2.5, 3.5};
        System.out.println("Sum: " + sumOfArray(doubleArray));
    }
}
