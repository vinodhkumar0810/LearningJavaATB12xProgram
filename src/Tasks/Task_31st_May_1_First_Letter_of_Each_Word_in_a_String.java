package Tasks;

public class Task_31st_May_1_First_Letter_of_Each_Word_in_a_String {
    public static void main(String[] args) {
        String sentence = "Java is a popular language";

        // Trim and replace multiple spaces with a single space
        sentence = sentence.trim().replaceAll("\\s+", " ");

        // Split the sentence into words
        String[] words = sentence.split(" ");

        System.out.print("First letters: ");
        for (String word : words) {
            System.out.print(word.charAt(0) + " ");
        }
    }
}
