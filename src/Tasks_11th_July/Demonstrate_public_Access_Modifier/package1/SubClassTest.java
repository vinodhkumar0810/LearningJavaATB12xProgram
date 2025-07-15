package Tasks_11th_July.Demonstrate_public_Access_Modifier.package1;

public class SubClassTest extends Student{
    public static void main(String[] args) {
        SubClassTest obj = new SubClassTest();
        obj.showInfo(); // Works fine, inherited
    }
}
