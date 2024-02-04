package Module3.t2_1;

public interface Vehicle {
    void start();
    void stop();
    String getInfo();
    //oisin ihan hyvin voinu lisätä pelkästään kanssa, getFuelType(),getType() jne...
    String unitSpecificInfo();
    long calculateFuelEfficiency();
}
