/*Small Math App Test*/
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class SmallMathApp_Test{

//    @Beforeeach
//    void setUp(){
        SmallMathApp myMathApp = new SmallMathApp();
//    }

    @Test
    public void testThatMultiply(){

//        myMathApp myMathApp = new myMathApp();
        
        double numberOne = 10;
        double numberTwo = 5;
        double actual = myMathApp.getOperator('x');
        double expected = 50;
        assertEquals(actual, expected);
    }

    @Test
    public void testThatDivideOperatorWorks(){

//        myMathApp myMathApp = new myMathApp();
        
        double numberOne = 10;
        double numberTwo = 5;
        double actual = myMathApp.getOperator('/');
        double expected = 2;
        assertEquals(actual, expected);
    }

    @Test
    public void testThatAddOperatorWorks(){

        double numberOne = 10;
        double numberTwo = 5;
        double actual = myMathApp.getOperator('+');
        double expected = 15;
        assertEquals(actual, expected);
    }

//    @Test
//    public void testThatMinusOperatorWorks(){
//
//        myMathApp myMathApp = new myMathApp();
//        
//        double numberOne = 5;
//        double numberTwo = 15;
//        double actual = myMathApp.getOperator('-');
//        double expected = -10;
//        assertEquals(actual, expected);
//    }

    @Test
    public void testThatdivideOperatorWorksorWhenNumberTwoIsZero(){

        double numberOne = 10;
        double numberTwo = 0;
        double actual = myMathApp.getOperator('+');
       assertThrows(IllegalArgumentException.class , ()-> myMathApp.divide(numberOne, numberTwo));
    }
    


    

    @Test
    public void testThatMultiplyMethodReturnsCorrectResult(){

        double numberOne = 2;
        double numberTwo = 5;
        double actual = myMathApp.multiply(numberOne, numberTwo);
        double expected = 10;
        assertEquals(actual, expected);
    }

    @Test
    public void testThatAddMethodReturnsCorrectResult(){

        double numberOne = 2;
        double numberTwo = 5;
        double actual = myMathApp.add(numberOne, numberTwo);
        double expected = 7;
        assertEquals(actual, expected);
    }
    
    @Test
    public void testThatMinusMethodReturnsCorrectResult(){

        double numberOne = 2;
        double numberTwo = 5;
        double actual = myMathApp.minus(numberOne, numberTwo);
        double expected = -3;
        assertEquals(actual, expected);
    }
    

    @Test
    public void testThatDivideMethodReturnsCorrectResult(){

        double numberOne = 2;
        double numberTwo = 5;
        double actual = myMathApp.divide(numberOne, numberTwo);
        double expected = 0.4;
        assertEquals(actual, expected);
    }

    @Test
    public void testThatWhenNumberDividedByZeroHandlesDivisionByZero(){

        assertThrows(IllegalArgumentException.class , ()-> myMathApp.divide(5, 0));
    }
    

}
