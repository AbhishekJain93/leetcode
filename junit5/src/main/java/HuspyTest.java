import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class HuspyTest {
    // Given two integer arrays nums1 and nums2, return an array of their
    // intersection.
    // Each element in the result
    // must be unique and you may return the result in any order.

    public int[] arrayIntersection(int[] arr1, int[] arr2) {
        Set<Integer> arr1Set = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            arr1Set.add(arr1[i]);
        }

        Set<Integer> resultSet = new HashSet<>();

        for (int i = 0; i < arr2.length; i++) {
            if (arr1Set.contains(arr2[i])) {
                resultSet.add(arr2[i]);
            }
        }

        return resultSet.stream().mapToInt(i -> i).toArray();
    }

    public int[] arrayIntersectionWithDuplicates(int[] arr1, int[] arr2) {
        Map<Integer, Integer> freq1 = new HashMap<>();
        Map<Integer, Integer> freq2 = new HashMap<>();

        for (int i = 0; i < arr1.length; i++) {
            freq1.put(arr1[i], freq1.getOrDefault(arr1[i], 0) + 1);
        }

        for (int i = 0; i < arr2.length; i++) {
            freq2.put(arr2[i], freq2.getOrDefault(arr2[i], 0) + 1);
        }

        List<Integer> resultList = new ArrayList<>();
        for (Entry<Integer, Integer> e : freq1.entrySet()) {
            int array2Freq = freq2.getOrDefault(e.getKey(), 0);

            if (array2Freq == 0) {
                continue;
            }

            for (int j = 0; j < Math.min(array2Freq, e.getValue()); j++) {
                resultList.add(e.getKey());
            }

        }

        return resultList.stream().mapToInt(i -> i).toArray();
    }
}
