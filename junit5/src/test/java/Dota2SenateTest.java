import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class Dota2SenateTest {

	@Test
	public void dire_win() {
		Assertions.assertThat(new Dota2Senate649().predictPartyVictory("DDRRR")).isEqualTo("Dire");
	}

	@Test
	public void equal_number_of_senators() {
		Assertions.assertThat(new Dota2Senate649().predictPartyVictory("DRRD")).isEqualTo("Dire");
	}
}
