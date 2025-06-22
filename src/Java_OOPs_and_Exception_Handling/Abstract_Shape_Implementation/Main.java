package Java_OOPs_and_Exception_Handling.Abstract_Shape_Implementation;

abstract class Shape {
    abstract double getArea();
}

class Rectangle extends Shape {
    double length;
    double width;
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    double getArea() {
        return length * width;
    }
}

class Circle extends Shape {
    double radius;
    Circle(double radius) {
        this.radius = radius;
    }

    double getArea() {
        return Math.PI * radius * radius;
    }
}
public class Main {
    public static void main(String[] args) {
        Shape rect = new Rectangle(5, 3);
        Shape circ = new Circle(4);
        System.out.println("Rectangle Area: " + rect.getArea());
        System.out.println("Circle Area: " + circ.getArea());
    }
}
