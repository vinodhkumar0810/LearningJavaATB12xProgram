package Tasks;

public class Task_1st_June_1_Elements_of_an_Array_in_Reverse_Order {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("Array in Reverse Order:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}
