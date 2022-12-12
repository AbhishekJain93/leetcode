import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoggerRateLimiterTest {

	@Test
	public void rate_limited_input() {

		RateLimitedLogger logger = new RateLimitedLogger();
		Assertions.assertThat(logger.shouldPrintMessage(1, "foo")).isEqualTo(true); // return true, next allowed
																					// timestamp for "foo" is 1 + 10 =
																					// 11
		logger.shouldPrintMessage(2, "bar"); // return true, next allowed timestamp for "bar" is 2 + 10 = 12
		logger.shouldPrintMessage(3, "foo"); // 3 < 11, return false
		logger.shouldPrintMessage(8, "bar"); // 8 < 12, return false
		logger.shouldPrintMessage(10, "foo"); // 10 < 11, return false
		logger.shouldPrintMessage(11, "foo"); // 11 >= 11, return true, next allowed timestamp for "foo" is 11 + 10 = 21
	}

}
