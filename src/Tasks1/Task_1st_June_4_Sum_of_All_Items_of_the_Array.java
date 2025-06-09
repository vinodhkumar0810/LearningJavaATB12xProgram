package Tasks1;

public class Task_1st_June_4_Sum_of_All_Items_of_the_Array {
    public static void main(String[] args) {
        int[] arr = {4, 7, 1, 9, 3};  // sample array

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("Sum of all items in the array is: " + sum);
    }
}
