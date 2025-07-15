package Tasks_11th_July;
//default (no modifier) access — same package only
// Student.java (Same file or same package)

class Student {
    void showDetails() {
        System.out.println("Showing student details");
    }
}
public class TestDefault {
    public static void main(String[] args) {
        Student student = new Student();
        student.showDetails(); // Works because both are in the same package
    }
}
