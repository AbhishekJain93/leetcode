public class binarySearch {

    public static void main(String[] args) {
        System.out.println(new binarySearch().search(new int[] { 1, 2, 3, 4, 5, 6, 7, 8 }, 2));
    }

    public int search(int[] nums, int target) {
        if (nums == null)
            return -1;
        if (nums.length == 1)
            return nums[0] == target ? 0 : -1;

        return searchHelper(nums, target, 0, nums.length - 1);
    }

    public int searchHelper(int[] nums, int target, int start, int end) {
        if (start > end)
            return -1;

        int idx = (end + start) / 2;
        if (nums[idx] == target)
            return idx;

        if (nums[idx] > target)
            return searchHelper(nums, target, start, idx - 1);

        return searchHelper(nums, target, idx + 1, end);
    }
}
