package Tasks_11th_July;
//Create a Program to Access the private access modifier
class Person {
    private String name = "John Doe";

    // Getter for name
    public String getName() {
        return name;
    }
}
public class PrivateAccessExample {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println("Name: " + person.getName());
    }
}
