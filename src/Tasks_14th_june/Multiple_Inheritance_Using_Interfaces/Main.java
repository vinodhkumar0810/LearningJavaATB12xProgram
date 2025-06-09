package Tasks_14th_june.Multiple_Inheritance_Using_Interfaces;

public class Main {
    public static void main(String[] args) {
        Document doc = new Document();
        doc.print();  // Call method from Printable interface
        doc.show();   // Call method from Showable interface
    }
}
