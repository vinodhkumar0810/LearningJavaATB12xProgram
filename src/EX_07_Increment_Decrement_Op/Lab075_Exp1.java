package EX_07_Increment_Decrement_Op;

public class Lab075_Exp1 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++ + ++a);
        System.out.println(a);

        // a++ -> ExpA ->  10 , a -> 11
        // +
        // ++a -> ExpB ->  12 , a -> 12
    }
}
