/*
TestRangeFunction.java
*/
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class TestRangeFunction{

    @Test
    public void testThatRangeFunctionToReturnRange(){
        int[] numbers = {2,5,7,9,20};
        int expectedRange = 18;
        int actualRange = RangeFunction.getRange(numbers);
        assertEquals(actualRange, expectedRange);
    }

}
