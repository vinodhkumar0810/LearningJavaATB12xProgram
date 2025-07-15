package Tasks_11th_July;
//Access parent class method using super
// Parent class
class Parent {
    void display() {
        System.out.println("This is Parent method");
    }
}

// Child class
class Child extends Parent {
    void display() {
        super.display(); // Calls Parent's display()
        System.out.println("This is Child method");
    }
}

// Main class
public class SuperMethodExample {
    public static void main(String[] args) {
        Child child = new Child();
        child.display();
    }
}
