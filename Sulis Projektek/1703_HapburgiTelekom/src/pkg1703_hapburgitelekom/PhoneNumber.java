package pkg1703_hapburgitelekom;

/**
 *
 * @author gabesz
 */
public abstract class PhoneNumber {

    public abstract int price(int perc, int masodperc);

    public static PhoneNumber create(String szam) {
        if (szam.startsWith("88") && szam.matches("[0-9]+")) {
            return new IkiPhoneNumber();
        }

        if (szam.startsWith("1") && szam.matches("[0-9]+")) {
            return new KwakPhoneNumber();
        }

        if (szam.startsWith("999") && szam.matches("[0-9]+")) {
            return new McChipPhoneNumber();
        }
        return null;
    }
}
