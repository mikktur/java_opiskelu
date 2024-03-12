package Module6.t2_1.controller;

import Module6.t2_1.dao.CurrencyDao;
import Module6.t2_1.dao.TransactionDao;
import Module6.t2_1.entity.Currency;
import Module6.t2_1.entity.Transaction;
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
            } else {
                view.setNoConErrorMessage();
            }


        }
    }

    public void saveTransactionData(double amount, String sourceCurrency, String targetCurrency) {
        TransactionDao transactionDao = new TransactionDao();
        CurrencyDao currencyDao = new CurrencyDao();
        Currency sourceCur = null;
        Currency targetCur = null;
        try {
            sourceCur = currencyDao.findByAbbreviation(sourceCurrency);
            targetCur = currencyDao.findByAbbreviation(targetCurrency);
        } catch (SQLException e) {
            view.setNoConErrorMessage();
            return;
        }
        Transaction transaction = new Transaction(amount, sourceCur, targetCur);
        try {
            transactionDao.saveTransaction(transaction);
        } catch (SQLException e) {
            view.setNoConErrorMessage();
        }
    }

}