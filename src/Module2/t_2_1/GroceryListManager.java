package Module2.t_2_1;
import java.util.ArrayList;

public class GroceryListManager {
    private ArrayList<String> groceryList = new ArrayList<>();

    // Add methods here
    void addItem(String item){
        groceryList.add(item);
    }

    void removeItem(String item){
        System.out.println("Removing "+ item + " from the list");
        groceryList.remove(item);
    }
    void displaylist(){
        for(String item:groceryList){
            System.out.println(item);
        }
    }
    boolean checkItem(String item){
        return groceryList.contains(item);
    }
    public static void main(String[]args){
        GroceryListManager grocerylist = new GroceryListManager();

        grocerylist.addItem("Mehu");
        grocerylist.addItem("Maito");
        grocerylist.addItem("Juusto");
        grocerylist.addItem("Leipä");
        System.out.println("Lista: ");
        grocerylist.displaylist();
        System.out.println();
        System.out.println("Onko juusto listalla? "+ grocerylist.checkItem("Juusto"));
        System.out.println();
        grocerylist.removeItem("Juusto");
        System.out.println();
        System.out.println("Päivitetty Lista: ");
        grocerylist.displaylist();
    }
}
