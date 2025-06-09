package Tasks1;

public class Task_1st_June_3_Print_the_Smallest_Element_in_an_Array {
    public static void main(String[] args) {
        int[] arr = {12, 5, 8, 3, 17, 1, 9};  // sample array

        int smallest = arr[0];  // assume first element is smallest

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        System.out.println("Smallest element in the array is: " + smallest);
    }
}
