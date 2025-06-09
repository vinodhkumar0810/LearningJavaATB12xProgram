package Tasks1;

public class Task_18th_May_OP2 {
    public static void main(String[] args) {
        int a = 11, b = 22, c;
        c = a + b + a++ + b++ + ++a + ++b;
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        System.out.println("c=" + c);
    }
}
