package pkg1703_hapburgitelekom;

/**
 *
 * @author gabesz
 */
public class KwakPhoneNumber extends PhoneNumber {

    public KwakPhoneNumber() {
    }

    @Override
    public int price(int perc, int masodperc) {
         if (perc < 0 || masodperc < 0 || masodperc > 59) {
            return -1;
        }
         if (perc==00 && masodperc ==0){
            return 0;
        }
           return 300;
    }
    
}
