public class Book {
    private String title;
    private String author;
    private boolean isBorrowed;

    public Book(String title, String author, boolean isBorrowed) {
        this.title = title;
        this.author = author;
        this.isBorrowed = isBorrowed;
    }
    public Book(String title) {
        this.title = title;
       
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean  getIsBorrowed() {
        return isBorrowed;
    }
    public void setBorrowed(boolean isBorrowed) {
        this.isBorrowed = isBorrowed;
    }
}
