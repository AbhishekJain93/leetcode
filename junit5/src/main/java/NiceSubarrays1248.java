public class NiceSubarrays1248 {
    public int numberOfSubarrays(int[] nums, int k) {
        int i = 0, j = -1, curr = 0, total = 0;
        boolean flag = false;
        int multiplier = 1;

        while (j < nums.length) {
            if (curr <= k) {
                j++;
                if (j < nums.length && nums[j] % 2 == 1)
                    curr++;

            } else if (curr > k) {
                flag = false;
                multiplier = 1;
                if (nums[i] % 2 == 1)
                    curr--;
                i++;
            }

            if (k == curr) {
                if (!flag) {
                    int t = i;
                    while (nums[t++] % 2 == 0)
                        multiplier++;
                    flag = true;
                }
                if (j < nums.length)
                    total += multiplier;
            }

        }

        return total;
    }
}
