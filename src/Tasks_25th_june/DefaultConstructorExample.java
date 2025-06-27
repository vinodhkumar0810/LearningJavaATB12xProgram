package Tasks_25th_june;

public class DefaultConstructorExample {
    int x;
    DefaultConstructorExample() {
        x = 10;
    }
    void display() {
    System.out.println("Value of x: " + x);
    }

    public static void main(String[] args) {
    DefaultConstructorExample obj = new DefaultConstructorExample();
    obj.display();
    }
}