package EX_24_Exceptions;

public class Lab210 {
    public static void main(String[] args) {
        int a = 0;
        int c = 0;
        try {
            c = 10/a;
        } catch (Throwable e) {
            System.out.println(e.getMessage());
        }
        System.out.println(c);
    }
}
