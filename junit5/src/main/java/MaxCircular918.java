public class MaxCircular918 {
    // better solution at: maxcircularsumsubarray.java
    // https://github.com/AbhishekJain93/leetcode/blob/8f99485a88aae7b654c471fd13a398bfab8c279e/junit5/src/main/java/maxcircularsumsubarray.java#L6
    public int maxSubarraySumCircular(int[] nums) {
        int linearSum = maxSubarraySum(nums);
        if (linearSum < 0)
            return linearSum;

        int prefixMax[] = new int[nums.length];
        prefixMax[0] = nums[0];
        int current = nums[0];
        for (int i = 1; i < prefixMax.length; i++) {
            current += nums[i];
            prefixMax[i] = Math.max(prefixMax[i - 1], current);
        }

        int suffixMax[] = new int[nums.length];
        suffixMax[nums.length - 1] = nums[nums.length - 1];
        current = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; i--) {
            current += nums[i];
            suffixMax[i] = Math.max(suffixMax[i + 1], current);
        }

        int circularMax = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length - 1; i++) {
            circularMax = Math.max(circularMax, prefixMax[i] + suffixMax[i + 1]);
        }

        return Math.max(linearSum, circularMax);
    }

    private int maxSubarraySum(int[] arr) {
        int curr = 0, max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            curr += arr[i];
            max = Math.max(max, curr);
            if (curr < 0)
                curr = 0;
        }

        return max;
    }
}
