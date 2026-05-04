/*
SortedNumberTest.java

testThatNumbersAreSortedDecreasingly

*/

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class SortedNumberTest{

    @Test
    public void testThatNumbersAreSortedDecreasingly(){

        double[] actual = SortNumbers.getSortedArray(5.0, 15.0, 10.0);
        double[] expected = {15.0, 10.0, 5.0};
        assertArrayEquals(expected, actual);
    }

}
