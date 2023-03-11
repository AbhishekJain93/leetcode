import java.util.Arrays;

public class KConcat1191 {
    public int kConcatenationMaxSum(int[] arr, int k) {
        int mod = 1000000007;
        long total = Arrays.stream(arr).asLongStream().sum();
        long kadane = maxSum(arr);

        if (kadane < 0)
            return 0;

        if (k == 1)
            return (int) (kadane % mod);

        int[] doubleArr = new int[arr.length * 2];
        for (int i = 0; i < arr.length; i++) {
            doubleArr[i] = arr[i];
        }
        for (int i = arr.length; i < doubleArr.length; i++) {
            doubleArr[i] = arr[i - arr.length];
        }

        if (total > 0) {
            // return (int) ((((k - 1) * total) % mod + kadane % mod) % mod);
            // It is not necessary that max total is from max subarry to max subarray of
            // second.
            // example [-1,1,2,3,-8,4] [-1,1,2,3,-8,4]
            // here max subarray is (1,2,3) . So if we just link 2 max subarrays then total
            // would be 7 but answer is 9
            // lets concat 2 arrays and find kadane
            return (int) (((k - 2) * total) % mod + maxSum(doubleArr) % mod) % mod;
        } else {
            return (int) (maxSum(doubleArr) % mod);
        }
    }

    private long maxSum(int[] arr) {
        long max = arr[0];
        long currentSum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (currentSum < 0) {
                currentSum = 0;
            }
            currentSum += arr[i];

            max = Math.max(max, currentSum);
        }

        return max;
    }
}
