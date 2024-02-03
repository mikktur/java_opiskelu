package Module3.t2_1;

public class ElectricMotorcycle extends AbstractVehicle {


    int currCharge;

    public ElectricMotorcycle() {
        super("ElectricMotorCycle", "Electric");
        this.currCharge = 0;

    }


    @Override
    public String getInfo() {
        return "Type: " + getType() + "\nFuel: " + getFuel() + "\nCharge: " + this.currCharge;

    }

    @Override
    public void charge() {
        this.currCharge = 100;
    }
}
