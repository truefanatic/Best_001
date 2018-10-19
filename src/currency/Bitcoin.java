package currency;

public class Bitcoin extends AbstractCurrency {

    public Bitcoin(double baseCurs) {
        super(baseCurs);
    }

    @Override
    public String getCurrencyName() {
        return "Bitcoin";
    }

    @Override
    public double convertGrnToCurrency(int grnValue) {
        System.out.println("Операция запрещена нацбанком");
        return grnValue;
    }

    @Override
    public double convertCurrencyToGrn(int currencyValue) {
        System.out.println("Операция запрещена нацбанком");
        return currencyValue;
    }
}
