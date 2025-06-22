package Java_OOPs_and_Exception_Handling.Animal_Sound_Polymorphism;

class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Dog class overrides makeSound()
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog says: Woof! Woof!");
    }
}

// Cat class overrides makeSound()
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat says: Meow! Meow!");
    }
}
public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.makeSound();
        cat.makeSound();
    }
}