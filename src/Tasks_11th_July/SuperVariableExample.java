package Tasks_11th_July;
//Access parent class variable using super
// Parent class
class Parent {
    String name = "Parent";
}

// Child class
class Child extends Parent {
    String name = "Child";

    void showNames() {
        System.out.println("Child name: " + name);
        System.out.println("Parent name: " + super.name);
    }
}

// Main class
public class SuperVariableExample {
    public static void main(String[] args) {
        Child child = new Child();
        child.showNames();
    }
}
