package Module5.t2_2;

import java.util.ArrayList;

public class ItemCollection {
    private ArrayList<String> items = new ArrayList<>();

    public ItemCollection() {
    }

    public void addItem(String item) {
        synchronized (this) {
            System.out.println(Thread.currentThread() + " is adding item");
            items.add(item);
            getCollectionSize();
        }

    }

    public void removeItem(String item) {
        synchronized (this) {
            if (items.contains(item)) {
                System.out.println(Thread.currentThread() + " is removing item");
                items.remove(item);
                getCollectionSize();

            } else System.out.println("Item is not in the list.");
        }
    }

    public synchronized void getCollectionSize() {
        System.out.println("Size of the list : " + items.size());
    }
}
