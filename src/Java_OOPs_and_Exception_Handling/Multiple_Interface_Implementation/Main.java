package Java_OOPs_and_Exception_Handling.Multiple_Interface_Implementation;

interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

class Duck implements Flyable, Swimmable {
    public void fly() {
        System.out.println("Duck is flying in the sky!");
    }

    public void swim() {
        System.out.println("Duck is swimming in the water!");
    }
}
public class Main {
    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.fly();
        duck.swim();
    }
}
