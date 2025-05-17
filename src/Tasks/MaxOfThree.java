package Tasks;
public interface MaxOfThree {
    public static void main(String[] args) {
        int N1 = 124;
        int N2 = 300;
        int N3 = 164;
        // Nested ternary operator to find maximum
        int max = (N1 > N2) ? (N1 > N3 ? N1 : N3) : (N2 > N3 ? N2 : N3);
        System.out.println("The maximum number is: " + max);
    }
}
