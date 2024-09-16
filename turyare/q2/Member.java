import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Member {
    public String name;
    private String memberId;
    private List<Book> borrowedBooks;

    public Member(String name, String memberId) {
        this.name = name;
        this.memberId = memberId;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getMemberId() {
        return memberId;
    }

    public void borrowBook(Book book) {
        addBookToBorrowedList(book);
    }

    private void addBookToBorrowedList(Book book) {
        borrowedBooks.add(book);
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return Objects.equals(memberId, member.memberId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(memberId);
    }
}
