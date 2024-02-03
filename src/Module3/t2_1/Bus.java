package Module3.t2_1;

public class Bus extends AbstractVehicle implements Vehicle {
    private int capacity;

    public Bus() {
        super("Bus", "Diesel");
        this.capacity = 20;
    }


    @Override
    public String getInfo() {
        return super.getInfo() +"Capacity: " + this.capacity;
    }



}
