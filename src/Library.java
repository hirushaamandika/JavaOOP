import java.util.*;

public class Library {
    private List<Book> inventory = new ArrayList<>();

    public void addBook(Book book) {
        inventory.add(book);
    }

    public Book searchBook(String title) throws BookNotFoundException {
        for (Book book : inventory) {
            if (book.getTitle().equalsIgnoreCase(title)) return book;
        }
        throw new BookNotFoundException("Book titled '" + title + "' not found.");
    }

    public Book searchBook(String author, String isbn) throws BookNotFoundException {
        for (Book book : inventory) {
            if (book.getAuthor().equalsIgnoreCase(author) && book.getIsbn().equals(isbn)) return book;
        }
        throw new BookNotFoundException("Book by '" + author + "' with ISBN '" + isbn + "' not found.");
    }

    public void showAllBooks() {
        for (Book book : inventory) {
            book.displayInfo();
        }
    }
}
