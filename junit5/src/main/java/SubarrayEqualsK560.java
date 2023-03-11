import java.util.HashMap;
import java.util.Map;

public class SubarrayEqualsK560 {
    public int subarraySum(int[] nums, int k) {
        int[] prefix = new int[nums.length];

        prefix[0] = nums[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }

        Map<Integer, Integer> map = new HashMap<>();
        int total = 0;

        for (int i = 0; i < prefix.length; i++) {
            if (prefix[i] == k)
                total++;

            total += map.getOrDefault(prefix[i] - k, 0);

            map.put(prefix[i], map.getOrDefault(prefix[i], 0) + 1);

        }

        return total;
    }
}
