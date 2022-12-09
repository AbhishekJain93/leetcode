public class maximumSubarray {
    public int maxSubArray(int[] nums) {
        int i = 0;
        int currentSum = 0, maxSum = Integer.MIN_VALUE;

        while (i < nums.length) {
            currentSum += nums[i];
            maxSum = Math.max(maxSum, currentSum);

            if (currentSum <= 0)
                currentSum = 0;

            i++;
        }

        return maxSum;
    }
}
