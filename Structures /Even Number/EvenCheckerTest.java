/*
EvenCheckerTest.java

testThatisEven4ReturnsTrue

testThatisEven-2ReturnsTrue

*/

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EvenCheckerTest{

    public void testThatisEven4ReturnsTrue() {

        int number = 4;

        boolean expected = EvenChecker.isEven(4);
        assertTrue(expected);
        
    }

    public void testThatisEvenminus2ReturnsTrue() {

        int number = -2;

        boolean expected = EvenChecker.isEven(-2);
        assertTrue(expected);
        
    }


}
