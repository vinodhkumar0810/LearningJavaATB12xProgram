package Tasks;
public class Task_17th_May_OddEvenTernary {
    public static void main(String[] args) {
        int number = 150;

        // Using ternary operator to check odd or even
        String result = (number % 2 == 0) ? "Even" : "Odd";

        System.out.println("The number is " + result + ".");
    }
}
