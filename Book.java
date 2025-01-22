//Create a Book class with fields title, author, and price. Use a default constructor to initialize
//default values and display them.
public class Book {
    String title;
    String author;
    double price;
    public Book() {
        this.title = "To Good, to Be Honest";
        this.author = "Prajakta Mali";
        this.price = 100.0;
    }
    public void displayDetails() {
        System.out.println("Title:"+title);
        System.out.println("Author:"+author);
        System.out.println("Price:"+price);
    }
    public static void main(String[] args) {
        Book defaultBook = new Book();
        defaultBook.displayDetails();
    }
}