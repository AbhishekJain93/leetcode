public class SortColors75 {
    public void sortColors(int[] nums) { // 2, 0, 2, 1, 1, 0
        // 0 -> low -1 are 0s
        // low -> mid -1 are 1s
        // high+1 -> n -1 are 2s

        int low = 0, mid = 0, high = nums.length - 1;

        while (mid <= high) { // equality case is needed to handle if mid == high == 0
            if (nums[mid] == 1) {
                mid++;
            } else if (nums[mid] == 2) {
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            } else {
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            }
        }
    }
}
