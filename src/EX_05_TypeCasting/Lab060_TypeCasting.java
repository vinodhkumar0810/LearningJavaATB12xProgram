package EX_05_TypeCasting;

public class Lab060_TypeCasting {
    public static void main(String[] args) {
        long phone_no = 94;
//        short s = phone_no; // Narrowing - implicit
        short s = (short) phone_no; // Narrowing - Explicit
        System.out.println(s); // 5866
    }
}
