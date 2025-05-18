package Tasks;
public class Task_17th_May_AgeCategory {
    public static void main(String[] args) {
        int age = 23;
        // Nested ternary to determine category
        String category = (age <= 18) ? "Minor"
                : (age > 65) ? "Senior"
                : "Adult";
        System.out.println("You are classified as: " + category);
    }
}
