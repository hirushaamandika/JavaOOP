public class PrintedBook extends Book implements Borrowable {
    private int shelfNumber;

    public PrintedBook(String title, String author, String isbn, int shelfNumber) {
        super(title, author, isbn);
        this.shelfNumber = shelfNumber;
    }

    @Override
    public void displayInfo() {
        System.out.println("Printed Book: " + getTitle() + " by " + getAuthor() + " [Shelf: " + shelfNumber + "]");
    }

    @Override
    public void borrow() {
        System.out.println("Borrowing printed book: " + getTitle());
    }

    @Override
    public void returnBook() {
        System.out.println("Returning printed book: " + getTitle());
    }
}
