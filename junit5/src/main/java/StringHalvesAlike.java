public class StringHalvesAlike {

	public boolean halvesAreAlike(String s) {
		char[] s1 = s.toCharArray();

		int vowelCount = 0;
		for (int i = 0; i < s1.length / 2; i++) {
			if (s1[i] == 'a' || s1[i] == 'e' || s1[i] == 'i' || s1[i] == 'o' || s1[i] == 'u' || s1[i] == 'A'
					|| s1[i] == 'E' || s1[i] == 'I' || s1[i] == 'O' || s1[i] == 'U') {
				vowelCount++;
			}
		}

		for (int i = s1.length / 2; i < s1.length; i++) {
			if (s1[i] == 'a' || s1[i] == 'e' || s1[i] == 'i' || s1[i] == 'o' || s1[i] == 'u' || s1[i] == 'A'
					|| s1[i] == 'E' || s1[i] == 'I' || s1[i] == 'O' || s1[i] == 'U') {
				vowelCount--;
			}
		}
		return vowelCount == 0;
	}

}
