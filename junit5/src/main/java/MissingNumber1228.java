
public class MissingNumber1228 {
	public int missingNumber(int[] arr) {
		int missingPos = 1;
		int maxDiff = Math.abs(arr[1] - arr[0]);

		for (int i = 2; i < arr.length; i++) {
			if (Math.abs(arr[i] - arr[i - 1]) > maxDiff) {
				missingPos = i;
			}
		}

		return arr[missingPos - 1] + (arr[missingPos] - arr[missingPos - 1]) / 2;
	}
}
