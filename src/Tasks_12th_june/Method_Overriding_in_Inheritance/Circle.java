package Tasks_12th_june.Method_Overriding_in_Inheritance;

public class Circle extends Shape{
    @Override
    void area() {
        System.out.println("Area of Circle = π × r²");
    }
}
