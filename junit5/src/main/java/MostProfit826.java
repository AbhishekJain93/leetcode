import java.util.Arrays;

public class MostProfit826 {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        DiffProfit[] dp = new DiffProfit[difficulty.length];
        for (int i = 0; i < difficulty.length; i++) {
            dp[i] = new DiffProfit(difficulty[i], profit[i]);
        }

        Arrays.sort(dp, (DiffProfit a, DiffProfit b) -> Integer.compare(a.difficulty, b.difficulty));

        int[] preMaxProfit = new int[dp.length];

        preMaxProfit[0] = dp[0].profit;
        for (int i = 1; i < preMaxProfit.length; i++) {
            preMaxProfit[i] = Math.max(preMaxProfit[i - 1], dp[i].profit);
        }

        int total = 0;
        for (int i = 0; i < worker.length; i++) {
            int idx = binarySearchX(dp, worker[i], 0, dp.length - 1);

            total += (idx == -1 ? 0 : preMaxProfit[idx]);

        }

        return total;
    }

    private int binarySearchX(DiffProfit[] dp, int diff, int low, int high) {
        if (high < low)
            return low - 1;

        if (high == low && dp[low].difficulty > diff)
            return low - 1;

        if (high == low)
            return low;

        if (high - low == 1 && dp[high].difficulty <= diff)
            return high;

        if (high - low == 1 && dp[low].difficulty <= diff)
            return low;

        int mid = low + (high - low) / 2;

        if (diff < dp[mid].difficulty) {
            return binarySearchX(dp, diff, low, mid - 1);
        } else
            return binarySearchX(dp, diff, mid, high);
    }

}

class DiffProfit {
    int difficulty;
    int profit;

    public DiffProfit(int a, int b) {
        difficulty = a;
        profit = b;
    }
}