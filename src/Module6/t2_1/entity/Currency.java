package Module6.t2_1.entity;



public class Currency {
    private String abbreviation;
    private String name;
    private double conversionToUSD;


    public Currency(String abbreviation, String name, double conversionToUSD) {
        this.abbreviation = abbreviation;
        this.name = name;
        this.conversionToUSD = conversionToUSD;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public String getName() {
        return name;
    }

    public double getConversionToUSD() {
        return conversionToUSD;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;

    }

}



