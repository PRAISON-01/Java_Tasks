/*
method 1: test that collection rate < 50%
    (given) successful Delivery = 25 
    (when) actualPayment = 
    

*/


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BackToSenderTest {

    @Test
    public void testThatCollectionRateIsLessThan50Percent() {
        //Given
        int successfulDelivery = 25;
        //When
        int actualPayment = BackToSender.riderPayment(successfulDelivery);
        //Then
        int expectedPayment = 9000;
        assertEquals(actualPayment ,expectedPayment);
    }

    @Test
    public void testBetween50and59PercentCollectionRate(){
        //given
        int successfulDelivery = 55;
        //when
       int expectedPayment = BackToSender.riderPayment(successfulDelivery);
        //check
        int actualPayment = 16000;
        assertEquals(actualPayment, expectedPayment);
    }

    @Test
    public void testBetween60and69PercentFollectionRate(){
        //given
        int successfulDelivery = 65;
        //when
        int expectedPayment = BackToSender.riderPayment(successfulDelivery);  
        //check
        int actualPayment = 21250;
        assertEquals(actualPayment, expectedPayment);    
    }

    @Test
    public void testThatCollectionRateIsGreaterThanOrEqualTo70Percent(){
        //given
        int successfulDelivery = 80;
        //when
        int expectedPayment = BackToSender.riderPayment(successfulDelivery);
        //check
        int actualPayment = 45000;
    }

    

}
