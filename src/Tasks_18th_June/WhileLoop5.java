package Tasks_18th_June;
//Print the multiplication table of 7
public class WhileLoop5 {
    public static void main(String[] args) {
        int number = 7, i = 1;
        while (i <= 10) {
            System.out.println(number + " x " + i + " = " + (number * i));
            i++;
        }
    }
}
