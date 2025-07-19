package Tasks_16th_July;
/*
    Definition:
    super refers to the parent class of the current object.
    You can use super to:
    Call the parent class constructor
    Access parent class methods or variables
     */

class Animal {
    String name = "Animal";

    void display() {
        System.out.println("This is an Animal");
    }
}

class Dog extends Animal {
    String name = "Dog";

    void display() {
        super.display();                    // Call parent method
        System.out.println(super.name);     // Access parent variable
        System.out.println("This is a Dog");
    }
}
public class SuperKeywordExample {

    public static void main(String[] args) {
        Dog d = new Dog();
        d.display();
    }
}
