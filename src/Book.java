public abstract class Book {
    private String title;
    private String author;
    private String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String getTitle() { return this.title; }
    public String getAuthor() { return this.author; }
    public String getIsbn() { return this.isbn; }

    public abstract void displayInfo();
}
