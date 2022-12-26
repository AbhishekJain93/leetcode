import java.util.Arrays;

public class Candy {
	public int candy(int[] ratings) {
		int[] candy = new int[ratings.length];

		for (int i = 0; i < candy.length - 1; i++) {
			if (ratings[i] < ratings[i + 1]) {
				candy[i + 1] = candy[i] + 1;
			}
		}

		for (int i = ratings.length - 1; i > 0; i--) {
			if (ratings[i - 1] > ratings[i] && candy[i - 1] <= candy[i]) {
				candy[i - 1] = candy[i] + 1;
			}
		}

		return Arrays.stream(candy).sum() + ratings.length;
	}
}
