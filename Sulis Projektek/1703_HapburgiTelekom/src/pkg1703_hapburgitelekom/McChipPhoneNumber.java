package pkg1703_hapburgitelekom;

/**
 *
 * @author gabesz
 */
public class McChipPhoneNumber extends PhoneNumber {

    public McChipPhoneNumber() {
    }

    @Override
    public int price(int perc, int masodperc) {
        if (perc < 0 || masodperc < 0 || masodperc > 59) {
            return -1;
        }
        if (perc == 0 && masodperc == 0) {
            return 0;
        }
        if (perc == 0 || masodperc > 0) {
            perc++;
        }

        return perc * 60 + 15;
    }
}
