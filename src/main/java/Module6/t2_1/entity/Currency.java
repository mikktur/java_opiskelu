package Module6.t2_1.entity;

import jakarta.persistence.*;
@Entity
@Table(name="currencies")
@NamedQuery(name = "Currency.findAllAbbreviations", query = "SELECT c.abbreviation FROM Currency c")
public class Currency {
    @Id
    @Column(name="abbreviation")
    private String abbreviation;
    @Column(name="name")
    private String name;
    @Column(name="conversionrate")
    private double conversionrate;


    public Currency(String abbreviation, String name, double conversionrate) {
        super();
        this.abbreviation = abbreviation;
        this.name = name;
        this.conversionrate = conversionrate;
    }

    public Currency() {

    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public String getName() {
        return name;
    }

    public double getConversionToUSD() {
        return conversionrate;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;

    }

    public void setConversionRate(double conversionrate) {
        this.conversionrate = conversionrate;
    }

    public void setName(String name) {
        this.name = name;
    }




}



