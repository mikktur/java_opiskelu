package Module6.t2_1.controller;

import Module6.t2_1.dao.CurrencyDao;
import Module6.t2_1.entity.Currency;
import Module6.t2_1.view.CurrencyConvView;

import java.sql.SQLException;



public class Controller {
    private CurrencyConvView view;

    public Controller(CurrencyConvView view) {
        this.view = view;
    }


    public void setConvertedAmount(double amount, String sourceCurrency, String targetCurrency) {
        CurrencyDao currencyDao = new CurrencyDao();
        double sourceRate = 0;
        double targetRate = 0;
        try {
            System.out.println("test");
            sourceRate = currencyDao.findByAbbreviation(sourceCurrency).getConversionToUSD();
            targetRate = currencyDao.findByAbbreviation(targetCurrency).getConversionToUSD();
        } catch (SQLException e) {
            view.setNoConErrorMessage();
            return;
        }
        System.out.println("sourceRate: " + sourceRate);
        System.out.println("targetRate: " + targetRate);
        double convertedAmount = amount / sourceRate * targetRate;
        convertedAmount = Math.round(convertedAmount * 100.0) / 100.0;
        view.setConvertedAmount(convertedAmount);
    }



    public void setChoiceBoxItems() {
        CurrencyDao currencyDao = new CurrencyDao();
        try {
            view.setChoiceBoxItems(currencyDao.findAllAbbreviations());

        } catch (SQLException e) {
            view.setNoConErrorMessage();
        }
    }

    public void addCurrency(String abbreviation, String name, double conversionToUSD) {
        CurrencyDao currencyDao = new CurrencyDao();
        Currency currency = new Currency(abbreviation, name, conversionToUSD);
        try {
            currencyDao.addCurrency(currency);
        } catch (SQLException e) {
            if (e.getSQLState().equals("duplicate")) {
                view.setDuplicateErrorMessage();
            } else{
                view.setNoConErrorMessage();
            }


        }
    }
}