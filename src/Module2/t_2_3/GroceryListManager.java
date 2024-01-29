package Module2.t_2_3;
import java.util.ArrayList;
import java.util.HashMap;


public class GroceryListManager {
    private ArrayList<String> groceryList = new ArrayList<>();
    private HashMap<String, Double> costMap = new HashMap<>();
    private HashMap<String,ArrayList<String>> categoryMap = new HashMap<>();
    private HashMap<String,Integer> quantMap = new HashMap<>();

    // Add methods here
    void addItem(String item) {
        groceryList.add(item);
    }

    void removeItem(String item) {
        System.out.println("Removing " + item + " from the list");
        groceryList.remove(item);
        costMap.remove(item);
    }
    void addItemWithCategory(String item, String category){
        addItem(item);
        if (!categoryMap.containsKey(category)) {
            categoryMap.put(category, new ArrayList<>());
        }
        categoryMap.get(category).add(item);
    }
    void displaylist() {
        for (String item : groceryList) {
            System.out.println(item);
        }
    }
    void displayByCategory(String category){
        ArrayList<String> itemsInCategory = categoryMap.get(category);
        System.out.println("Items in category " + category + ":");
        for (String item : itemsInCategory) {
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
    void addItemWithQuantity(String item, int quantity){
        addItem(item);
        quantMap.put(item,quantity);
    }
    void updateQuantity(String item,int newQuant){
        quantMap.put(item,newQuant);
    }
    void displayAvailableItems(){
        for(String item:groceryList){
            if(quantMap.containsKey(item) && quantMap.get(item) >0){
                System.out.println("Tuote: " + item + ", Saatavilla : "+ quantMap.get(item)+"kpl");
            }

        }
    }

    public static void main(String[] args) {
        GroceryListManager grocerylist = new GroceryListManager();

        grocerylist.addItem("Mehu",2.49);
        grocerylist.addItem("Maito",1.39);
        grocerylist.addItem("Juusto",3.9);
        grocerylist.addItem("Leipä",2.49);
        grocerylist.addItemWithCategory("Banaani","Hedelmä");
        grocerylist.addItemWithCategory("Omena","Hedelmä");
        grocerylist.addItemWithCategory("Päärynä","Hedelmä");
        grocerylist.addItemWithCategory("Mandariini","Hedelmä");
        grocerylist.addItemWithCategory("Ruisleipä","Leipä");
        grocerylist.addItemWithCategory("Kauraleipä","Leipä");
        grocerylist.addItemWithQuantity("Hernekeitto",12);
        grocerylist.addItemWithQuantity("Kalakeitto",5);
        grocerylist.addItemWithQuantity("Jauhelihakeitto",200);
        grocerylist.updateQuantity("Hernekeitto",0);

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
        grocerylist.displayByCategory("Leipä");
        grocerylist.displayAvailableItems();
    }
}

//Tässä tehtävän ohjelmassa ei ollut mitään järkeä... tai sit oon vaan tymä.