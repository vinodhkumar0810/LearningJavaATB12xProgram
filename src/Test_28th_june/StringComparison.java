package Test_28th_june;

public class StringComparison {
    public static void main(String[] args) {
        String string1 = "Hello";
        String string2 = "hello";
        String string3 = "Hello";
        boolean equalsResult = string1.equals(string2); // case-sensitive
        boolean equalsIgnoreCaseResult = string1.equalsIgnoreCase(string2); // case-insensitive
        int compareToResult = string1.compareTo(string2); // returns int based on Unicode values
        boolean referenceEquality1 = (string1 == string2);
        boolean referenceEquality2 = (string1 == string3);
        System.out.println("string1: " + string1);
        System.out.println("string2: " + string2);
        System.out.println("string3: " + string3);
        System.out.println();
        System.out.println("string1.equals(string2): " + equalsResult);
        System.out.println("string1.equalsIgnoreCase(string2): " + equalsIgnoreCaseResult);
        System.out.println("string1.compareTo(string2): " + compareToResult);
        System.out.println("string1 == string2: " + referenceEquality1);
        System.out.println("string1 == string3: " + referenceEquality2);
    }
}
