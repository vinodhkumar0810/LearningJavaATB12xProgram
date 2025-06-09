package Tasks1;
import java.util.Scanner;
public class Task_19th_May_Triangle {
    public static void main(String[] args) {
        //A program that classifies a triangle based on its side lengths.
        // Given three input values representing the lengths of the sides,
        // determine if the triangle is equilateral (all sides are equal),
        // isosceles (exactly two sides are equal), or scalene (no sides are equal).
        // Use an if-else statement to classify the triangle.

        System.out.println("Enter The sides of triangles");
        Scanner scanner = new Scanner(System.in);
        System.out.println(" N1 = ");
        int n1 = scanner.nextInt();
        System.out.println(" N2 = ");
        int n2 = scanner.nextInt();
        System.out.println(" N3 = ");
        int n3 = scanner.nextInt();
        // Check if the sides can form a triangle
        if (n1 + n2 > n3 && n1 + n3 > n2 && n2 + n3 > n1) {
            // Classify the triangle
        }
            if(n1==n2&&n2==n3)
        {
            System.out.println("The given Triangle is equilateral");
        } else if (n1 == n2 || n1 == n3 || n2 == n3) {
            {
                System.out.println("The given Triangle is Isosceles.");
            }
        } else {
            System.out.println("The given Triangle  is Scalene.");
        }
    }
}
