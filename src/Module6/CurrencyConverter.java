package Module6;

import java.util.Map;
import java.math.BigDecimal;

public class CurrencyConverter {
    private Map<String,Double> rates = new java.util.HashMap<>();
    public CurrencyConverter() {
        rates.put("USD",1.0);
        rates.put("EUR",0.94);
        rates.put("GBP",0.82);
        rates.put("INR",68.32);
        rates.put("AUD",1.35);
        rates.put("CAD",1.32);
        rates.put("SGD",1.43);
        rates.put("CHF",1.01);
        rates.put("MYR",4.47);
        rates.put("JPY",115.84);
        rates.put("CNY",6.92);
    }
    public double convert(double amount, String sourceCurrency, String targetCurrency) {

        if (sourceCurrency.equals(targetCurrency)) {
            return amount;
        } else {
            BigDecimal bd = new BigDecimal(amount * rates.get(targetCurrency) / rates.get(sourceCurrency));
            bd = bd.setScale(2, BigDecimal.ROUND_HALF_UP);
            return bd.doubleValue();

        }


    }}



