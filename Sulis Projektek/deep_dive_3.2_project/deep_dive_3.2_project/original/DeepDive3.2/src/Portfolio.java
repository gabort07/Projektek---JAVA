public class Portfolio {


    private int count;
    private InvestmentUnit[] units;
    private Currency baseCurrency;

    public Portfolio() {
        this.count = 0;
        this.baseCurrency = Currency.HUF;
        this.units = new InvestmentUnit[4];
    }


    public void addUnit(InvestmentUnit unit) {
        this.units[this.count] = unit;
        this.count++;
    }

    public int getCount() {
        return count;
    }

    public int totalSum(Currency huf) {
        int sum = 0;
        for (int i = 0 ; i < this.count ; i++) {
            if (this.units[i].getCurrency() == huf) {
                sum += this.units[i].getSum();
            }
        }
        return sum;
    }

    public int totalSum(CurrencyConverter converter) {
        int sum = 0;

        for (int i = 0 ; i < this.count ; i++) {
            int subSum = this.units[i].getSum();
            if (this.units[i].getCurrency() != this.baseCurrency) {
                subSum = subSum * converter.convert(this.units[i].getCurrency(), this.baseCurrency);
            }
            sum += subSum;
        }

        return sum;
    }
}
