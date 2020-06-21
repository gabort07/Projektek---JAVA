package Multifor;

public class MultiFor {

    public static void main(String[] args) {
//        for (int x = 0; x < 4; x++) {
//            for (int y = 4; y > 2; y--) {
//                System.out.println(x + " " + y);
//            }
//            if (x == 1) {
//                x++;
//            }
//        }
        
        int x = 0;
        int y = 30;

        for (int outer = 0; outer < 3; outer++) {
            for (int inner = 4; inner > 1; inner--) {
                x=x+3;
                y = y - 2;
                if (x == 6) {
                    break;
                }
                x = x + 3;
            }
            y = y - 2;
        }
        System.out.println(x + " " + y);
    }
}
