public class firstbadversion {
    public int firstBadVersion(int n) {

        return helper(1, n);
    }

    public int helper(int start, int end) {
        if (start == end)
            return start;

        int idx = start + (end - start) / 2;

        if (isBadVersion(idx)) {
            return helper(start, idx);
        }

        return helper(idx + 1, end);
    }

    private boolean isBadVersion(int idx) {
        return false;
    }
}
