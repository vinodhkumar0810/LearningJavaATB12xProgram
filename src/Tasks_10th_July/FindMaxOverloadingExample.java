package Tasks_10th_July;
// Class with overloaded max methods
class Utility {

    // Returns max of two integers
    int max(int a, int b) {
        return (a > b) ? a : b;
    }

    // Returns max of three integers
    int max(int a, int b, int c) {
        return (a > b && a > c) ? a : (b > c) ? b : c;
    }

    // Returns max of two double values
    double max(double a, double b) {
        return (a > b) ? a : b;
    }
}
public class FindMaxOverloadingExample {
    public static void main(String[] args) {
        Utility utility = new Utility();

        int maxTwoInts = utility.max(10, 20);
        int maxThreeInts = utility.max(5, 25, 15);
        double maxTwoDoubles = utility.max(5.5, 8.2);

        System.out.println("Max of two integers: " + maxTwoInts);
        System.out.println("Max of three integers: " + maxThreeInts);
        System.out.println("Max of two doubles: " + maxTwoDoubles);
    }
}
