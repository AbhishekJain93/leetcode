import java.util.Stack;

public class ValidParenthesis678 {
    public boolean checkValidString(String s) {
        char[] str = s.toCharArray();
        Stack<Integer> open = new Stack<>(), star = new Stack<>();

        for (int i = 0; i < str.length; i++) {
            if (str[i] == '(') {
                open.push(i);
            } else if (str[i] == '*') {
                star.push(i);
            } else {
                if (open.isEmpty() && star.isEmpty())
                    return false;

                if (!open.isEmpty())
                    open.pop();
                else
                    star.pop();
            }
        }

        if (star.size() < open.size())
            return false;

        while (!open.isEmpty()) {
            int openIdx = open.pop();
            int starIdx = star.pop();

            if (starIdx < openIdx)
                return false;

        }

        return true;
    }

    public boolean checkValidString2(String s) { // This is wrong as this would pass "**((" incorrectly. We need stacks
                                                 // to keep track of indexes so that * comes after the ( to match
        char[] str = s.toCharArray();
        int open = 0, star = 0;

        for (int i = 0; i < str.length; i++) {
            if (str[i] == '(') {
                open++;
            } else if (str[i] == '*') {
                star++;
            } else {
                if (open <= 0 && star <= 0)
                    return false;

                if (open > 0)
                    open--;
                else
                    star--;
            }
        }

        return star - open >= 0;
    }
}
