package Java_OOPs_and_Exception_Handling.Outer_and_Inner_Class_Implementation;

class Outer {
    int x = 10;
    class Inner {
        void display() {
            System.out.println("Inner class accessing outer variable: " + x);
        }
    }

    void show() {
        System.out.println("Outer class variable x: " + x);
        Inner inner = new Inner();
        inner.display();
    }
}
public class Main {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.show();
    }
}
