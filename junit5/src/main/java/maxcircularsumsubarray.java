public class maxcircularsumsubarray {

    public static void main(String[] args) {
        System.out.println(new maxcircularsumsubarray().maxSubarraySumCircular(new int[] { -3, -2, -3 }));
    }

    public int maxSubarraySumCircular(int[] nums) {
        int linearSum = maxsumsubarray(nums);
        if (linearSum < 0)
            return linearSum; // to handle all negative scenario

        int[] reverted = new int[nums.length];
        int total = 0;
        for (int i = 0; i < reverted.length; i++) {
            reverted[i] = nums[i] * -1;
            total += nums[i];
        }

        int minimLinearSum = maxsumsubarray(reverted) * -1;

        return Math.max(linearSum, total - minimLinearSum);

    }

    private int maxsumsubarray(int[] nums) {
        int currentSum = 0, maxSum = Integer.MIN_VALUE;
        int i = 0;

        while (i < nums.length) {
            currentSum += nums[i];
            maxSum = Math.max(maxSum, currentSum);
            if (currentSum < 0)
                currentSum = 0;

            i++;
        }

        return maxSum;
    }
}
