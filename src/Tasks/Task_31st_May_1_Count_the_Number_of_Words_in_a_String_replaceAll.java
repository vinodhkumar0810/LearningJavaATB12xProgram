package Tasks;

public class Task_31st_May_1_Count_the_Number_of_Words_in_a_String_replaceAll {
    public static void main(String[] args) {
        String input = "  Java   is   a   programming   language  ";

        // Remove leading/trailing spaces and replace multiple spaces with single space
        String cleaned = input.trim().replaceAll("\\s+", " ");

        // Split the cleaned string by space
        String[] words = cleaned.split(" ");

        System.out.println("Input String: " + input);
        System.out.println("Word Count: " + words.length);
    }
}
