package Tasks_25th_june;

public class ParameterizedConstructorExample {
    String name;
    int age;
    ParameterizedConstructorExample(String n, int a) {
        name = n;
        age = a;
    }
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        ParameterizedConstructorExample obj = new ParameterizedConstructorExample("Alice", 25);
        obj.display();
    }
}
