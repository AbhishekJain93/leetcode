public class twosumII {
    // array is sorted
    public int[] twoSum(int[] numbers, int target) {
        int l = 0, r = numbers.length - 1;
        while (l < r) {
            if (numbers[l] + numbers[r] == target)
                return new int[] { l + 1, r + 1 };

            if (numbers[l] + numbers[r] < target)
                l += 1;

            if (numbers[l] + numbers[r] > target)
                r -= 1;
        }

        return new int[] {};
    }
}
