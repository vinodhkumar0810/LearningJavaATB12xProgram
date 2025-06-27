package Tasks_24th_june;

public class InvertedRightTriangleWhile {
    public static void main(String[] args) {
        int rows = 5;
        int i = rows;

        while (i >= 1) {
            int j = 1;
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i--;
        }
    }
}
