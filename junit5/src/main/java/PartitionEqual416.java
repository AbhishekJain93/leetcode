import java.util.HashMap;
import java.util.Map;

public class PartitionEqual416 {
    public boolean canPartition(int[] nums) {
        int halfSum = 0;

        for (int i = 0; i < nums.length; i++) {
            halfSum += nums[i];
        }

        if (halfSum % 2 == 1)
            return false;

        halfSum /= 2;

        Map<String, Boolean> dp = new HashMap<>();
        return partitionHelper(nums, 0, halfSum, dp);
    }

    private boolean partitionHelper(int[] nums, int i, int target, Map<String, Boolean> dp) {
        if (target == 0)
            return true;

        if (target < 0 || i >= nums.length)
            return false;

        String k = i + ":" + target;

        if (dp.containsKey(k))
            return dp.get(k);

        boolean res = partitionHelper(nums, i + 1, target - nums[i], dp) || partitionHelper(nums, i + 1, target, dp);
        dp.put(k, res);
        return res;
    }
}
