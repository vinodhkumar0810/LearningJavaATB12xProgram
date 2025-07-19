package Tasks_15th_July;
//Abstraction in Java
//Definition: Hiding internal implementation and showing only necessary features using abstract classes
// or interfaces.
abstract class Shape {
    abstract double area();
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }
}
public class AbstractionExample {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        System.out.println("Area of Circle: " + circle.area());
    }
}
