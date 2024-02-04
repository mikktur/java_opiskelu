package Module3.t2_1;

public interface Vehicle {
    default void start(){
        System.out.println(getType() + " is starting...");
    };
    default void stop(){
        System.out.println(getType() + " is stopping...");
    };
    String getInfo();
    String getType();
    String getFuel();
    long calculateFuelEfficiency();
    long getFuelefficiency();

}
