import java.util.HashMap;
import java.util.Map;

public class RomanToInt {

	public int romanToInt(String s) {
		// I 1
		// V 5
		// X 10
		// L 50
		// C 100
		// D 500
		// M 1000
		Map<Character, Integer> map = new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);

		int sum = 0;

		char[] s1 = s.toCharArray();

		int i = 0;
		while (i < s1.length) {
			char c = s1[i];

			if (i < s1.length - 1) {
				if (c == 'I' && s1[i + 1] == 'V') {
					sum += 4;
					i += 2;
				} else if (c == 'I' && s1[i + 1] == 'X') {
					sum += 9;
					i += 2;
				} else if (c == 'X' && s1[i + 1] == 'L') {
					sum += 40;
					i += 2;
				} else if (c == 'X' && s1[i + 1] == 'C') {
					sum += 90;
					i += 2;
				} else if (c == 'C' && s1[i + 1] == 'D') {
					sum += 400;
					i += 2;
				} else if (c == 'C' && s1[i + 1] == 'M') {
					sum += 900;
					i += 2;
				} else {
					sum += map.get(c);
					i += 1;
				}
			} else {
				sum += map.get(c);
				i += 1;
			}
		}

		return sum;
	}

}
