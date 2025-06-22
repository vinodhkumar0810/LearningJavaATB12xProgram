package Java_OOPs_and_Exception_Handling;

public class Student {
    String name;
    int rollNo;
    String section;

    Student(String name, int rollNo, String section) {
        this.name = name;
        this.rollNo = rollNo;
        this.section = section;
    }

    void displayDetails() {
        System.out.println("Student: " + name + ", Roll No: " + rollNo + ", Section: " + section);
    }

    public static void main(String[] args) {

        Student s1 = new Student("Bob", 101, "A");
        s1.displayDetails();
    }
}
