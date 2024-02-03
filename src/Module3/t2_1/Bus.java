package Module3.t2_1;

public class Bus extends AbstractVehicle implements Vehicle {
    private int capacity;

    public Bus() {
        super("Bus", "Diesel");
        this.capacity = 20;
    }


    @Override
    public String getInfo() {
        return "Type: " + getType() + "\nFuel: " + getFuel() + "\nCapacity: " + capacity + " passengers";
    }

    @Override
    public void charge() {
        System.out.println("No possible to charge");
    }
}
