import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
	public boolean isHappy(int n) {
		Set<Integer> set = new HashSet<>();
		int current = n;
		while (true) {
			if (current == 1)
				return true;

			if (set.contains(current))
				return false;

			set.add(current);

			char[] current1 = ("" + current).toCharArray();
			current = 0;
			for (int i = 0; i < current1.length; i++) {
				int digit = current1[i] - '0';
				current += digit * digit;
			}
		}
	}
}
