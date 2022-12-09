import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class PartitionLabelTest {
	@Test
	public void segregated_partitions() {

		Assertions.assertThat(new PartitionLabel().partitionLabels("ababcbacadefegdehijhklij"))
				.isEqualTo(List.of(9, 7, 8));
	}
}
