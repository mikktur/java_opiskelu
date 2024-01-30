package Module2.t_3_1;

import java.util.ArrayList;


public class Library {
    private final ArrayList<Book> books = new ArrayList<>();

    void addBook(Book book) {
        books.add(book);
    }

    void displayBooks() {
        for (Book book : books) {
            System.out.println(book.toString());
        }
    }

    void getAverageBookRating() {
        double sum = 0.0;
        for (Book book : books) {
            sum += book.getRating();
        }
        System.out.println("Average rating of books is : " + (sum / books.size()));
    }

    void findBooksByAuthor(String author) {
        System.out.println("Books written by " + author + ": ");
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                System.out.println(book);
            }
        }
    }

    void getMostReviewedBook() {
        int most_num = 0;
        Book most = null;
        for (Book book : books) {
            if (book.getReviews().size() > most_num) {
                most_num = book.getReviews().size();
                most = book;
            }

        }
        if (most_num > 0) {
            System.out.println(most.getTitle() + " Has the most reviews with " + most_num + " reviews");
        }
    }

    void borrowBook(String title, User user) {
        if (isBookAvailable(title)) {
            for (Book book : books) {
                if (book.getTitle().equals(title)) {
                    books.remove(book);
                    user.addBook(book);
                    return;
                }
            }
        }else {
            System.out.println(title + " is not currently available");
        }

    }


    void returnBook(Book book, User user) {

        ArrayList<Book> borrowedBooks = user.getBorrowed();
        if (!borrowedBooks.isEmpty()) {
            if (borrowedBooks.contains(book)) {
                books.add(book);
                user.removeBook(book);
                System.out.println(user.getName() + " returned " + book.getTitle() + " to the library.");
            } else {
                System.out.println(user.getName() + " did not borrow the specified book.");
            }
        } else {
            System.out.println(user.getName() + " has not borrowed any books.");
        }
    }


    void displayUserBorrowedBooks(User user) {
        ArrayList<Book> borrowedBooks = user.getBorrowed();
        if (!borrowedBooks.isEmpty()) {
            System.out.println(user.getName() + " borrowed books: ");
            for (Book book : borrowedBooks) {
                System.out.println(book.toString());
            }
        } else {
            System.out.println(user.getName() + " has not borrowed any books.");
        }
    }

    boolean isBookAvailable(String title) {

        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return true;

            }
        }
        return false;

    }
}
