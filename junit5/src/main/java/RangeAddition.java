import java.util.Arrays;

// def getModifiedArray(self, length, updates):
//         """
//         :type length: int
//         :type updates: List[List[int]]
//         :rtype: List[int]
//         """
//         arr = [0]*length
//         starts = sorted(updates)
//         ends = sorted(updates,key = lambda x: x[1])
//         i = curr_value = si = ei = 0
//         n = len(updates)
//         for i in range(length):
//             while si<n and i == starts[si][0]:
//                 curr_value += starts[si][2]
//                 si+=1
//             arr[i]=curr_value
//             while ei<n and i == ends[ei][1]:
//                 curr_value -= ends[ei][2]
//                 ei+=1
//         return arr

public class RangeAddition {
	public int[] getModifiedArray(int length, int[][] updates) {
		int[] result = new int[length];

		Pair[] starts = new Pair[updates.length];
		Pair[] ends = new Pair[updates.length];

		for (int i = 0; i < updates.length; i++) {
			starts[i] = new Pair(updates[i][0], updates[i][2]);
			ends[i] = new Pair(updates[i][1], updates[i][2]);
		}

		Arrays.sort(starts,
				(Pair a1, Pair a2) -> Integer.compare(a1.x, a2.x));
		Arrays.sort(ends,
				(Pair a1, Pair a2) -> Integer.compare(a1.x, a2.x));

		int adder = 0;

		int startsP = 0, endsP = 0;
		for (int i = 0; i < length; i++) {
			while (startsP < starts.length && i == starts[startsP].x) { // while is needed for multiple intervals
																		// starting at same index
				adder += starts[startsP].y;
				startsP++;
			}

			result[i] = adder;

			while (endsP < ends.length && i == ends[endsP].x) {
				adder -= ends[endsP].y;
				endsP++;
			}
		}

		return result;
	}
}
