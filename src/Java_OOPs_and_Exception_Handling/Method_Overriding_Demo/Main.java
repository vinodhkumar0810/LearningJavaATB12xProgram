package Java_OOPs_and_Exception_Handling.Method_Overriding_Demo;

class Parent {
    void display() {
        System.out.println("Parent class display method");
    }
}

class Child extends Parent {
    void display() {
        System.out.println("Child class display method");
    }
}

public class Main {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.display();
        Child c = new Child();
        c.display();
    }
}
