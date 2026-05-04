/*

SumOfDigitsTest.java

testThatSumOfDigits123returns6

testThatSumOfDigits0returns0

testThatSumOfDigits999returns27

testThatSumOfDigits1000returns1
*/
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class SumOfDigitsTest{

    @Test
    public void testThatSumOfDigits123returns6(){

        int number = 123;
        int expectedSum = 6;
        int actualSum = SumOfDigits.getSumOf(123);
        assertEquals(expectedSum, actualSum);
    }

    @Test
    public void testThatSumOfDigits0returns0(){

        int number = 0;
        int expectedSum = 0;
        int actualSum = SumOfDigits.getSumOf(number);
        assertEquals(expectedSum, actualSum); 
    }

    @Test
    public void testThatSumOfDigits999returns27(){

        int number = 999;
        int expectedSum = 27;
        int actualSum = SumOfDigits.getSumOf(number);
        assertEquals(expectedSum, actualSum); 
    }

    @Test
    public void testThatSumOfDigits1000returns1(){

        int number = 1000;
        int expectedSum = 1;
        int actualSum = SumOfDigits.getSumOf(number);
        assertEquals(expectedSum, actualSum); 
    }

}
