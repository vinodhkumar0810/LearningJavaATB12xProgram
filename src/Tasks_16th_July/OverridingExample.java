package Tasks_16th_July;

/*What is Method Overriding?
Definition:
Method overriding occurs when a subclass provides a specific
implementation of a method that is already defined in its parent class.*/
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
public class OverridingExample {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();  // Output: Dog barks
    }
}
