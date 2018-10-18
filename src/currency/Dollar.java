package currency;

public class Dollar extends AbstractCurrency implements FreeConverted{
    public Dollar(double baseCurs) {
        super(baseCurs);
    }

    @Override
    public String getCurrencyName() {
        return "Dollar";
    }

    @Override
    public boolean isFreeConverted() {
        return true;
    }
}
