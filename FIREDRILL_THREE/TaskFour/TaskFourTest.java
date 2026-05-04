/*
TaskFourTest.java

testThatArrayPrintsEvenIndex
*/
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;


public class TaskFourTest{

    @Test
    public void testThatArrayPrintsEvenIndex(){

        int[] numbers = { 10, 20, 30, 40, 50, 60, 70 };
        int[] expected = {10, 30, 50, 70};
        int[] actual = TaskFour.getEvenIndex(numbers);
        assertEquals(actual, expected); 
    }

}

