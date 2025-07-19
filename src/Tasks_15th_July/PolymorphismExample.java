package Tasks_15th_July;
/*Polymorphism in Java
Definition: The ability of a method to do different things based on the object that invokes it.
Achieved using method overriding or overloading.*/
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}
public class PolymorphismExample {
    public static void main(String[] args) {
        Animal a;

        a = new Dog();
        a.sound();  // Output: Dog barks

        a = new Cat();
        a.sound();  // Output: Cat meows
    }
}
