import library.books.Book;
import library.members.Member;
import library.transactions.Transaction;

public class MainApp {

    public static void main(String[] args) {

        // Add new book
        Book book1 = new Book("Java Programming", "James Gosling");
        book1.displayBook();

        System.out.println();

        // Register new member
        Member member1 = new Member("Rishi", 101);
        member1.displayMember();

        System.out.println();

        // Issue book
        Transaction t = new Transaction();
        t.issueBook(book1, member1);
    }
}