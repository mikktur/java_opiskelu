package Module5.t2_1;

public class Customer implements Runnable {
    private Theater theater;
    int n;
    static int counter = 1;
    int id = 0;
    public Customer(Theater theater, int n) {
        this.theater = theater;
        this.n = n;
        this.id = counter++;
    }

    public void run() {
        if(theater.reserveSeat(n)){
            System.out.println("Customer " + id + " reserved " + n +" tickets");
        } else System.out.println("Customer " + id + " couldnt reserve "+ n + " tickets");

    }
}

