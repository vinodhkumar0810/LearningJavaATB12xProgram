package Tasks;

public class Task_31st_May_1_String_is_Palindrome {
    public static void main(String[] args) {
        String original = "madam";

        // Reverse the string using a loop
        String reversed = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }

        // Check if original equals reversed
        if (original.equals(reversed)) {
            System.out.println(original + " is a Palindrome.");
        } else {
            System.out.println(original + " is not a Palindrome.");
        }
    }
}
