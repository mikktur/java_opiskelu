package Module3.t3_2.library.model;

public class Book {
    String title;
    String author;
    int ISBN;
    static int counter;
    boolean reserved;

    public Book(String title,String author){
        this.title = title;
        this.author = author;
        counter++;
        this.ISBN = counter;
        reserved = false;

    }
    public void setReserved(boolean reserve){
        this.reserved = reserve;

    }
    public boolean isReserved(){
        return reserved;
    }
    public String getTitle(){
        return this.title;
    }
    public String getAuthor(){
        return this.author;
    }
    public int getISBN(){
        return this.ISBN;
    }
    @Override
    public String toString(){
        return "ISBN: " + ISBN;
    }
}
