import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidParenthesis678Test {

    @Test
    public void with_star() {
        Assertions.assertEquals(new ValidParenthesis678().checkValidString("(*))"), true);
    }

    @Test
    public void stars_preceeding_open() {
        Assertions.assertEquals(new ValidParenthesis678().checkValidString("**(())"), false);
    }

    @Test
    public void long_sequence() {
        Assertions.assertEquals(new ValidParenthesis678().checkValidString(
                "(((((*(()((((*((**(((()()*)()()()*((((**)())*)*)))))))(())(()))())((*()()(((()((()*(())*(()**)()(())"),
                false);
    }
}
