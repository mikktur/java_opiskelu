package Module2.t_1_4;

public class Car {
    /* An object of class Car will have instance variables speed and gasolineLevel.
     * Both are private (they can not be accessed outside the class methods).
     * Keep instance variables private whenever possible.
     */
    private float speed;
    private float gasolineLevel;
    private String typeName;
    private int tankCap;
    private int topSpeed;
    final int cruiseMax;
    final int cruiseMin;
    private int cruiseTarget;
    private boolean cruiseOn;

    /* This is the method (constructor) called when a new instance of Car is created (with new).
     * Constructors may also have arguments.
     */
    public Car(String typeName) {
        speed = 0;
        gasolineLevel = 0;
        cruiseMax = 120;
        cruiseMin = 25;
        this.cruiseOn = false;
        this.cruiseTarget = 0;
        this.typeName = typeName;   // this refers to the object itself.
        // The reference is useful if you want to use parameter names that are
        // identical to instance variable names (and for more, later on)
    }

    public Car(String typeName, int topSpeed, int tankCap) {
        this.cruiseOn = false;
        speed = 0;
        gasolineLevel = 0;
        cruiseMax = 120;
        cruiseMin = 25;
        this.cruiseTarget = 0;
        this.tankCap = tankCap;
        this.topSpeed = topSpeed;
        this.typeName = typeName;
    }

    /* Implementations of some methods.
     * Note that methods refer to and change instance variable values.
     */
    public void accelerate() {
        if (gasolineLevel > 0)
            speed += 10;
        else
            speed = 0;
    }

    void decelerate(int amount) {
        if (gasolineLevel > 0) {
            if (amount > 0)
                speed = Math.max(0, speed - amount);
        } else
            speed = 0;
    }

    float getSpeed() {
        return speed;
    }

    String getTypeName() {
        return typeName;
    }

    void fillTank() {
        gasolineLevel = 100;
    }

    float getGasolineLevel() {
        return gasolineLevel;
    }


    void cruiseSwitch() {
        this.cruiseOn = !this.cruiseOn;
        if(cruiseOn){
            System.out.println("Cruise control has been turned on.");
        }else{
            System.out.println("Cruise control has been turned off");
        }
    }

    boolean getCruiseState() {
        return this.cruiseOn;
    }

    void cruiseDrive() {
        while(cruiseOn){
            while (this.cruiseTarget > this.getSpeed()) {
                accelerate();
                System.out.println(this.getTypeName() + ": speed is " + this.getSpeed() + " km/h");
            } while (this.cruiseTarget < this.getSpeed()) {
                decelerate(10);
                System.out.println(this.getTypeName() + ": speed is " + this.getSpeed() + " km/h");
            }
            if(this.speed==this.cruiseTarget){
                break;
            }
            }

        }




    void setCruiseTarget(int tar) {
        tar = Math.round(tar / 10.0f) * 10;
        if (tar <= cruiseMax && tar >= cruiseMin) {
            this.cruiseTarget = tar;
        } else {
            cruiseSwitch();
        }

    }

    int getCruiseTarget() {
        return this.cruiseTarget;
    }
}
