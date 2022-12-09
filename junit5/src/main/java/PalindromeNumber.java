public class PalindromeNumber {
	public boolean isPalindrome(int x) {
		char[] x1 = Integer.toString(x).toCharArray();

		for (int i = 0; i < x1.length / 2; i++) {
			if (x1[i] != x1[x1.length - 1 - i])
				return false;
		}
		return true;
	}
}
