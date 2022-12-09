import java.util.HashMap;
import java.util.Map.Entry;

public class longestPalindrome {
    public static void main(String[] args) {
        System.out.println(new longestPalindrome().longestPalindromed(""));
    }

    public int longestPalindromed(String s) {
        char[] s1 = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s1) {
            if (!map.containsKey(c)) {
                map.put(c, 0);
            }

            map.put(c, map.get(c) + 1);
        }

        int maxLen = 0;
        boolean isOdd = false;
        for (Entry<Character, Integer> e : map.entrySet()) {
            maxLen += (e.getValue() / 2) * 2;
            isOdd = isOdd || e.getValue() % 2 == 1;
        }

        return isOdd ? maxLen + 1 : maxLen;
    }
}
