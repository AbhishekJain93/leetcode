import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class TimeBasedKeyValue981Test {

	@Test
	public void set_and_get() {
		TimeBasedKeyValue981 t = new TimeBasedKeyValue981();
		t.set("k", "v1", 2);
		t.set("k", "v2", 5);

		Assertions.assertThat(t.get("k", 6)).isEqualTo("v2");

	}
}
