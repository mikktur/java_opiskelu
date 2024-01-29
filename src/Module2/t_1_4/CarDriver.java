package Module2.t_1_4;


public class CarDriver {
    /*Pakko sanoa, että kauheen ristiriitasta tietoa tässä tehtävässä. En ollut varma pitääkö auton kiihdyttää ekana
    maksimi cruisecontrol nopeuteen ja sitten ilmottaa, että ei pääse targetspeediin. Vai voiko sen vaan tarkistaa jo siinä
    vaiheessa kun sitä asetetaan. Toinen asia oli, että voiko targetspeediä muokata samalla kun cruisecontrol on päällä...

      */
    public static void main(String[] args) {
        Car myCar;

        myCar = new Car("Toyota Corolla");
        myCar.fillTank();

        myCar.setCruiseTarget(114);
        System.out.println(myCar.getCruiseTarget());
        myCar.cruiseSwitch();
        myCar.cruiseDrive();

        myCar.setCruiseTarget(18);
        System.out.println(myCar.getCruiseState());

        myCar.setCruiseTarget(35);
        myCar.cruiseSwitch();
        myCar.cruiseDrive();


    }
}
