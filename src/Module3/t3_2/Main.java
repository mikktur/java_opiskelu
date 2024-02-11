package Module3.t3_2;

import Module3.t3_2.model.Book;
import Module3.t3_2.model.LibraryMember;
import Module3.t3_2.system.Library;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Create books
        Book book1 = new Book("Title 1", "Author 1");
        Book book2 = new Book("Title 2", "Author 2");
        Book book3 = new Book("Title 3", "Author 3");

        // Create members
        LibraryMember member1 = new LibraryMember("Member 1");
        LibraryMember member2 = new LibraryMember("Member 2");

        // Add books and members to the library
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addMember(member1);
        library.addMember(member2);
        library.reserveBook(member1,book3);
        library.displayReservedBooks(member1);
        // Test borrowing books
        library.borrowBook(book1, member1);
        library.borrowBook(book2, member2);
        library.borrowBook(book3, member2);  // Attempting to borrow a reserved book

        // Check if books are removed from the library and added to members
        System.out.println("Books in the library: " + library.getBooks());
        System.out.println("Books borrowed by Member 1: " + member1.getBorrowedBooks());
        System.out.println("Books borrowed by Member 2: " + member2.getBorrowedBooks());

        // Test returning books
        library.returnBook(book1, member1);
        library.returnBook(book2, member2);

        // Check if books are returned to the library
        System.out.println("Books in the library after return: " + library.getBooks());


        // Check if book is reserved and displayed
        System.out.println("Is book3 reserved? " + book3.isReserved());
        library.displayReservedBooks(member1);
        library.displayReservedBooks(member2);

        // Test canceling reservation
        library.cancelReservation(member1, book3);
        library.cancelReservation(member2, book1);  // Canceling reservation for a non-reserved book

        // Check if reservation is canceled
        System.out.println("Is book3 reserved? " + book3.isReserved());
        library.displayReservedBooks(member1);
    }
}
