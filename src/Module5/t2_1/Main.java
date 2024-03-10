package Module5.t2_1;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Theater theater = new Theater();
        Thread[] customers = new Thread[15];
        Random random = new Random();

        for (int i = 0; i < customers.length; i++) {
            int random_int = random.nextInt(4)+1;
            customers[i] = new Thread(new Customer(theater, random_int));
        }

        // depositors start their work
        for(Thread customer:customers){
            customer.start();
        }

        // here we wait for them to be ready
        try {
            for(Thread customer:customers){
                customer.join();
            }

        } catch (InterruptedException e) {


        }
    }
}

