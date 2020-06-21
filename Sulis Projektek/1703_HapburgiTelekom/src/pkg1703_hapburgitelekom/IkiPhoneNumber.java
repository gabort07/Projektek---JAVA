package pkg1703_hapburgitelekom;

/**
 *
 * @author gabesz
 */
public class IkiPhoneNumber extends PhoneNumber {

    public IkiPhoneNumber() {
    }

    @Override
    public int price(int perc, int masodperc) {
        if (perc < 0 || masodperc < 0 || masodperc > 59) {
            return -1;
        }
        if (perc == 0 && masodperc == 0) {
            return 0;
        }
        if (masodperc >= 0) {
            perc++;
        }
        int percek[] = new int[perc];
        percek[0] = masodperc * perc;
        for (int i = 1; i < percek.length; i++) {
            percek[i] = i * 60;
        }
        int osszeg = 0;
        for (int i = 0; i < percek.length; i++) {
            osszeg += percek[i];
        }
        return osszeg;
    }
}
