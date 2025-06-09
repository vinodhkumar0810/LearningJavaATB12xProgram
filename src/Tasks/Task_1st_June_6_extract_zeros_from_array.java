package Tasks;

public class Task_1st_June_6_extract_zeros_from_array {
    public static void main(String[] args) {
        int[] arr = {2, 3, 0, 5, 0, 1};

        int count = 0; // To keep track of non-zero elements' position

        // Traverse the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[count] = arr[i];
                count++;
            }
        }

        // Now fill remaining positions with zero
        while (count < arr.length) {
            arr[count] = 0;
            count++;
        }

        // Print the modified array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
