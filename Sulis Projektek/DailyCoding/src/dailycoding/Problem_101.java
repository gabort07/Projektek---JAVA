package dailycoding;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem_101 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Kérek egy páros számot! ");
        System.out.println(primesum(sc.nextInt()));

    }

    public static ArrayList<Integer> primesum(int a) {
        for (int i = 2; i <= a / 2; i++) {
            if (isPrime(i) && isPrime(a - i)) {
                ArrayList<Integer> output = new ArrayList<>();
                output.add(i);
                output.add(a-i);
                return output;
            }
        }
        return null;
    }

    public static boolean isPrime(int a) {
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

}
