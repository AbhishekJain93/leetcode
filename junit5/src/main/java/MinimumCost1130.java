import java.util.HashMap;
import java.util.Map;

public class MinimumCost1130 {
    public int mctFromLeafValues(int[] arr) {
        Map<String, Integer> dp = new HashMap<>();

        int[] highestAfter = new int[arr.length];
        int[] highestBefore = new int[arr.length];
        highestAfter[arr.length - 1] = arr[arr.length - 1];
        highestBefore[0] = arr[0];
        for (int i = arr.length - 2; i >= 0; i--) {
            highestAfter[i] = Math.max(arr[i], highestAfter[i + 1]);
        }
        for (int i = 1; i < arr.length; i++) {
            highestBefore[i] = Math.max(arr[i], highestBefore[i - 1]);
        }

        return mctHelper(arr, 0, arr.length - 1, highestAfter, highestBefore, dp);
    }

    private int mctHelper(int[] arr, int lo, int hi, int[] highestAfter, int[] highestBefore, Map<String, Integer> dp) {
        String key = "" + lo + ":" + hi;
        if (dp.containsKey(key))
            return dp.get(key);

        if (lo >= hi)
            return 0;

        int res = Integer.MAX_VALUE;
        for (int i = lo; i < hi; i++) {

            int leftTreeSum = mctHelper(arr, lo, i, highestAfter, highestBefore, dp);
            int rightTreeSum = mctHelper(arr, i + 1, hi, highestAfter, highestBefore, dp);

            int leftMax = 0, rightMax = 0;
            for (int j = lo; j <= i; j++) {
                leftMax = Math.max(leftMax, arr[j]);
            }
            for (int j = i + 1; j <= hi; j++) {
                rightMax = Math.max(rightMax, arr[j]);
            }
            int internalNode = leftMax * rightMax;

            res = Math.min(res, leftTreeSum + rightTreeSum + internalNode);

        }

        dp.put(key, res);
        return res;
    }
}
