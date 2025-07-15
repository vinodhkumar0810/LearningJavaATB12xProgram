package Tasks_9th_july;

// Base class
class User {
    void login() {
        System.out.println("User logged in");
    }
}

// First level derived class
class AdminUser extends User {
    void accessAdminPanel() {
        System.out.println("Admin panel accessed");
    }
}

// Second level derived class
class SuperAdmin extends AdminUser {
    void shutdownSystem() {
        System.out.println("System shutdown initiated");
    }
}
public class MultilevelLoginSystem {
    public static void main(String[] args) {
        SuperAdmin superAdmin = new SuperAdmin(); // Create SuperAdmin object

        // Call methods from all levels
        superAdmin.login();              // From User
        superAdmin.accessAdminPanel();   // From AdminUser
        superAdmin.shutdownSystem();     // From SuperAdmin
    }
}
