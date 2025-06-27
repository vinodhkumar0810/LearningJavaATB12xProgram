package Tasks_24th_june;

public class PyramidWhile {
    public static void main(String[] args) {
        int rows = 5;
        int i = 1;

        while (i <= rows) {
            int space = i;
            while (space < rows) {
                System.out.print(" ");
                space++;
            }

            int star = 1;
            while (star <= (2 * i - 1)) {
                System.out.print("*");
                star++;
            }
            System.out.println();
            i++;
        }
    }
}
