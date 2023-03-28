import java.util.HashMap;
import java.util.Map;

public class DeleteAndEarn740 {
    // public int deleteAndEarn(int[] nums) {
    // int[] val = new int[10001];

    // for (int i = 0; i < nums.length; i++) {
    // val[nums[i]] += nums[i];
    // }

    // int opt0 = val[0];
    // int opt1 = Math.max(val[0], val[1]);

    // for (int i = 2; i < val.length; i++) {
    // int max = Math.max(val[i] + opt0, opt1);
    // opt0 = opt1;
    // opt1 = max;
    // }

    // return Math.max(opt0, opt1);
    // }

    public int deleteAndEarn(int[] nums) {
        int[] values = new int[10000 + 1];

        for (int i = 0; i < nums.length; i++) {
            values[nums[i]] += nums[i];
        }

        Map<Integer, Integer> dp = new HashMap<>();

        return dpHelper(values, 0, dp);
    }

    private int dpHelper(int[] values, int i, Map<Integer, Integer> dp) {
        if (dp.containsKey(i))
            return dp.get(i);

        if (i >= values.length)
            return 0;

        int result = Math.max(values[i] + dpHelper(values, i + 2, dp), dpHelper(values, i + 1, dp));
        dp.put(i, result);
        return result;
    }
}
