package library.transactions;

import library.books.Book;
import library.members.Member;

public class Transaction {

    public void issueBook(Book b, Member m) {
        System.out.println(m.getName() + " has issued the book: " + b.getTitle());
    }
}