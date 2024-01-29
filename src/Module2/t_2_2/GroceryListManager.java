package Module2.t_2_2;

import java.util.ArrayList;
import java.util.HashMap;


public class GroceryListManager {
    private ArrayList<String> groceryList = new ArrayList<>();
    private HashMap<String, Double> costMap = new HashMap<>();
    private HashMap<String,String> categoryMap = new HashMap<>();

    // Add methods here
    void addItem(String item) {
        groceryList.add(item);
    }

    void removeItem(String item) {
        System.out.println("Removing " + item + " from the list");
        groceryList.remove(item);
        costMap.remove(item);
    }

    void displaylist() {
        for (String item : groceryList) {
            System.out.println(item);
        }
    }

    void addItem(String item, Double cost) {
        addItem(item);
        costMap.put(item, cost);
    }

    void calculateTotalCost() {
        Double total = 0.0;
        for (Double value : costMap.values()) {
            total += value;

        }
        System.out.println(total);
    }

    boolean checkItem(String item) {
        return groceryList.contains(item);
    }

    public static void main(String[] args) {
        GroceryListManager grocerylist = new GroceryListManager();


        grocerylist.addItem("Mehu",2.49);
        grocerylist.addItem("Maito",1.39);
        grocerylist.addItem("Juusto",3.9);
        grocerylist.addItem("Leipä",2.49);
        System.out.println("Lista: ");
        grocerylist.displaylist();
        System.out.println();
        System.out.println("Onko juusto listalla? " + grocerylist.checkItem("Juusto"));
        System.out.println();
        grocerylist.removeItem("Juusto");
        System.out.println();
        System.out.println("Päivitetty Lista: ");
        grocerylist.displaylist();
        grocerylist.calculateTotalCost();
    }
}