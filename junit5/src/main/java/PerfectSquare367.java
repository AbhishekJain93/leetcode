public class PerfectSquare367 {
    public boolean isPerfectSquare(int n) {
        if (n == 1 || n == 4)
            return true;

        int lo = 2, hi = n / 2;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            long sq = (long) mid * mid;
            if (sq == n)
                return true;

            if (sq < n) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }

        return false;
    }
}
