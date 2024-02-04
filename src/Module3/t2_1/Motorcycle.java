package Module3.t2_1;

public class Motorcycle extends AbstractVehicle implements Vehicle {
    private String color;

    public Motorcycle() {
        super("Motorcycle", "Gasoline");
        this.color = "blue";
    }


    @Override
    public String unitSpecificInfo() {
        return "Color : " + this.color;
    }

    @Override
    public long calculateFuelEfficiency() {
        return 5;
    }
}


