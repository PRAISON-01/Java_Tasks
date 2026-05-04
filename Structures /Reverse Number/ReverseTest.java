/*
ReverseTest.java

testThatReverseIsCorrect

testThatReverseReturnsTrueIfApaliindrome
*/

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;


public class ReverseTest{

    @Test
    public void testThatReverseIsCorrect(){

        int number = 123;
        int expected = 321;
        int actual = Reverse.getReverseOf(number);
        assertEquals(actual, expected);
    }

    @Test
    public void testThatNumberIsPalindrome(){
        
        int number = 121;
        boolean expected = Reverse.isTrue(number);
        assertTrue(expected);
    }

}

