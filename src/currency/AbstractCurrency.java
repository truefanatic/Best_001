package currency;

abstract public class AbstractCurrency {
    private double kursNBU;
    private double marga = 10;

    public AbstractCurrency(double baseCurs) {
        this.kursNBU = baseCurs;
    }

    abstract public String getCurrencyName();
    public double getKursNBU() {
        return kursNBU;
    }

    public void setKursNBU(double kursNBU) {
        this.kursNBU = kursNBU;
    }

    public double getMarga() {
        return marga;
    }

    public void setMarga(double marga) {
        this.marga = marga;
    }

    public double convertGrnToCurrency(int grnValue) {
        double tempResult = grnValue / kursNBU * (1 - marga / 100);
        System.out.println("For " + grnValue + " grn you get " + tempResult + " " + getCurrencyName());
        return tempResult;
    }

    public double convertCurrencyToGrn(int currencyValue) {
        double tempResult = currencyValue * kursNBU * (1 - marga / 100);
        System.out.println(
                String.format("For %s %s you get %s grn", currencyValue, getCurrencyName(), tempResult)
        );
        return tempResult;
    }
}