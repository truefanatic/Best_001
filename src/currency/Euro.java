package currency;

public class Euro extends AbstractCurrency implements FreeConverted {

    public Euro(double baseCurs) {
        super(baseCurs);
    }

    @Override
    public String getCurrencyName() {
        return "Euro";
    }

    @Override
    public boolean isFreeConverted() {
        return true;
    }
}
