package Module3.t2_1;

public class ElectricCar extends AbstractVehicle {
    int currCharge;

    public ElectricCar() {
        super("ElectricCar", "Electric");
        this.currCharge = 0;

    }


    @Override
    public String getInfo() {
        return super.getInfo() +"Charge: " + this.currCharge;

    }

    @Override
    public void charge() {
        this.currCharge = 100;
    }
}
