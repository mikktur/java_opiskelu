package Module3.t2_1;

public class Car extends AbstractVehicle implements Vehicle {
    private String color;

    public Car() {
        super("Car", "Petrol");
        this.color = "red";
    }

    @Override
    public String getInfo() {
        return super.getInfo() +"Color: " + this.color;
    }


}


