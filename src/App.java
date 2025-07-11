
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new Book("1984", "George Orwell", false);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", false);

        library.addBook(book1);
        library.addBook(book2);
try{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Library Management System");

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1 - Add Book");
            System.out.println("2 - Search Book");
            System.out.println("3 - Borrow Book");
            System.out.println("4 - Exit");

            int command = Integer.parseInt(scanner.nextLine());

            switch (command) {
                case 1:
                    System.out.println("Enter book title:");
                    String title = scanner.nextLine();
                    System.out.println("Enter book author:");
                    String author = scanner.nextLine();
                    library.addBook(new Book(title, author, false));
                    System.out.println("Book added!");
                    break;

                case 2:
                    System.out.println("Enter book title to search:");
                    String searchTitle = scanner.nextLine();
                    boolean foundBook = library.searchBook(new Book(searchTitle));
                    if (foundBook) {
                        System.out.println("Found: " + searchTitle);
                    } else {
                        System.out.println("Not found: " + searchTitle);
                    }
                    break;

                case 3:
                    System.out.println("Enter book title to borrow:");
                    String borrowTitle = scanner.nextLine();
                    Book bookToBorrow = library.getBook(new Book(borrowTitle));
                    if (bookToBorrow != null) {
                        if (!bookToBorrow.getIsBorrowed()) {
                           bookToBorrow.setBorrowed(true);
                            System.out.println("You borrowed: " + borrowTitle);
                        } else {
                            System.out.println("Book already borrowed.");
                        }
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid command.");
            }
        }
    }catch(Exception e){
        System.out.println("Please input valis argument");

    }
}
}