import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShoppingOffers638Test {

    @Test
    public void happy_case() {
        Assertions.assertEquals(new ShoppingOffers638().shoppingOffers(List.of(2, 5),
                List.of(List.of(3, 0, 5), List.of(1, 2, 10)), List.of(3, 2)), 14);

    }
}
