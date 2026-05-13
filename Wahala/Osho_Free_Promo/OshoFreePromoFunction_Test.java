//import org.junit.jupiter.api.Test;
//
//import org.junit.jupiter.api.Assertions.assertEquals;
//import org.junit.jupiter.api.Assertions.assertTrue;
//import org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;


public class OshoFreePromoFunction_Test{

    @Test
    public void testThatgetDiscountReturnsZeroWhenTotalIs4000withPromoCode(){

        int total = 4000;
        String code = "STARTER10";
        double actual =  OshoFreePromoFunction.getDiscount(total, code);
        double expected = 4000.00;
        
        assertEquals(expected, actual);
    }

    @Test
    public void testThatgetDiscountReturnsNormalCartTotalWhenPromoCodeIsInvalid(){

        int total = 4000;
        String code = "SEMICOLON19";
        double actual =  OshoFreePromoFunction.getDiscount(total, code);
        double expected = 4000.00;
        
        assertEquals(expected, actual);
    }

    @Test
    public void testThatgetDiscountReturns1200IfCartTotalIs15000andPromoCodeOfBIGBOY20(){

        int total = 15000;
        String code ="BIGBOY20";
        double actual = OshoFreePromoFunction.getDiscount(total, code);
        double expected = 12000;

        assertEquals(expected, actual);
    }

     @Test
    public void testThatgetDiscountReturns19500IfCartTotalIs30000andPromoCodeOfOSHOFREE35(){

        int total = 30000;
        String code ="OSHOFREE35";
        double actual = OshoFreePromoFunction.getDiscount(total, code);
        double expected = 19500;

        assertEquals(expected, actual);
    }

    @Test
    public void testThatgetDiscountReturnsNormalCartTotalWhenPromoCodeIsEmpty(){

        int total = 4000;
        String code = "";
        double actual =  OshoFreePromoFunction.getDiscount(total, code);
        double expected = 4000.00;
    }


}

