package Module3.t2_1;

public abstract class AbstractVehicle implements Vehicle, ElectricVehicle {
    private String type;
    private String fuel;
    private long fuelEff;

    public AbstractVehicle(String type, String fuel) {
        this.type = type;
        this.fuel = fuel;
        this.fuelEff = calculateFuelEfficiency();

    }

    public String getInfo() {
        if (this.fuel.equals("Electric")) {
            return "Type: " + this.type + "\nFuel: " + this.fuel + "\n" + unitSpecificInfo() + "\nFuel efficiency : "
                    + this.fuelEff + " kWh per liter";
        } else {
            return "Type: " + this.type + "\nFuel: " + this.fuel + "\n" + unitSpecificInfo() + "\nFuel efficiency : "
                    + this.fuelEff + " Km per liter";
        }
    }

    public abstract String unitSpecificInfo();


    public void charge() {
        System.out.println("No possible to charge");
    }

    public void start() {
        System.out.println(this.type + " is starting...");
    }

    ;

    public void stop() {
        System.out.println(this.type + " is stopping...");
    }

    public abstract long calculateFuelEfficiency();
}