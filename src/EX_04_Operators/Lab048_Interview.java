package EX_04_Operators;

public class Lab048_Interview {
    public static void main(String[] args) {
        int Vino_salary = 12;
        boolean b = !(Vino_salary > 10 || Vino_salary < 5);
        System.out.println(b);

        // A - Vino_salary > 10 -> 12 > 10 -> true
        // B -> Vino_salary < 5  12 < 5 -> false
        // !(A || B) -> !(true || false) -> !true - false
    }
}
