package Module3.t2_1;

public abstract class AbstractVehicle implements Vehicle,ElectricVehicle {
    private String type;
    private String fuel;
    private String additionalAttr;

    public AbstractVehicle(String type, String fuel) {
        this.type = type;
        this.fuel = fuel;
        this.additionalAttr = "Additional attribute";

    }

    public String getType() {
        return type;
    }

    public String getFuel() {
        return fuel;
    }
    public abstract String getInfo(); /*Aluksi pistin että subclassit otti superilla tästä tyypin ja fuelin, mutta aloin
                                        miettimään että se vähän undermainaisi interfacen hyötyjä. En oo ihan varma käsitinkö oikein
                                        mutta interfacen takia jokaisella vehiclella pitää olla omanlaisensa getinfo ja jos tämä ei olisi
                                        abstracti niin se mahdollistaisi virheiden sattumista. Tietenkin tässä tapauksessa se olisi
                                        näyttänyt ajouneuvon tyypin ja fueltyypin, joka olisi ollut ihan okei, mutta olisi silti jäänyt
                                        tietoja saamatta.*/

    public void additionalMethod(){
        System.out.println(this.additionalAttr);
    }
    public abstract void charge();
}