package Tasks;

public class Task_1st_June_2_Print_the_Largest_Element_in_an_Array {
    public static void main(String[] args) {
        int[] numbers = {25, 47, 3, 89, 14, 56};

        int largest = numbers[0];  // Assume first element is the largest

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];  // Update if current is greater
            }
        }

        System.out.println("Largest Element: " + largest);
    }
}
