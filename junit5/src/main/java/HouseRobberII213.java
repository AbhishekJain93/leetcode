import java.util.HashMap;
import java.util.Map;

public class HouseRobberII213 {
    public int rob(int[] nums) {
        Map<String, Integer> dp = new HashMap<>();
        return Math.max(nums[0] + robHelper(nums, 2, nums.length - 2, dp), robHelper(nums, 1, nums.length - 1, dp));
    }

    private int robHelper(int[] nums, int start, int end, Map<String, Integer> dp) {
        String k = start + ":" + end;
        if (dp.containsKey(k))
            return dp.get(k);

        if (start > end)
            return 0;

        if (start == end)
            return nums[end];

        int res = Math.max(nums[start] + robHelper(nums, start + 2, end, dp), robHelper(nums, start + 1, end, dp));
        dp.put(k, res);

        return res;
    }
}
