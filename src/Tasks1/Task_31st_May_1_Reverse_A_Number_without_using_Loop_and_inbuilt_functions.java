package Tasks1;

public class Task_31st_May_1_Reverse_A_Number_without_using_Loop_and_inbuilt_functions {
    public class ReverseStringRecursive {
        public static void main(String[] args) {
            String original = "HelloWorld";
            String reversed = reverse(original);

            System.out.println("Original String: " + original);
            System.out.println("Reversed String: " + reversed);
        }

        // Recursive method to reverse a string
        public static String reverse(String str) {
            if (str.isEmpty()) {
                return str;  // base case
            }
            return reverse(str.substring(1)) + str.charAt(0);
        }
    }
}
