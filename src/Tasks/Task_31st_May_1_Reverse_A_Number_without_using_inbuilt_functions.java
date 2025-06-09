package Tasks;

public class Task_31st_May_1_Reverse_A_Number_without_using_inbuilt_functions {
    public static void main(String[] args) {
        String original = "HelloWorld";
        String reversed = "";

        // Loop from end to start
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        System.out.println("Original String: " + original);
        System.out.println("Reversed String: " + reversed);
    }
}
