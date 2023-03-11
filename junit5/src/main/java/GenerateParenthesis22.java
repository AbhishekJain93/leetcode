import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis22 {
    public List<String> generateParenthesis(int n) {
        StringBuilder sb = new StringBuilder();
        List<String> res = new ArrayList<>();

        helper(0, 0, n, sb, res);

        return res;
    }

    private void helper(int open, int close, int n, StringBuilder curr, List<String> res) {
        if (open > n || close > open)
            return;
        if (open == n && close == open) {
            res.add(curr.toString());
            return;
        }

        curr.append('(');
        helper(open + 1, close, n, curr, res);
        curr.deleteCharAt(curr.length() - 1);
        if (close < open) {
            curr.append(')');
            helper(open, close + 1, n, curr, res);
            curr.deleteCharAt(curr.length() - 1);
        }
    }
}
