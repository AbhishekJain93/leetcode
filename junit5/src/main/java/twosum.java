import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class twosum {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new twosum().twoSum(new int[] { 3, 2, 4 }, 6)));
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i]) && i != map.get(target - nums[i]))
                return new int[] { i, map.get(target - nums[i]) };

        }
        return new int[] {};
    }
}
