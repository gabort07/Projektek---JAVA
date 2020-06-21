public class InvestmentUnit {

    private int count;
    private Instrument instrument;
    private Currency currency;

    public InvestmentUnit(int count, Instrument instrument, Currency currency) {
        if (count >= 0) {
            this.count = count;

        } else {
            this.count = 0;
        }
        this.instrument = instrument;
        this.currency = currency;
    }

    public int getCount() {
        return count;
    }

    public Instrument getInstrument() {
        return instrument;
    }

    public Currency getCurrency() {
        return currency;
    }

    public int getSum() {
        if (this.instrument.getPrice() < 0) {
            return 0;
        }
        return this.count * this.instrument.getPrice();
    }
}
