package Module3.t2_1;

public class ElectricCar extends AbstractVehicle {
    int currCharge;

    public ElectricCar() {
        super("ElectricCar", "Electric");
        this.currCharge = 0;

    }


    @Override
    public String unitSpecificInfo() {
        return "Charge: " + this.currCharge;

    }

    @Override
    public long calculateFuelEfficiency() {
        return 25;
    }

    @Override
    public void charge() {
        this.currCharge = 100;
    }
}
