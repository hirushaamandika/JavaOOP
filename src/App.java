import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner sc = new Scanner(System.in);

        
        library.addBook(new EBook("Java Basics", "Amandika", "111", "http://download.com/java"));
        library.addBook(new PrintedBook("OOP Concepts", "Hirusha", "222", 5));

     
        library.showAllBooks();

        
        try {
            System.out.print("Enter book title to borrow: ");
            String title = sc.nextLine();
            Book book = library.searchBook(title); 

            if (book instanceof EBook) {
                EBook ebook = (EBook) book; 
                ebook.download();
            }

            if (book instanceof Borrowable) {
                ((Borrowable) book).borrow();
            }

        } catch (BookNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
