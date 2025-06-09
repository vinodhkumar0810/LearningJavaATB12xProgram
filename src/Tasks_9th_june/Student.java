package Tasks_9th_june;

public class Student {
        private String name;
        private int age;

        // Constructor to initialize name and age
        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // Method to display student details
        public void display() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }

        // Main method to test the class
        public static void main(String[] args) {
            // Creating an object of Student
            Student student1 = new Student("Vinodhkumar", 35);

            // Displaying the student details
            student1.display();
        }
    }

