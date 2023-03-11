import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PartitionArray2161 {
    // public int[] pivotArray(int[] nums, int pivot) { // using SortColors75 dutch
    // flag algo but this is not stable sort
    // // as big numbers at start end up after the big numbers that come
    // // later
    // int low = 0, mid = 0, high = nums.length - 1;

    // while (mid <= high) {
    // if (nums[mid] == pivot) {
    // mid++;
    // } else if (nums[mid] > pivot) {
    // int temp = nums[mid];
    // nums[mid] = nums[high];
    // nums[high] = temp;
    // high--;
    // } else {
    // int temp = nums[low];
    // nums[low] = nums[mid];
    // nums[mid] = temp;
    // low++;
    // mid++;
    // }
    // }

    // return nums;
    // }
    // }

    public int[] pivotArray(int[] nums, int pivot) {
        Queue<Integer> low = new LinkedList<>();
        Queue<Integer> mid = new LinkedList<>();
        Queue<Integer> high = new LinkedList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < pivot) {
                low.offer(nums[i]);
            } else if (nums[i] == pivot) {
                mid.offer(nums[i]);
            } else {
                high.offer(nums[i]);
            }
        }

        int[] res = new int[nums.length];
        int i = 0;
        while (!low.isEmpty()) {
            res[i++] = low.poll();
        }
        while (!mid.isEmpty()) {
            res[i++] = mid.poll();
        }
        while (!high.isEmpty()) {
            res[i++] = high.poll();
        }

        return res;
    }
}