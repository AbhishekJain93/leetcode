public class pivotindex {

    public static void main(String[] args) {
        System.out.println(new pivotindex().pivotIndex(new int[] { 2, 1, -1 }));
    }

    public int pivotIndex(int[] nums) {
        if (nums.length == 1)
            return 0;
        int[] forwardSum = new int[nums.length];
        int[] backwardSum = new int[nums.length];
        forwardSum[0] = nums[0];
        backwardSum[nums.length - 1] = nums[nums.length - 1];

        for (int i = 1; i < nums.length; i++) {
            forwardSum[i] = forwardSum[i - 1] + nums[i];
            backwardSum[nums.length - 1 - i] = backwardSum[nums.length - i] + nums[nums.length - i - 1];
        }

        for (int i = 0; i < nums.length; i++) {
            if (i == 0 && backwardSum[1] == 0)
                return 0;
            if (i == 0)
                continue;
            if (i == nums.length - 1 && forwardSum[nums.length - 2] == 0)
                return nums.length - 1;
            if (i == nums.length - 1)
                continue;
            if (forwardSum[i - 1] == backwardSum[i + 1])
                return i;

        }

        return -1;
    }
}
