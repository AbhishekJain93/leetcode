import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * 
 * There are a lot of people at the cinema box office standing in a huge line.
 * Each of them has a single 100, 50 or 25 dollar bill. The movie ticket costs
 * 25 dollars.
 * 
 * Clerk wants to sell a ticket to every single person in this line.
 * Can Clerk sell a ticket to every person and give change if he initially has
 * no money and sells the tickets strictly in the order people queue?
 * 
 * Return YES, if Clerk can sell a ticket to every person and give change with
 * the bills he has at hand at that moment.
 * Otherwise, return NO.
 * 
 * Examples:
 * canProcessLine([25, 25, 50]) -> YES
 * canProcessLine([25, 100]) -> NO
 * canProcessLine([25, 25, 50, 50, 100]) -> NO
 * 
 */

public class TalabatInterviewTest {

	@Test
	public void empty_queue() {
		Assertions.assertThat(new TalabatInterview().canProcessLine(
				new int[] {})).isEqualTo(true);

	}

	@Test
	public void happy_case_change_three_customers() {
		Assertions.assertThat(new TalabatInterview().canProcessLine(
				new int[] { 25, 25, 50 })).isEqualTo(true);

	}

	@Test
	public void first_customer_blocked_100() {
		Assertions.assertThat(new TalabatInterview().canProcessLine(
				new int[] { 100 })).isEqualTo(false);

	}

	@Test
	public void first_customer_blocked_50() {
		Assertions.assertThat(new TalabatInterview().canProcessLine(
				new int[] { 50 })).isEqualTo(false);

	}

	@Test
	public void run_out_of_change() {
		Assertions.assertThat(new TalabatInterview().canProcessLine(
				new int[] { 25, 25, 50, 50, 100 })).isEqualTo(false);

	}

	@Test
	public void run_out_of_change_two_person_100() {
		Assertions.assertThat(new TalabatInterview().canProcessLine(
				new int[] { 25, 100 })).isEqualTo(false);

	}

	@Test
	public void run_out_of_change_two_person_50() {
		Assertions.assertThat(new TalabatInterview().canProcessLine(
				new int[] { 25, 50 })).isEqualTo(true);

	}

	@Test
	public void long_queue_success() {
		Assertions.assertThat(new TalabatInterview().canProcessLine(
				new int[] { 25, 50, 25, 100, 25, 25, 50, 100, 25, 50, 25, 100, 25, 50, 25, 100, 25, 25, 25, 100 }))
				.isEqualTo(true);

	}

	// 25,50,25,100,25,25,50,100,25,50,25,100,25,50,25,100,25,25,25,100

	@Test
	public void long_queue_run_out_of_change() {
		Assertions.assertThat(new TalabatInterview().canProcessLine(
				new int[] { 25, 25, 50, 100, 25, 25, 50, 100, 25, 25, 25, 100, 25, 25, 50, 100, 25, 25, 25, 100, 25, 50,
						50, 25 }))
				.isEqualTo(false);

	}
}
