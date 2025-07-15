package Tasks_11th_July.Demonstrate_public_Access_Modifier.package1;

public class SamePackageTest {
    public static void main(String[] args) {
        Student student = new Student();
        student.showInfo();  // Works fine, same package
    }
}
