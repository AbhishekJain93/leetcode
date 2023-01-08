public class FixedPoint1064 {
	public int fixedPoint(int[] arr) {
		return fixedPointHelper(arr, 0, arr.length - 1);
	}

	int fixedPointHelper(int[] arr, int start, int end) {
		if (start < 0 || end > arr.length - 1 || start > end)
			return -1;

		if (start == end)
			return arr[start] == start ? start : -1;

		int mid = start + (end - start) / 2;
		if (arr[mid] == mid)
			return fixedPointHelper(arr, start, arr[mid]);

		else if (arr[mid] > mid) {
			int leftPoint = fixedPointHelper(arr, start, mid - 1);
			if (leftPoint != -1)
				return leftPoint;

			return fixedPointHelper(arr, arr[mid], end);
		} else {
			int rightPoint = fixedPointHelper(arr, mid + 1, end);
			if (rightPoint != -1)
				return rightPoint;

			return fixedPointHelper(arr, start, arr[mid]);
		}
	}
}
