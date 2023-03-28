public class CheckBalancedParenthesis2116 {
    public boolean canBeValid(String s, String locked) {
        if (s.length() % 2 == 1)
            return false;

        // if we can balance it going forward and backward then it is or can be made
        // valid
        char[] str = s.toCharArray();
        char[] lock = locked.toCharArray();

        int spaces = 0;
        int balance = 0;

        // going forward and checking if ")" are not unbalanced in worst case
        for (int i = 0; i < lock.length; i++) {
            if (lock[i] == '0') {
                spaces++;
            } else {
                balance += str[i] == '(' ? 1 : -1;
            }
            if (balance + spaces < 0)
                return false;
        }

        balance = 0;
        spaces = 0;
        // going backward and checking if "(" are not unbalanced in worst case
        for (int i = str.length - 1; i >= 0; i--) {
            if (lock[i] == '0') {
                spaces++;
            } else {
                balance += str[i] == ')' ? 1 : -1;
            }
            if (balance + spaces < 0)
                return false;
        }

        return true;
    }
}
