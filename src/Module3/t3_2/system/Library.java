package Module3.t3_2.system;

import Module3.t3_2.model.Book;
import Module3.t3_2.model.LibraryMember;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    ArrayList<LibraryMember> members;

    public Library() {
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
    }
    public List<Book> getBooks(){
        return books;
    }
    public void addBook(Book book) {
        books.add(book);
    }

    public void addMember(LibraryMember newMember) {
        members.add(newMember);
    }

    public void borrowBook(Book book, LibraryMember user) {
        if (!book.isReserved()){
            books.remove(book);
            user.borrowBook(book);}
        else{
            System.out.println(book+" is currently reserved");
        }

    }

    public void returnBook(Book book, LibraryMember user) {
        books.add(book);
        user.returnBook(book);
    }

    public void reserveBook(LibraryMember member, Book book) {
        if (!book.isReserved()) {
            book.setReserved(true);
            member.addReservedBook(book);
            System.out.println("Book reserved successfully.");
        } else {
            System.out.println("Book is already reserved.");
        }

    }

    public void cancelReservation(LibraryMember member, Book book) {
        if (book.isReserved() && member.hasReservedBook(book)) {
            book.setReserved(false);
            member.removeReservedBook(book);
            System.out.println("Reservation canceled successfully.");
        } else {
            System.out.println("Book was not reserved by this member.");
        }
    }
    public void displayReservedBooks(LibraryMember member) {
        System.out.println("Reserved books for " + member.getName() + ":");
        for (Book book : member.getReservedBooks()) {
            System.out.println(book.getTitle());
        }
    }


}
