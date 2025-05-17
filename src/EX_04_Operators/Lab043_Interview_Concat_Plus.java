package EX_04_Operators;

public class Lab043_Interview_Concat_Plus {
    public static void main(String[] args) {
        String first_name = "Vino";
        String last_name = "Maya";

        int a = 10;
        int b = 10;

        System.out.println(first_name + last_name + a + b); // MayaVino1010
        System.out.println(a + b + first_name + last_name);

        System.out.println(first_name + last_name + (a + b));

        // BODMAS - Bracket of Div, mul, add, sub

    }
}
