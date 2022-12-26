public class ValidPalindromeII {

	public boolean validPalindrome(String s) {
		char[] s1 = s.toCharArray();

		return palindromeHelper(s1, 0, s1.length - 1, 0);
	}

	private boolean palindromeHelper(char[] s1, int start, int end, int corrections) {
		while (start < end) {
			if (s1[start] == s1[end]) {
				start++;
				end--;
				continue;
			} else if (corrections >= 1) {
				return false;
			} else {
				return palindromeHelper(s1, start + 1, end, corrections + 1)
						|| palindromeHelper(s1, start, end - 1, corrections + 1);
			}

		}

		return true;
	}
}
