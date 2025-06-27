package Tasks_24th_june;

public class Sum1To100While {
    public static void main(String[] args) {
        int sum = 0, i = 1;
        while (i <= 100) {
            sum += i;
            i++;
        }
        System.out.println("Sum = " + sum);
    }
}
