public class EBook extends Book implements Borrowable {
    private final String downloadLink;

    public EBook(String title, String author, String isbn, String downloadLink) {
        super(title, author, isbn);
        this.downloadLink = downloadLink;
    }

    @Override
    public void displayInfo() {
        System.out.println("EBook: " + getTitle() + " by " + getAuthor() + " [Download: " + downloadLink + "]");
    }

    @Override
    public void borrow() {
        System.out.println("Downloading " + getTitle() + "...");
    }

    public void returnBook() {
        System.out.println("Returning EBook: " + getTitle());
    }

    public void download() {
        System.out.println("Accessing download link: " + downloadLink);
    }
}
