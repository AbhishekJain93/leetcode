public class ShuffleArray1470 {
    public int[] shuffle(int[] nums, int n) {
        int[] res = new int[nums.length];
        int s = 0, q = nums.length / 2, j = 0;

        while (j < nums.length) {
            res[j] = nums[s];
            res[j + 1] = nums[q];
            s++;
            q++;
            j += 2;
        }

        return res;
    }
}
