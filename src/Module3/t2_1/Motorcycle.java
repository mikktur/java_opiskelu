package Module3.t2_1;

public class Motorcycle extends AbstractVehicle implements Vehicle{
    private String color;
    public Motorcycle() {
        super("Motorcycle", "Gasoline");
        this.color = "blue";
    }



    @Override
    public String getInfo() {
        return "Type: " + getType() + "\nFuel: " + getFuel();
    }

    @Override
    public void charge() {
        System.out.println("No possible to charge");
    }
}


