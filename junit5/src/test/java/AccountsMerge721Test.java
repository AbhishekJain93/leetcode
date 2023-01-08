import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class AccountsMerge721Test {

	@Test
	public void mulitple_accounts_with_same_person() {

		Assertions.assertThat(new AccountsMerge721().accountsMerge(
				List.of(
						List.of("John", "johnsmith@mail.com", "john_newyork@mail.com"),
						List.of("John", "johnsmith@mail.com", "john00@mail.com"),
						List.of("Mary", "mary@mail.com"),
						List.of("John", "johnnybravo@mail.com"))

		)).isEqualTo(List.of(
				List.of("John", "john00@mail.com", "john_newyork@mail.com", "johnsmith@mail.com"),
				List.of("Mary", "mary@mail.com"),
				List.of("John", "johnnybravo@mail.com")));

	}
}