package Tasks_14th_june.Multiple_Inheritance_Using_Interfaces;

public class Document implements Printable, Showable {
    @Override
    public void print() {
        System.out.println("Printing Document");
    }

    @Override
    public void show() {
        System.out.println("Showing Document");
    }
}
