package JavaWrapperClasses;

public class MaxValueWrapper {
    public static void main(String[] args) {
        Integer[] numbers = {10, 20, 5, 30, 15};
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Max: " + max);
    }
}
