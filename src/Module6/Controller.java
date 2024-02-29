package Module6;


public class Controller {
    private CurrencyConvView view;
    private CurrencyConverter converter = new CurrencyConverter();

    public Controller(CurrencyConvView view) {
        this.view = view;

    }

    public void setConvertedAmount(double amount, String sourceCurrency, String targetCurrency) {
        view.setConvertedAmount(converter.convert(amount, sourceCurrency, targetCurrency));


    }


}
