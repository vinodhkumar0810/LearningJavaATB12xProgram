package Tasks_18th_June;
//Calculate sum of first 10 natural numbers
public class WhileLoop4 {
    public static void main(String[] args) {
        int i = 1, sum = 0;
        while (i <= 10) {
            sum += i;
            i++;
        }
        System.out.println("Sum = " + sum);
    }
}
