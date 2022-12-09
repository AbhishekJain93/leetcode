public class GasStation {
	public int canCompleteCircuit(int[] gas, int[] cost) {
		int[] delta = new int[gas.length];

		int totalGas = 0;
		int totalCost = 0;
		for (int i = 0; i < delta.length; i++) {
			delta[i] = gas[i] - cost[i];
			totalGas += gas[i];
			totalCost += cost[i];
		}

		if (totalCost > totalGas)
			return -1;

		int i = 0;
		int currentSum = 0;
		int start = 0;
		while (i < delta.length) {
			currentSum += delta[i];

			if (currentSum < 0) {
				i = i + 1;
				start = i;
				currentSum = 0;
				continue;
			}
			i = i + 1;
		}

		return start;
	}
}
