package Module3.t1_2;

import Module2.t_1_2.Car;

public class Bus extends Car {
    private int passengers;
    private int capacity;
    public Bus(String typeName,int capacity) {
        super(typeName);
        this.passengers = 0;
        this.capacity = capacity;
    }
    void passengerEnter(){
        if(capacity > passengers)
            passengers++;
        else
            System.out.println("The bus is full");
    }
    void passengerLeave(){
        if (capacity>0)
            passengers--;
        else
            System.out.println("The bus is already empty");

    }
    int getPassengers(){
        return this.passengers;
    }
    public static void main(String[]args){
        Bus bus = new Bus("Skada",10);
        bus.fillTank();
        bus.passengerEnter();
        bus.passengerEnter();
        bus.passengerEnter();
        bus.accelerate();
        bus.accelerate();
        System.out.println("Passengers: " + bus.getPassengers()+" Speed: "+bus.getSpeed());
        bus.passengerLeave();
        bus.decelerate(10);
        System.out.println("Passengers: " + bus.getPassengers()+" Speed: "+bus.getSpeed());

    }
}
