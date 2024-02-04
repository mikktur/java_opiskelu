package Module3.t2_1;

public class ElectricMotorcycle extends AbstractVehicle {


    int currCharge;

    public ElectricMotorcycle() {
        super("ElectricMotorCycle", "Electric");
        this.currCharge = 0;

    }


    @Override
    public String getInfo() {
        return "Type: " + getType() + "\nFuel: " + getFuel() + "\nCharge: " + this.currCharge+ "\nFuel efficiency : " + getFuelefficiency() +" kWh per liter";

    }

    @Override
    public long calculateFuelEfficiency() {
        return 20;
    }

    @Override
    public void charge() {
        this.currCharge = 100;
    }
}
