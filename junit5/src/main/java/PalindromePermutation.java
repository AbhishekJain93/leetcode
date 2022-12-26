public class PalindromePermutation {
	public boolean canPermutePalindrome(String s) {
		char[] s1 = s.toCharArray();
		int[] freq = new int[26];

		for (int i = 0; i < s1.length; i++) {
			freq[s1[i] - 'a']++;
		}

		int oddCount = 0;
		for (int i = 0; i < freq.length; i++) {
			if (freq[i] % 2 == 1 && oddCount > 0) {
				return false;
			} else if (freq[i] % 2 == 1) {
				oddCount++;
			}
		}

		return true;
	}
}
