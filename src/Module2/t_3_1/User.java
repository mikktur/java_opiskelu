package Module2.t_3_1;

import java.util.ArrayList;

public class User {
    private String name;

    private ArrayList<Book> borrowedBooks;

    //poistin agen, koska sitä ei käytetty missään ikinä.
    public User(String name) {
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    void addBook(Book book) {
        this.borrowedBooks.add(book);
    }
    String getName(){
        return this.name;
    }
    ArrayList<Book> getBorrowed() {
        return this.borrowedBooks;

    }
    void removeBook(Book book) {
        this.borrowedBooks.remove(book);


    }
}
