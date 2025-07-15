package Tasks_10th_July;

// Class with overloaded greet methods
class Greeter {

    // Method with no parameters
    void greet() {
        System.out.println("Hello!");
    }

    // Overloaded method with one String parameter
    void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }
}
public class GreetUserOverloadingExample {
    public static void main(String[] args) {
        Greeter greeter = new Greeter();

        greeter.greet();                 // Calls greet() with no parameters
        greeter.greet("Alice");          // Calls greet(String name)
    }
}
