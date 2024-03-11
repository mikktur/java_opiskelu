package Module5.t4_2;

import java.util.ArrayList;
import java.util.HashMap;

public class ShoppingCart {
    private HashMap<String,Double> items = new HashMap<>();
    public ShoppingCart() {
    }

    public void addItem(String item, double price) {
        items.put(item, price);
    }

    public void removeItem(String item) {
        items.remove(item);
    }

    public int getItemCount() {
        return items.size();
    }

    public double calculateTotal() {
        double total = 0;
        for (double price : items.values()) {
            total += price;
        }
        return total;
    }

}
