package Module3.t3_2.library.model;

import java.util.ArrayList;
import java.util.List;

public class LibraryMember {
    String name;
    int id;
    static int memberCount;
    List<Book> borrowedBooks;
    List<Book> reservedBooks;

    public LibraryMember(String name) {
        this.name = name;
        memberCount++;
        this.id = memberCount;
        this.borrowedBooks = new ArrayList<>();
        this.reservedBooks = new ArrayList<>();
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }
    public void addReservedBook(Book book){
        this.reservedBooks.add(book);
    }
    public void removeReservedBook(Book book){
        this.reservedBooks.remove(book);
    }
    public List<Book> getBorrowedBooks() {
        if (!borrowedBooks.isEmpty()) {
            return this.borrowedBooks;
        } else{
            System.out.println("Member havent borrowed any books.");
            return this.borrowedBooks;
        }

    }


    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }

    public void returnBook(Book book) {
        if (!borrowedBooks.isEmpty()) {
            borrowedBooks.remove(book);
        } else{
            System.out.println("Member havent borrowed any books.");
        }

    }
    public Boolean hasReservedBook(Book book){
        return reservedBooks.contains(book);
    }
    public List<Book> getReservedBooks(){
        return this.reservedBooks;
    }

}
