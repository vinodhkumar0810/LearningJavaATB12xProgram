package JavaWrapperClasses;

public class AutoboxingUnboxingDemo {
    public static void main(String[] args) {
        int value = 10;
        Integer boxedValue = value;
        int unboxedValue = boxedValue;
        System.out.println("Autoboxed: " + boxedValue + ", Unboxed: " + unboxedValue);
    }
}
