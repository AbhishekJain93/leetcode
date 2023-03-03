public class DeleteAndEarn740 {
    public int deleteAndEarn(int[] nums) {
        int[] val = new int[10001];

        for (int i = 0; i < nums.length; i++) {
            val[nums[i]] += nums[i];
        }

        int opt0 = val[0];
        int opt1 = Math.max(val[0], val[1]);

        for (int i = 2; i < val.length; i++) {
            int max = Math.max(val[i] + opt0, opt1);
            opt0 = opt1;
            opt1 = max;
        }

        return Math.max(opt0, opt1);
    }
}
