import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class IsEvenIsNotTest{

    @Test
    public void testThat2IsEven(){
        //Given        
        int number = 2;
        //When     
        boolean actual = IsEvenIsNot.IsEven(number);
        //Expected
        assertTrue(actual);
    }

}


