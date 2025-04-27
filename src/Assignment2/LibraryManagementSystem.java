package Assignment2;
import java.util.ArrayList;
import java.util.List;
class Book {
    private String title;
    private String author;
    private boolean isAvailable;
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public boolean isAvailable() {
        return isAvailable;
    }
    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book borrowed successfully: " + title);
        } else {
            System.out.println("Book is currently unavailable: " + title);
        }
    }
    public void returnBook() {
        isAvailable = true;
        System.out.println("Book returned: " + title);
    }
}
class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }
    public void listBooks() {
        for (Book book : books) {
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", Available: " + book.isAvailable());
        }
    }
}
public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        Book book2 = new Book("1984", "George Orwell");
        library.addBook(book1);
        library.addBook(book2);
        System.out.println("\nLibrary Catalog:");
        library.listBooks();
        book1.borrowBook();
        System.out.println("\nUpdated Catalog:");
        library.listBooks();
        book1.returnBook();
        System.out.println("\nFinal Catalog:");
        library.listBooks();
    }
}
