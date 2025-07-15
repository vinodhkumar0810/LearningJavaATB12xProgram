package Tasks_11th_July.Demonstrate_public_Access_Modifier.package2;
import Tasks_11th_July.Demonstrate_public_Access_Modifier.package1.Student;
public class OtherPackageTest {
    public static void main(String[] args) {
        Student student = new Student();
        student.showInfo();  // Works fine, different package too!
    }
}
