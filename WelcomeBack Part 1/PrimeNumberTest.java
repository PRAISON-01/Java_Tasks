import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PrimeNumberTest{

       
        @Test
        public void testThatCountIs2NumberIsPrime(){
            int number = 7;
            boolean expected = PrimeNumberModule.isPrime(number);
            assertTrue(expected);
        }

        @Test
        public void testThatCountIsNot2NumberIsNotPrime(){
            int number = 8;
            boolean expected = PrimeNumberModule.isPrime(number);
            assertFalse(expected);

 
       }
}              
