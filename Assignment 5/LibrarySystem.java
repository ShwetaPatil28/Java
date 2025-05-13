import java.util.ArrayList;
import java.util.List;

class Book {
    private String title;
    private String author;
    private String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        return "Book: \"" + title + "\" by " + author + " (ISBN: " + isbn + ")";
    }
}

class Member {
    private String name;
    private String memberId;
    private List<Book> borrowedBooks;

    public Member(String name, String memberId) {
        this.name = name;
        this.memberId = memberId;
        this.borrowedBooks = new ArrayList<>();
    }

    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }

    public void returnBook(String isbn) {
        borrowedBooks.removeIf(book -> book.getIsbn().equals(isbn));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Member: ").append(name).append(" (ID: ").append(memberId).append(")\nBorrowed Books:\n");
        if (borrowedBooks.isEmpty()) {
            sb.append("  None");
        } else {
            for (Book book : borrowedBooks) {
                sb.append("  ").append(book).append("\n");
            }
        }
        return sb.toString();
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
       
        Book book1 = new Book("1984", "George Orwell", "1234567890");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "0987654321");

        Member member = new Member("Alice", "M001");

                member.borrowBook(book1);
        member.borrowBook(book2);

       
        System.out.println(member);

        
        member.returnBook("1234567890");

        
        System.out.println("\nAfter returning a book:");
        System.out.println(member);
    }
}
