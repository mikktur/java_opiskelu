package Module6.t2_1.controller;

import Module6.t2_1.dao.CurrencyDao;
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
            sourceRate = currencyDao.getExchangeRate(sourceCurrency);
            targetRate = currencyDao.getExchangeRate(targetCurrency);
        } catch (SQLException e) {
            view.setErrorMessage();
            return;
        }
        System.out.println("sourceRate: " + sourceRate);
        System.out.println("targetRate: " + targetRate);
        double convertedAmount = amount / sourceRate * targetRate;
        convertedAmount = Math.round(convertedAmount * 100.0) / 100.0;
        view.setConvertedAmount(convertedAmount);
    }

        public void setErrorMessage () {
            view.setErrorMessage();
        }

        public void setChoiceBoxItems () {
            CurrencyDao currencyDao = new CurrencyDao();
            try {
                view.setChoiceBoxItems(currencyDao.getCurrencyAbbreviations());
            } catch (SQLException e) {
                view.setErrorMessage();
            }
        }



    }
