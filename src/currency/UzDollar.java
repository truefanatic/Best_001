package currency;

public class UzDollar extends AbstractCurrency implements  FreeConverted {
    public UzDollar(double baseCurs) {
        super(baseCurs);
    }

    @Override
    public String getCurrencyName() {
        return "UzDollar";
    }

    @Override
    public boolean isFreeConverted() {
        return false;
    }
}
