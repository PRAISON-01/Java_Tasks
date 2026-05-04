/*
PentagonalNumberTest.java

testThatthatcalculationiscorrect

testThatloopstopat100
*/
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;


public class PentagonalNumberTest {

    @Test
    public void testThatthatWhenNumberISOneReturnOne(){
        int number = 1;
        int expected = 1;
        int actual = PentagonalNumber.getPentagonalNumber(number);
        assertEquals(actual, expected);
    }

    @Test
    public void testThatthatWhenNumberISTwoReturnFive(){
        int number = 2;
        int expected = 5;
        int actual = PentagonalNumber.getPentagonalNumber(number);
        assertEquals(actual, expected);
    }

    @Test
    public void testThatthatWhenNumberIsFiveReturn35(){
        int number = 5;
        int expected = 35;
        int actual = PentagonalNumber.getPentagonalNumber(number);
        assertEquals(actual, expected);
    }

    @Test
    public void testThatPentagonalNumberloopstopat100(){

        int expected = 14950;
        int actual = PentagonalNumber.getPentagonalNumber(100);
        assertEquals(actual, expected);
    }

}
