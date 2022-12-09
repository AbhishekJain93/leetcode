import java.util.HashMap;
import java.util.Map;

public class IntToRoman {
	public String intToRoman(int num) {

		// I 1
		// V 5
		// X 10
		// L 50
		// C 100
		// D 500
		// M 1000
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "I");
		map.put(4, "IV");
		map.put(5, "V");
		map.put(9, "IX");
		map.put(10, "X");
		map.put(40, "XL");
		map.put(50, "L");
		map.put(90, "XC");
		map.put(100, "C");
		map.put(400, "CD");
		map.put(500, "D");
		map.put(900, "CM");
		map.put(1000, "M");

		StringBuilder sb = new StringBuilder();
		while (num > 0) {

			if (num >= 1000) {
				int x = num / 1000;
				for (int i = 0; i < x; i++) {
					sb.append(map.get(1000));
				}
				num = num % 1000;

			} else if (num >= 900) {
				sb.append(map.get(900));
				num -= 900;
			} else if (num >= 500) {
				sb.append(map.get(500));
				num -= 500;
			} else if (num >= 400) {
				sb.append(map.get(400));
				num -= 400;
			} else if (num >= 100) {
				int x = num / 100;
				for (int i = 0; i < x; i++) {
					sb.append(map.get(100));
				}
				num = num % 100;
			} else if (num >= 90) {
				sb.append(map.get(90));
				num -= 90;
			} else if (num >= 50) {
				sb.append(map.get(50));
				num -= 50;
			} else if (num >= 40) {
				sb.append(map.get(40));
				num -= 40;
			} else if (num >= 10) {
				int x = num / 10;
				for (int i = 0; i < x; i++) {
					sb.append(map.get(10));
				}
				num = num % 10;
			} else if (num == 9) {
				sb.append(map.get(9));
				num -= 9;
			} else if (num >= 5) {
				sb.append(map.get(5));
				num -= 5;
			} else if (num == 4) {
				sb.append(map.get(4));
				num -= 4;
			} else if (num >= 1) {
				while (num > 0) {
					sb.append(map.get(1));
					num--;
				}
			}
		}

		return sb.toString();
	}
}
