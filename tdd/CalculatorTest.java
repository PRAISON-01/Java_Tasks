import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void testAddTwoNumbers() {
        Calculator calc = new Calculator();

        int result = calc.add(3, 4);

        assertEquals(7, result);
    }
}


