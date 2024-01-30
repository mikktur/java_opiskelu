package Module2.t_3_1;

import java.util.ArrayList;

public class Book {
    private String title;
    private String author;
    private int publicationYear;
    private double rating;
    private ArrayList<String> reviews = new ArrayList<>();

    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;


    }

    String getTitle() {
        return this.title;
    }

    String getAuthor() {
        return this.author;
    }

    int getPublicationYear() {
        return publicationYear;
    }
    void setRating(double rating){
        this.rating = rating;
    }
    void addReview(String review){
        this.reviews.add(review);
    }
    double getRating(){
        return this.rating;
    }
    ArrayList<String> getReviews(){
        return reviews;
    }
    public String toString() {
        return "Title: " + this.title + " Author: " + this.author + " Publication year: " + this.publicationYear;
    }

}
