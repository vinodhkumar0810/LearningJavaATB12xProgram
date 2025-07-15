package Tasks_11th_July;
//Access parent class constructor using super()
// Parent class
class Parent {
    Parent() {
        System.out.println("Parent class constructor called");
    }
}

// Child class
class Child extends Parent {
    Child() {
        super(); // Calls Parent class constructor
        System.out.println("Child class constructor called");
    }
}

// Main class
public class SuperConstructorExample {
    public static void main(String[] args) {
        Child child = new Child();
    }
}
