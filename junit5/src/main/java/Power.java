public class Power {
	public double myPow(double x, int n) {
		if (n == 0 || x == 1)
			return 1;

		if (n == Integer.MIN_VALUE) {
			return 1 / x * myPow(x, n + 1);
		}
		if (n < 1)
			return myPow(1 / x, -1 * n);

		return (n % 2 == 0 ? 1 : x) * myPow(x * x, n / 2);
	}
}
