package Module7.t1_1.Model;

import java.util.ArrayList;

public class Currency {
    private String abbreviation;
    private String name;
    private double conversionToUSD;
    private ArrayList <Currency> currencies = new ArrayList<>();



    public Currency(String abbreviation, String name, double conversionToUSD) {
        this.abbreviation = abbreviation;
        this.name = name;
        this.conversionToUSD = conversionToUSD;
        currencies.add(this);
    }


}
