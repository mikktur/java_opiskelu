package Module3.t2_1;

public abstract class AbstractVehicle implements Vehicle,ElectricVehicle {
    private String type;
    private String fuel;
    private String additionalAttr;

    public AbstractVehicle(String type, String fuel) {
        this.type = type;
        this.fuel = fuel;
        this.additionalAttr = "Additional attribute";

    }

    public String getType() {
        return type;
    }

    public String getFuel() {
        return fuel;
    }
    public String getInfo() {
        return "Type: " + getType() + "\nFuel: " + getFuel() + "\n";
    }
    public void additionalMethod(){
        System.out.println(this.additionalAttr);
    }
    public void charge(){
        System.out.println("No possible to charge");
    }
}