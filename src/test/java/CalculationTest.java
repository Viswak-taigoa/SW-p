import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculationTest {

    @Test
    void testTimeCalculation() {
        assertEquals(50.0, Calculation.timecalculation(100, 2), 0.001);
        assertEquals(25.0, Calculation.timecalculation(50, 2), 0.001);
        assertEquals(10.0, Calculation.timecalculation(100, 10), 0.001);
    }


}
