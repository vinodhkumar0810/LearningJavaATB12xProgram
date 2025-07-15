package Tasks_10th_July;
// Class with overloaded printData methods
class Printer {

    // Method to print String data
    void printData(String data) {
        System.out.println("String data: " + data);
    }

    // Overloaded method to print int data
    void printData(int data) {
        System.out.println("Integer data: " + data);
    }

    // Overloaded method to print float data
    void printData(float data) {
        System.out.println("Float data: " + data);
    }
}

public class UniversalPrinterExample {
    public static void main(String[] args) {
        Printer printer = new Printer();

        // Call printData with different data types
        printer.printData("Hello, World!");  // String version
        printer.printData(123);              // int version
        printer.printData(45.67f);           // float version
    }
}
