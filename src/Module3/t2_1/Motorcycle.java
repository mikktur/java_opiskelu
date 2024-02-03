package Module3.t2_1;

public class Motorcycle extends AbstractVehicle implements Vehicle{
    private String color;
    public Motorcycle() {
        super("Motorcycle", "Gasoline");
        this.color = "blue";
    }



    @Override
    public String getInfo() {
        return super.getInfo() +"Color: " + this.color;
    }

}


