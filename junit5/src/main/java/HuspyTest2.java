public class HuspyTest2 {

    // Given an integer array nums sorted in increasing order, return an array of
    // the squares of each number
    // sorted in increasing order.
    // [-3, -1, 1, 2] -> [1, 1, 4, 9]

    public int[] arraySquared(int[] input) {
        int lo = 0, hi = input.length - 1, curr = input.length - 1;
        int[] res = new int[input.length];

        while (lo <= hi) {
            if (Math.abs(input[lo]) < Math.abs(input[hi])) {
                res[curr] = input[hi] * input[hi];
                hi--;
            } else {
                res[curr] = input[lo] * input[lo];
                lo++;
            }
            curr--;
        }

        return res;
    }
}
