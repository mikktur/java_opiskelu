package Module2.t_3_1;

public class Main {
    public static void main(String[] args) {
        /*
        Book taru = new Book("Taru Sormusten","Tolkien",1954);
        Book harry = new Book("Harry Potter","Rowling",1997);
        Book hobitti = new Book("hobitti","Tolkien",1944);
        Book game = new Book("Game of thrones","George",1996);
        Library kirjasto = new Library();
        kirjasto.addBook(taru);
        kirjasto.addBook(harry);
        kirjasto.addBook(hobitti);
        kirjasto.addBook(game);
        kirjasto.displayBooks();
        kirjasto.findBooksByAuthor("Tolkien");
        kirjasto.borrowBook("hobitti");
        kirjasto.displayBooks();
        kirjasto.returnBook(hobitti);
        kirjasto.displayBooks();
*/
        //tein Ai:lla test caset.
        Library library = new Library();

        Book book1 = new Book("Title1", "Author1", 2000);
        book1.setRating(4.5);
        book1.addReview("Excellent!");
        book1.addReview("Highly recommended!");

        Book book2 = new Book("Title2", "Author2", 2015);
        book2.setRating(3.8);
        book2.addReview("Enjoyed it!");

        Book book3 = new Book("Title3", "Author1", 2010);
        book3.setRating(4.2);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // Display all books
        System.out.println("All Books:");
        library.displayBooks();

        // Test Case 1: Calculate Average Book Rating
        library.getAverageBookRating();

        // Test Case 2: Find Books by Author
        library.findBooksByAuthor("Author1");

        // Test Case 3: Get Most Reviewed Book
        library.getMostReviewedBook();

        // Test Case 4: Borrow a Book
        User user1 = new User("User1");
        User user2 = new User("User2");
        library.borrowBook("Title1", user1);
        library.borrowBook("Title1", user2);
        library.displayUserBorrowedBooks(user1);
        library.displayUserBorrowedBooks(user2);
        System.out.println("is Title1 available: " +library.isBookAvailable("Title1"));  // Book should not be available in the library


        // Test Case 6: Return a Book
        library.borrowBook("Title2", user1);
        System.out.println("Is Title2 available? " + library.isBookAvailable("Title2"));
        library.displayUserBorrowedBooks(user1);
        library.returnBook(book2, user1);


        // Test Case 7: Display User's Borrowed Books
        library.displayUserBorrowedBooks(user1);

        // Test Case 8: Check Book Availability
        System.out.println("Is Title2 available? " + library.isBookAvailable("Title2"));
    }
}
