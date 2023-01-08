public class ArmstrongNumber1134 {
	public boolean isArmstrong(int n) {
		int sum = 0;

		// can also count digits like: int k = (int)Math.log10(N) + 1

		String str = "" + n;
		int k = str.length();

		for (int i = 0; i < str.length(); i++) {
			sum += pow(Character.getNumericValue(str.charAt(i)), k);
			if (sum > n)
				return false;
		}

		return sum == n;
	}

	public int pow(int x, int n) {
		if (n == 0 || x == 1)
			return 1;

		return (n % 2 == 0 ? 1 : x) * pow(x * x, n / 2);

	}
}
