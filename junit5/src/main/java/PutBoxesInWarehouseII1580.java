import java.util.Arrays;

public class PutBoxesInWarehouseII1580 {

	// this approach won't work as it may happen that if a box doesnt't fint both
	// ends, and we left-- and right++, we find left is now large enough, and we fit
	// box there=> well it may happen that if we had right++ more we might have
	// gotten right < left but greater than box.

	// public int maxBoxesInWarehouse(int[] boxes, int[] warehouse) {
	// Arrays.sort(boxes);
	// int[] maxTillNowLeft = new int[warehouse.length];
	// int[] maxTillNowRight = new int[warehouse.length];

	// maxTillNowLeft[0] = warehouse[0];
	// for (int i = 1; i < warehouse.length; i++) {
	// maxTillNowLeft[i] = Math.min(maxTillNowLeft[i - 1], warehouse[i]);
	// }

	// maxTillNowRight[warehouse.length - 1] = warehouse[warehouse.length - 1];
	// for (int i = warehouse.length - 2; i >= 0; i--) {
	// maxTillNowRight[i] = Math.min(maxTillNowRight[i + 1], warehouse[i]);
	// }

	// int smallest = 0;
	// for (int i = 0; i < warehouse.length; i++) {
	// if (warehouse[i] < warehouse[smallest]) {
	// smallest = i;
	// }
	// }

	// int left = smallest, right = smallest + 1, ptr = 0, count = 0;

	// while (ptr < boxes.length && (left >= 0 || right < warehouse.length)) {
	// if (left < 0 && right >= warehouse.length)
	// break;

	// else if (left < 0) {
	// if (boxes[ptr] > maxTillNowRight[right]) {
	// right++;
	// continue;
	// } else {
	// count++;
	// ptr++;
	// right++;

	// }
	// } else if (right >= warehouse.length) {
	// if (boxes[ptr] > maxTillNowLeft[left]) {
	// left--;
	// continue;
	// } else {
	// count++;
	// ptr++;
	// left--;
	// }
	// } else {
	// if (boxes[ptr] > maxTillNowLeft[left] && boxes[ptr] > maxTillNowRight[right])
	// {
	// left--;
	// right++;
	// continue;
	// } else if (boxes[ptr] > maxTillNowLeft[left]) {
	// count++;
	// ptr++;
	// left--;
	// right++;
	// } else if (boxes[ptr] > maxTillNowRight[right]) {
	// count++;
	// ptr++;
	// left--;
	// right++;
	// } else {
	// count++;
	// ptr++;
	// if (maxTillNowLeft[left] < maxTillNowRight[right])
	// left--;
	// else
	// right++;
	// }
	// }
	// }

	// return count;
	// }

	// simple approach. start from biggest box, see if it could fit either end, then
	// move to smaller box.
	// we know that moving in from both sides will only fit smaller and smaller
	// boxes.

	public int maxBoxesInWarehouse(int[] boxes, int[] warehouse) {
		Arrays.sort(boxes);
		int ptr = boxes.length - 1;

		int l = 0, r = warehouse.length - 1, count = 0;

		while (ptr >= 0 && l <= r) {
			if (warehouse[l] < boxes[ptr] && warehouse[r] < boxes[ptr]) {
				ptr--;
			} else if (warehouse[l] < boxes[ptr]) {
				ptr--;
				count++;
				r--;
			} else if (warehouse[r] < boxes[ptr]) {
				ptr--;
				count++;
				l++;
			} else {
				if (warehouse[r] < warehouse[l]) {
					l++; // can be r--
					count++;
					ptr--;
				} else {
					r--; // this can be l++ doesn't matter
					count++;
					ptr--;
				}
			}
		}

		return count;
	}
}
