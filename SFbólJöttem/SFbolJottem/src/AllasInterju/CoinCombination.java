package AllasInterju;

public class CoinCombination {

    public static void main(String[] args) {
        int[] coins = {1, 2};
        int totalAmount = 4;

        System.out.println(calculateCombo(coins, totalAmount));
    }

    public static int calculateCombo(int[] coins, int amount) {

        if (amount == 0) {
            return 1;
        }

        if (amount < 0) {
            return 0;
        }

        int combos = 0;
        for (int i = 0; i < coins.length; i++) {
            combos += calculateCombo(coins, amount - coins[i]);
        }
        return combos;
    }

}
