import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class EarliestMomentForFriendsTest {

	@Test
	public void t_equals_three() {
		Assertions.assertThat(new EarliestMomentForFriends().earliestAcq(
				new int[][] {
						{ 0, 2, 0 }, { 1, 0, 1 }, { 3, 0, 3 }, { 4, 1, 2 }, { 7, 3, 1 }
				}, 4)).isEqualTo(3);

	}

	@Test
	public void happy_case() {
		Assertions.assertThat(new EarliestMomentForFriends().earliestAcq(
				new int[][] {
						{ 20190101, 0, 1 }, { 20190104, 3, 4 }, { 20190107, 2, 3 }, { 20190211, 1, 5 },
						{ 20190224, 2, 4 }, { 20190301, 0, 3 }, { 20190312, 1, 2 }, { 20190322, 4, 5 }
				}, 6)).isEqualTo(20190301);

	}
}
