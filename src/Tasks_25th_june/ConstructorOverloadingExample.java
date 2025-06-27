package Tasks_25th_june;

public class ConstructorOverloadingExample {
    int id;
    String name;
    ConstructorOverloadingExample() {
        id = 0;
        name = "Unknown";
    }
    ConstructorOverloadingExample(int i, String n) {
        id = i;
        name = n;
    }
    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }

    public static void main(String[] args) {
        ConstructorOverloadingExample obj1 = new ConstructorOverloadingExample();
        ConstructorOverloadingExample obj2 = new ConstructorOverloadingExample(101, "Bob");

        obj1.display();
        obj2.display();
    }
}
