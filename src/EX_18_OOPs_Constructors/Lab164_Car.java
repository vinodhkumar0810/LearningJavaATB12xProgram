package EX_18_OOPs_Constructors;

public class Lab164_Car {
    public static void main(String[] args) {

        Car tesla = new Car();
        tesla.name = "Tesla Model 3";
        tesla.year = 2025;
        System.out.println(tesla.name);
        System.out.println(tesla.year);
        System.out.println(tesla.model);

        Car nano = new Car();
        nano.name = "Tata Nano";
        System.out.println(nano.name);
        System.out.println(nano.year);
        System.out.println(nano.model);

        LoginPage l = new LoginPage();



    }
}
