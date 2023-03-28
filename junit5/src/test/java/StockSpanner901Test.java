import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StockSpanner901Test {

    @Test
    public void happy_case() {

        StockSpanner901 stockSpanner = new StockSpanner901();
        Assertions.assertEquals(stockSpanner.next(100), 1); // return 1
        Assertions.assertEquals(stockSpanner.next(80), 1); // return 1
        Assertions.assertEquals(stockSpanner.next(60), 1); // return 1
        Assertions.assertEquals(stockSpanner.next(70), 2); // return 2
        Assertions.assertEquals(stockSpanner.next(60), 1); // return 1
        Assertions.assertEquals(stockSpanner.next(75), 4); // return 4, because the last 4 prices
    }
}
