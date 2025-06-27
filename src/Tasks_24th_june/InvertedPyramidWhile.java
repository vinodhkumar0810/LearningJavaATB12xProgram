package Tasks_24th_june;

public class InvertedPyramidWhile {
    public static void main(String[] args) {
        int rows = 5;
        int i = rows;

        while (i >= 1) {
            int space = rows;
            while (space > i) {
                System.out.print(" ");
                space--;
            }

            int star = 1;
            while (star <= (2 * i - 1)) {
                System.out.print("*");
                star++;
            }
            System.out.println();
            i--;
        }
    }
}
