package Module3.t2_1;

public class VehicleDemo {
    public static void main(String[]args) {
        AbstractVehicle[] ajoneuvot = new AbstractVehicle[5];
        ajoneuvot[0] = new Car();
        ajoneuvot[1] = new Motorcycle();
        ajoneuvot[2] = new Bus();
        ajoneuvot[3] = new ElectricCar();
        ajoneuvot[4] = new ElectricMotorcycle();

        for(Vehicle ajoneuvo:ajoneuvot){
            ajoneuvo.start();
            System.out.println(ajoneuvo.getInfo());

        }
        for(Vehicle ajoneuvo:ajoneuvot){
            ajoneuvo.stop();
        }

        ajoneuvot[3].charge();
        System.out.println(ajoneuvot[3].getInfo());
        ajoneuvot[0].charge();
        Vehicle ajoneuvo = new Car();
        ajoneuvo.start();
        ajoneuvo.stop();
        System.out.println(ajoneuvo.getInfo());

    }
}
