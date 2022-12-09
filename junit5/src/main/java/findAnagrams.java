import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class findAnagrams {

    public static void main(String[] args) {
        System.out.println(new findAnagrams().findanagrams("cbaebabacd", "abc").toString());
    }

    public List<Integer> findanagrams(String s, String p) {
        char[] p1 = p.toCharArray();
        char[] s1 = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char c : p1) {
            if (map.containsKey(c))
                map.put(c, map.get(c) + 1);
            else
                map.put(c, 1);
        }

        Map<Character, Integer> currentMap = getNewInitialisedMap(p1);
        List<Integer> idx = new ArrayList<>();
        int i = 0, j = 0;
        int sLen = s.length();
        while (i < sLen && j < sLen) {
            char curr = s1[j];
            if (!map.containsKey(curr)) {
                i = j + 1;
                j = j + 1;
                currentMap = getNewInitialisedMap(p1);
                continue;
            }

            if (currentMap.get(curr) + 1 > map.get(curr)) {
                currentMap.put(s1[i], currentMap.get(s1[i]) - 1);
                i = i + 1;
                continue;
            }

            if (currentMap.get(curr) + 1 < map.get(curr)) {
                currentMap.put(curr, currentMap.get(curr) + 1);
                j = j + 1;
                continue;
            }

            if (currentMap.get(curr) + 1 == map.get(curr)) {
                currentMap.put(curr, currentMap.get(curr) + 1);

                if (currentMap.equals(map)) {
                    idx.add(i);
                    currentMap.put(s1[i], currentMap.get(s1[i]) - 1);
                    i = i + 1;
                    j = j + 1;
                    continue;
                }

                j = j + 1;
                continue;
            }
        }

        return idx;
    }

    private Map<Character, Integer> getNewInitialisedMap(char[] p1) {
        Map<Character, Integer> newMap = new HashMap<>();
        for (char c : p1) {
            newMap.put(c, 0);
        }

        return newMap;
    }
}
