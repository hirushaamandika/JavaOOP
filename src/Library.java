import java.util.ArrayList;
public class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public ArrayList<Book> getBooks() {
        return books;
    }
    public Book getBook(Book book) {
        
        return book;
    }
    public void borrowBook(Book book) {
        books.remove(book);
    }
   public boolean searchBook(Book book){
    return books.contains(book);
   }
}
