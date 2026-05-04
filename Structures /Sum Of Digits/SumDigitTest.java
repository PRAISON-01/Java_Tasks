/*
SumDigitTest.java

testThatCalculationIsCorrect
*/

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;


public class SumDigitTest{

    @Test
    public void testThatCalculationIsCorrect(){

        long number = 9876543210L;
        long expectedSum = 45;
        long actualSum = SumDigit.getSumOf(number);
        assertEquals(actualSum, expectedSum);
    }


}
