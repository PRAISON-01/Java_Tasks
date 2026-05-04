/*
MaxMethodTest.java

testThatLargestOf123returns3

testThatLargestOf321Return3

testThatLargestOf222Returns2

testThatLargestOfnegative12and3ReturnsNegative1
*/

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MaxMethodTest{

    @Test
    public void testThatLargestOf123returns3(){

        int[] numbers = {1,2,3};
        int expected = 3;
        int actual = MaxMethod.maxOf(numbers);
        assertEquals(actual, expected);
    }

    @Test
    public void testThatLargestOf321Return3(){

        int[] numbers = {3,2,1};
        int expected = 3;
        int actual = MaxMethod.maxOf(numbers);
        assertEquals(actual, expected);
    }

    @Test
    public void testThatLargestOf222Returns2(){

        int[] numbers = {2,2,2};
        int expected = 2;
        int actual = MaxMethod.maxOf(numbers);
        assertEquals(actual, expected);
    }

    @Test
    public void testThatLargestOfnegative12and3ReturnsNegative1(){

        int[] numbers = {-1,-2,-3};
        int expected = -1;
        int actual = MaxMethod.maxOf(numbers);
        assertEquals(actual, expected);
    }
    

}

