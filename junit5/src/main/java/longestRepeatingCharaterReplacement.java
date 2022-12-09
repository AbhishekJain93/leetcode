import java.util.HashMap;
import java.util.Map;

public class longestRepeatingCharaterReplacement {

    public static void main(String[] args) {
        System.out.println(new longestRepeatingCharaterReplacement().characterReplacement("AABABBA", 1));
    }

    public int characterReplacement(String s, int k) {
        char[] s1 = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        int l = 0, r = 0, mostFrequent = 0, maxLen = 0;
        while (r < s1.length) {
            mostFrequent = Math.max(mostFrequent(map), map.getOrDefault(s1[r], 0) + 1);

            if (r - l - mostFrequent + 1 > k) {
                map.put(s1[l], map.get(s1[l]) - 1);
                l += 1;
                continue;
            }
            map.put(s1[r], map.getOrDefault(s1[r], 0) + 1);
            maxLen = Math.max(maxLen, r - l + 1);
            r += 1;
        }

        return maxLen;
    }

    private int mostFrequent(Map<Character, Integer> map) {
        return map.entrySet().stream()
                .max(Map.Entry.comparingByValue()).orElseGet(() -> Map.entry('1', 0)).getValue();
    }
}
