import java.util.HashMap;
import java.util.Map;

public class coinchange322 {

    public static void main(String[] args) {
        System.out.println(new coinchange322().coinChange(new int[] { 1, 2, 5 }, 11));
    }

    public int coinChange(int[] coins, int amount) {

        Map<Integer, Double> map = new HashMap<>();
        double coinsNum = coinChangeHelper(coins, amount, map);
        return coinsNum == Double.POSITIVE_INFINITY ? -1 : (int) coinsNum;
    }

    public double coinChangeHelper(int[] coins, int amount, Map<Integer, Double> map) {
        if (amount == 0)
            return 0;
        if (amount < 0)
            return Double.POSITIVE_INFINITY;

        if (map.containsKey(amount))
            return map.get(amount);

        double minCoins = Double.POSITIVE_INFINITY;

        for (int val : coins) {
            minCoins = Math.min(minCoins, 1 + coinChangeHelper(coins, amount - val, map));
        }

        map.put(amount, minCoins);
        return minCoins;
    }

}
