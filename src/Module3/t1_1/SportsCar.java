package Module3.t1_1;

import Module2.t_1_2.Car;

public class SportsCar extends Car {

    //muutin myös speedin ja gasolinelevelin protectediksi.
    public SportsCar(String typeName) {
        super(typeName);

    }

    @Override
    public void accelerate() {
        if (gasolineLevel > 0) {
            speed += 15;
            gasolineLevel -= speed/100;//Car classissa ei ollut fuel consumptonia alunperinkään, mutta lisäsin jonkinnäkösen tähän.
        }
        else
            speed = 0;
    }
    @Override
    public void decelerate(int amount) {
        if (gasolineLevel > 0) {
            if (amount > 0) {
                speed = Math.max(0, speed - amount * 2);
                gasolineLevel -= speed / 100;
            }
        } else
            speed = 0;
    }

    public static void main(String[] args) {

        SportsCar car = new SportsCar("Ferrari");
        Car notasportscar = new Car("Lada");
        notasportscar.fillTank();
        car.fillTank();
        for (int i = 0;i<10;i++){
            car.accelerate();
            notasportscar.accelerate();
        }

        System.out.println(car.getTypeName()+ ": " + car.getSpeed());
        System.out.println(notasportscar.getTypeName() +": " +notasportscar.getSpeed());
        for (int i = 0;i<3;i++){
            car.decelerate(10);
            notasportscar.decelerate(10);
        }
        System.out.println(car.getTypeName()+ ": " + car.getSpeed());
        System.out.println(notasportscar.getTypeName() +": " +notasportscar.getSpeed());
        System.out.println(car.getGasolineLevel());
        System.out.println(notasportscar.getGasolineLevel());
    }
}