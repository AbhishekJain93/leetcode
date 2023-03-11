import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GenerateParenthesis22Test {

    @Test
    public void three_pairs() {
        Assertions.assertEquals(new GenerateParenthesis22().generateParenthesis(3),
                List.of("((()))", "(()())", "(())()", "()(())", "()()()"));
    }
}
