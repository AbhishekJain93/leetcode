public class searchposition {

    public int searchInsert(int[] nums, int target) {
        if (nums[0] > target)
            return 0;
        if (nums[nums.length - 1] < target)
            return nums.length - 1;

        return seachInsertHelper(nums, target, 0, nums.length - 1);
    }

    private int seachInsertHelper(int[] nums, int target, int start, int end) {
        if (start == end && nums[start] < target)
            return start + 1;

        if (start == end)
            return start;

        int idx = start + (end - start) / 2;

        if (nums[idx] == target)
            return idx;

        if (nums[idx] < target)
            return seachInsertHelper(nums, target, idx + 1, end);

        return seachInsertHelper(nums, target, start, idx);
    }
}
