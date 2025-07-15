package Tasks_9th_july;
// Base class
class Animal {
    void makeSound() {
        System.out.println("Animal is making a sound");
    }
}

// Derived class
class Cat extends Animal {
    void meow() {
        System.out.println("Cat says: Meow!");
    }
}
public class AnimalSoundSimulator {
    public static void main(String[] args) {
        Cat cat = new Cat(); // Create Cat object

        // Call base class method
        cat.makeSound();

        // Call derived class method
        cat.meow();
    }
}
