package Tasks_9th_june;

public class Book {private String title;
    private String author;
    private double price;

    // Constructor to initialize the Book object
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Book Title : " + title);
        System.out.println("Author     : " + author);
        System.out.println("Price      : ₹" + price);
    }

    // Main method to test the Book class
    public static void main(String[] args) {
        // Create a Book object
        Book myBook = new Book("The Alchemist", "Paulo Coelho", 399.00);

        // Display the book details
        myBook.displayDetails();
    }
}
