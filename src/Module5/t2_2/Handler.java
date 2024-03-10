package Module5.t2_2;

public class Handler implements Runnable {
    ItemCollection items;
    String type;
    String item;

    public Handler(ItemCollection items,String item,String type){
        this.items = items;
        this.type = type;
        this.item = item;

    }

    public void run(){
        if(this.type.equals("remover")){
            items.removeItem(item);
        } else if(this.type.equals("adder")){
            items.addItem(item);

        } else{
            System.out.println("Unknown handler");
        }


    }
}
