import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UndergroundSystem1396Test {

    @Test
    public void base_case_single_travel() {
        UndergroundSystem1396 undergroundSystem = new UndergroundSystem1396();
        undergroundSystem.checkIn(10, "Leyton", 3);
        undergroundSystem.checkOut(10, "Paradise", 8); // Customer 10 "Leyton" -> "Paradise" in 8-3 = 5
        Assertions.assertEquals(undergroundSystem.getAverageTime("Leyton", "Paradise"), 5); // return 5.00000, (5) /
                                                                                            // 1 = 5

    }
}
