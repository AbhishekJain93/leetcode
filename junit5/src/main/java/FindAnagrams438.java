import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAnagrams438 {
    public List<Integer> findAnagrams(String s, String p) {
        char[] s1 = s.toCharArray();
        char[] p1 = p.toCharArray();

        Map<Integer, Integer> pMap = new HashMap<>();
        Map<Integer, Integer> currMap = new HashMap<>();

        for (int i = 0; i < p1.length; i++) {
            pMap.put(p1[i] - 'a', pMap.getOrDefault(p1[i] - 'a', 0) + 1);
        }

        List<Integer> idx = new ArrayList<>();
        int i = 0, j = 0;

        while (j < s1.length) {
            int val = s1[j] - 'a';

            if (!pMap.containsKey(val)) {
                i = j + 1;
                j = j + 1;
                currMap = new HashMap<>();
                continue;
            } else {

                if (pMap.get(val) > currMap.getOrDefault(val, 0) + 1) {
                    currMap.put(val, currMap.getOrDefault(val, 0) + 1);
                    j++;
                    continue;
                } else if (pMap.get(val) < currMap.getOrDefault(val, 0) + 1) {
                    int iVal = s1[i] - 'a';
                    currMap.put(iVal, currMap.get(iVal) - 1);
                    i = i + 1;
                    continue;
                } else {
                    currMap.put(val, currMap.getOrDefault(val, 0) + 1);
                    if (!pMap.equals(currMap)) {
                        j++;
                        continue;
                    } else {
                        idx.add(i);
                        int iVal = s1[i] - 'a';
                        currMap.put(iVal, currMap.get(iVal) - 1);
                        i = i + 1;
                        j = j + 1;
                        continue;
                    }
                }
            }
        }

        return idx;
    }
}
