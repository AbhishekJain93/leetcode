import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution { // this one is better solution than below one
    private List<List<String>> ans = new ArrayList<>();

    public List<List<String>> partition(String s) {
        help(s, 0, new ArrayList<>());
        return ans;
    }

    private void help(String s, int idx, List<String> currParts) {
        if (idx == s.length()) {
            ans.add(new ArrayList<>(currParts));
            return;
        }
        for (int i = idx; i < s.length(); i++) {
            if (isPalindrome(s, idx, i)) {
                currParts.add(s.substring(idx, i + 1));
                help(s, i + 1, currParts);
                currParts.remove(currParts.size() - 1);
            }
        }
    }

    private boolean isPalindrome(String s, int l, int r) {
        while (l < r) {
            if (s.charAt(l++) != s.charAt(r--)) {
                return false;
            }
        }

        return true;
    }
}

public class PalindromePartitioning131 {

    public List<List<String>> partition(String s) {
        char[] ch = s.toCharArray();
        Map<String, List<List<String>>> dp = new HashMap<>();

        List<List<String>> reversed = helper(ch, 0, ch.length - 1, dp);
        for (List<String> rev : reversed) {
            Collections.reverse(rev);
        }

        return reversed;
    }

    private List<List<String>> helper(char[] ch, int low, int high, Map<String, List<List<String>>> dp) {
        List<List<String>> res = new ArrayList<>();

        if (low > high) {
            ArrayList<String> l = new ArrayList<>();
            res.add(l);
            return res;
        }

        if (low == high) {
            ArrayList<String> l = new ArrayList<>();
            l.add(ch[low] + "");
            res.add(l);
            return res;
        }

        String key = "" + low + ":" + "" + high;
        if (dp.containsKey(key))
            return dp.get(key);

        for (int i = low; i <= high; i++) {
            if (!isPalindrome(ch, low, i))
                continue;

            List<List<String>> suffixLists = helper(ch, i + 1, high, dp);
            suffixLists = arrayListCopy(suffixLists);
            for (List<String> l : suffixLists) {

                l.add(String.valueOf(Arrays.copyOfRange(ch, low, i + 1)));
            }

            res.addAll(suffixLists);
        }

        dp.put(key, res);
        return res;
    }

    private boolean isPalindrome(char[] ch, int low, int high) {
        int i = low, j = high;

        while (i < j) {
            if (ch[i++] != ch[j--])
                return false;
        }
        return true;
    }

    private List<List<String>> arrayListCopy(List<List<String>> original) {
        List<List<String>> copy = new ArrayList<>();

        for (List<String> l : original) {
            copy.add(listCopy(l));
        }

        return copy;

    }

    private List<String> listCopy(List<String> original) {
        List<String> copy = new ArrayList<>();

        for (String l : original) {
            copy.add(l);
        }

        return copy;

    }
}