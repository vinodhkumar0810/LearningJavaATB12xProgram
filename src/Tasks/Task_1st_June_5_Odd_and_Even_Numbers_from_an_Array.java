package Tasks;

public class Task_1st_June_5_Odd_and_Even_Numbers_from_an_Array {
    public static void main(String[] args) {
        int[] arr = {12, 7, 9, 14, 3, 8, 11};

        System.out.print("Even numbers: ");
        for (int num : arr) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }

        System.out.println();  // new line

        System.out.print("Odd numbers: ");
        for (int num : arr) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
    }
}
