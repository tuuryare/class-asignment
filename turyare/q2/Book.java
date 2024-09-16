import java.util.Objects;

public class Book {
    public String title;
    public String author;
    private String isbn;
    int copiesAvailable;

    public Book(String title, String author, String isbn, int copiesAvailable) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.copiesAvailable = copiesAvailable;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setCopiesAvailable(int copies) {
        this.copiesAvailable = copies;
    }

    int getCopiesAvailable() {
        return copiesAvailable;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(isbn, book.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn);
    }
}
