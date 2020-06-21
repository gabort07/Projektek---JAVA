public class Currency {

    public static Currency EUR = new Currency("EUR");
    public static Currency HUF = new Currency("HUF");
    public static Currency USD = new Currency("USD");


    private String code;

    private Currency(String code) {
        this.code = code;
    }

    public String toString() {
        return this.code;
    }


}
