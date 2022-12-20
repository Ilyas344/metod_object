public class Book {
    private String bookName;
    private int publishingYear;
    private Author author;

    public Book(String bookName, int publishingYear, Author author) {
        this.author = author;
        this.bookName = bookName;
        this.publishingYear = publishingYear;
    }

    public String getBookName() {

        return this.bookName;
    }

    public int getPublishingYear() {
        return this.publishingYear;
    }
    public Author author() {

        return this.author;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;

    }
}
