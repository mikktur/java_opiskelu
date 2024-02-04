package Module3.t2_1;

public class Motorcycle extends AbstractVehicle implements Vehicle{
    private String color;
    public Motorcycle() {
        super("Motorcycle", "Gasoline");
        this.color = "blue";
    }



    @Override
    public String getInfo() {
        return "Type: " + getType() + "\nFuel: " + getFuel()+ "\nFuel efficiency : " + getFuelefficiency() +" Km per liter";
    }

    @Override
    public long calculateFuelEfficiency() {
        return 5;
    }

    @Override
    public void charge() {
        System.out.println("No possible to charge");
    }
}


