import java.util.HashMap;
import java.util.Map;

public class PartitionArray1043 { // 15, 14, 1, 1
    public int maxSumAfterPartitioning(int[] arr, int k) {
        Map<Integer, Integer> dp = new HashMap<>();

        return helper(arr, 0, k, dp);
    }

    private int helper(int[] arr, int idx, int k, Map<Integer, Integer> dp) {
        if (idx > arr.length - 1)
            return 0;
        if (idx == arr.length - 1)
            return arr[idx];

        if (dp.containsKey(idx))
            return dp.get(idx);

        int max = Integer.MIN_VALUE;
        int maxWindowElement = arr[idx];
        for (int i = 0; i < k && i + idx < arr.length; i++) {
            maxWindowElement = Math.max(maxWindowElement, arr[idx + i]);
            max = Math.max(max, maxWindowElement * (i + 1) + helper(arr, idx + i + 1, k, dp));

        }

        dp.put(idx, max);
        return max;
    }
}
