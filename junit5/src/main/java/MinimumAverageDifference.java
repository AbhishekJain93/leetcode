public class MinimumAverageDifference {
	public int minimumAverageDifference(int[] nums) {
		long sumTotal = 0;
		for (int i = 0; i < nums.length; i++) {
			sumTotal += nums[i];
		}

		long minDiff = Long.MAX_VALUE;
		int idx = -1;
		long forwardSum = 0;
		for (int i = 0; i < nums.length; i++) {
			forwardSum += nums[i];
			long forwardAvg = forwardSum / (i + 1);
			long backwardAvg = i == nums.length - 1 ? 0 : (sumTotal - forwardSum) / (nums.length - i - 1);

			long currentDiff = Math.abs(forwardAvg - backwardAvg);
			if (currentDiff < minDiff) {
				if (currentDiff == 0) // optimization as absolute difference can not be smaller that 0
					return i;

				idx = i;
				minDiff = currentDiff;
			}
		}

		return idx;
	}
}
