package Tasks;

public class Task_31st_May_1_Reverse_A_Number_using_inbuilt_functions {
    public static void main(String[] args) {
        String original = "HelloWorld";

        // Using StringBuffer and its reverse() method
        StringBuffer buffer = new StringBuffer(original);
        String reversed = buffer.reverse().toString();

        System.out.println("Original String: " + original);
        System.out.println("Reversed String: " + reversed);
    }
}
