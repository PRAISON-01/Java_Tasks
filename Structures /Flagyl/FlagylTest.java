import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
//import static org.junit.jupiter.api.Assertions.assertFalse;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
public class FlagylTest{

    @Test
    public void testThat25ReturnFalse(){
        
        
        boolean actual = Flagyl.isPrime(25);
        boolean expected = false;
        assertEquals(actual, expected);
    }

    @Test
    public void testThatArrayReturnsOddCountAndEvenCount(){

        int[] numbers = {1,2,3,4,5,6,7,8,9,0};
        int[] actual = Flagyl.getOddEvenCount(numbers);
        int[] expected = {5, 5};
        assertArrayEquals(actual, expected);
        
    }

}
