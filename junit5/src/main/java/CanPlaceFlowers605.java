public class CanPlaceFlowers605 {
	public boolean canPlaceFlowers(int[] flowerbed, int n) {
		for (int i = 0; i < flowerbed.length; i++) {
			if (flowerbed[i] == 1)
				continue;

			if ((i > 0 && flowerbed[i - 1] == 1) || (i < flowerbed.length - 1 && flowerbed[i + 1] == 1))
				continue;

			n--;

			if (n == 0)
				return true;
			i++; // after we found the spot, we can skip 2 places (one in for loop already)
		}

		return n <= 0;
	}
}
