package Tasks_10th_July;
// Base class
class User {
    void login() {
        System.out.println("User login");
    }
}

// Subclass AdminUser overrides login()
class AdminUser extends User {
    @Override
    void login() {
        System.out.println("AdminUser login: Access to admin dashboard");
    }
}

// Subclass RegularUser overrides login()
class RegularUser extends User {
    @Override
    void login() {
        System.out.println("RegularUser login: Access to user homepage");
    }
}

// Main class to run the program
public class LoginFunctionalityOverridingExample {
    public static void main(String[] args) {
        User user1 = new AdminUser();     // Base class reference, AdminUser object
        User user2 = new RegularUser();   // Base class reference, RegularUser object

        user1.login();  // Outputs: AdminUser login: Access to admin dashboard
        user2.login();  // Outputs: RegularUser login: Access to user homepage
    }
}
