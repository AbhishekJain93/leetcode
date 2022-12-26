import java.util.Arrays;

public class PutBoxesInWarehouse1564 {
	public int maxBoxesInWarehouse(int[] boxes, int[] warehouse) {
		Arrays.sort(boxes);
		int[] maxTillNow = new int[warehouse.length];

		maxTillNow[0] = warehouse[0];
		for (int i = 1; i < warehouse.length; i++) {
			maxTillNow[i] = Math.min(maxTillNow[i - 1], warehouse[i]);
		}

		int pointer = 0;
		int count = 0;
		for (int i = warehouse.length - 1; i >= 0; i--) {
			if (count == boxes.length)
				return count;
			if (maxTillNow[i] >= boxes[pointer]) {
				count++;
				pointer++;
			}
		}

		return count;
	}
}
