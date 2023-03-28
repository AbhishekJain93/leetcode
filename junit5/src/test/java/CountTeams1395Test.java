import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountTeams1395Test {
    @Test
    public void three_teams() {
        Assertions.assertEquals(new CountTeams1395().numTeams(new int[] { 2, 5, 3, 4, 1 }), 3);

    }
}
