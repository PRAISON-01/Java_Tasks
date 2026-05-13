import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StandardDeviation_Test{

    @Test
    public void testThatAddMethodReturnsSum(){

        int[] array = {1, 2, 3, 4, 5};
        int actual = StandardDeviation.add(array);
        int expected = 15;
        assertEquals(actual, expected);

    }

    @Test
    public void testThatMeanMethodReturnsMean(){

        int[] array = {1, 2, 3, 4, 5};
        double actual = StandardDeviation.mean(array);
        int expect = 3;
        assertEquals(actual, expect);
    }

    @Test
    public void testThatMeanDeviationReturnsMeanDeviation(){

        int[] array = {1, 2, 3, 4, 5};
        double actual = StandardDeviation.meanDeviation(array);
        double expected = 1.2;
        assertEquals(actual, expected);

    }

    @Test
    public void testThatSquareOfMeanDeviationReturnsCorrectValue(){

        int[] array = {1, 2, 3, 4, 5};
        double actual = StandardDeviation.squareOfMeanDeviation(array);
        double expected = 10;
        assertEquals(actual, expected);
    }

    @Test
    public void testThatstandardDeviationReturnsCorrectly(){
        
        int[] array = {1, 2, 3, 4, 5};
        double actual = StandardDeviation.standardDeviation(array);
        double expected = 1.4142135623730951;
        assertEquals(actual, expected);
    }


//{2, 4, 4, 4, 5, 5, 7, 9};
}
