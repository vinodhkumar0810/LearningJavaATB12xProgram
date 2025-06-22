package Java_Programming_Assessment;

public class PrimeNumberFinder {
    public static void main(String[] args) {
        System.out.print("Prime numbers between 1 and 100: ");
        for (int num = 2; num <= 100; num++) {
            boolean isPrime = true;
            for (int divisor = 2; divisor * divisor <= num; divisor++) {
                if (num % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
}
