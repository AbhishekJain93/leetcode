import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CheckBalancedParenthesis2116Test {

    @Test
    public void happy_case_valid() {
        Assertions.assertEquals(new CheckBalancedParenthesis2116().canBeValid("))()))", "010100"), true);
    }
}
