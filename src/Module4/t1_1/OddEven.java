package Module4.t1_1;

public class OddEven extends Thread {
    public static void main(String[] args) throws InterruptedException {
        Even even = new Even(0, 10);
        Odd odd = new Odd(0, 10);
        odd.start();
        odd.join();
        even.start();


        even.join();
        System.out.println("Printing complete");




    }
}

