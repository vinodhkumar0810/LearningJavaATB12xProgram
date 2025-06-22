package Java_OOPs_and_Exception_Handling.Custom_Exception_Implementation;

class InvalidAgeException extends Exception {
    public InvalidAgeException(int age) {
        super("InvalidAgeException: Age must be 18 or above. Provided age: " + age);
    }
}
class AgeValidator {
    void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException(age);
        } else {
            System.out.println("Age is valid: " + age);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        AgeValidator validator = new AgeValidator();

        try {
            validator.validateAge(15);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }

        try {
            validator.validateAge(25);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
