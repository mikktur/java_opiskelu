package Module5.t2_2;

public class Main {

    public static void main(String[]args) throws InterruptedException{
        ItemCollection items = new ItemCollection();
        Thread[] threads = new Thread[20];

        for (int i = 0; i < threads.length / 2; i++) {
            threads[i] = new Thread(new Handler(items, "item "+ i, "adder"));
        }

        for (int i = threads.length / 2; i < threads.length; i++) {
            threads[i] = new Thread(new Handler(items, "item " + (i - threads.length / 2), "remover"));
        }

        for (Thread thread : threads) {
            thread.start();
        }

        for (Thread thread : threads) {
            thread.join();
        }


    }
}



