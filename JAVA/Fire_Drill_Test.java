import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestExample {
    @Test
    public void testThatReverseArrayReturnsTheReverseOfAnArray() {
        int[] array = {1, 2, 3, 4, 5};
        
        int[] expected = Example.reverseArray(array);
        int[] actual = {5, 4, 3, 2, 1};
        
        assertArrayEquals(actual, expected);
    }
    
    @Test
    public void testThatMethodRemovesAllEvenNumbers() {
        int[] array = {1, 2, 3, 4, 5};
        
        int[] expected = Example.removeEven(array);
        int[] actual = {1, 3, 5};
        
        assertArrayEquals(actual, expected);
    }
    
    @Test
    public void testThatMethodRemovesAllOddNumbers() {
        int[] array = {1, 2, 3, 4, 5};
        
        int[] expected = Example.removeOdd(array);
        int[] actual = {2, 4};
        
        assertArrayEquals(actual, expected);
    }
    
    @Test
    public void testThatMethodRemovesDuplicateNumbers() {
        int[] array = {1,1,1,1,1,1,1,1,1,1, 2, 2, 3, 3, 4, 4, 5, 5};
        
        int[] expected = Example.removeDuplicate(array);
        int[] actual = {1, 2, 3, 4, 5};
        
        assertArrayEquals(actual, expected);
    }
}
