package Tasks;
public class AgeCategory {
    public static void main(String[] args) {
        int age = 23;
        // Nested ternary to determine category
        String category = (age <= 18) ? "Minor"
                : (age > 65) ? "Senior"
                : "Adult";
        System.out.println("You are classified as: " + category);
    }
}
