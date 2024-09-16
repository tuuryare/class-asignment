public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new Book("2001" +
                "", "turyare", "074304291883", 3);
        Book book2 = new Book("the bright life", "Turyare", "0743042911883", 2);
        library.addBook(book1);
        library.addBook(book2);
        Member member1 = new Member("abdirahman", "M001");
        Member member2 = new Member("aisha", "M002");
        library.registerMember(member1);
        library.registerMember(member2);
        library.lendBook("9780451524935", "M001");
        library.lendBook("9780060935467", "M002");
        System.out.println(member1.name + " borrowed: ");
        for (Book book : member1.getBorrowedBooks()) {
            System.out.println(" - " + book.title);
        }

        System.out.println(member2.name + " borrowed: ");
        for (Book book : member2.getBorrowedBooks()) {
            System.out.println(" - " + book.title);
        }

        System.out.println("Copies available of '2001': " + book1.getCopiesAvailable());
        System.out.println("Copies available of '2001: " + book2.getCopiesAvailable());
    }
}
