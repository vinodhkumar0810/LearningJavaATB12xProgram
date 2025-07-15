package Tasks_10th_July;
// Base class
class Animal {
    void sound() {
        System.out.println("Some generic animal sound");
    }
}

// Subclass Dog overrides sound()
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Bark");
    }
}

// Subclass Cat overrides sound()
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Meow");
    }
}

// Subclass Cow overrides sound()
class Cow extends Animal {
    @Override
    void sound() {
        System.out.println("Moo");
    }
}
public class AnimalSoundsOverridingExample {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal cow = new Cow();

        dog.sound();  // Outputs: Bark
        cat.sound();  // Outputs: Meow
        cow.sound();  // Outputs: Moo
    }
}
