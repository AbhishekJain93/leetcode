public class bestTimeToBuy {

    public int maxProfit(int[] prices) {
        if (prices.length < 2)
            return 0;

        int[] maxTillNow = new int[prices.length];
        maxTillNow[maxTillNow.length - 1] = prices[prices.length - 1];
        for (int i = maxTillNow.length - 2; i >= 0; i--) {
            maxTillNow[i] = Math.max(maxTillNow[i + 1], prices[i]);
        }

        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            maxProfit = Math.max(maxProfit, maxTillNow[i] - prices[i]);
        }

        return maxProfit;
    }
}
