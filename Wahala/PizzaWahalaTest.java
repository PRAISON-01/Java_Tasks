/*
PizzaWahalaTest.java
*/
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaWahalaTest {

    @Test

    public void testOdogwuSize45people(){
    //Given
    int numberOfPeople = 45;
    //when   
    int boxesNeeded = PizzaWahala.getBox(numberOfPeople); 
    int leftOverSlices = PizzaWahala.getLeftOvers(numberOfPeople);
    int totalCost = PizzaWahala.getTotalCost(numberOfPeople);
    //Then
    assertEquals(4, boxesNeeded);
    assertEquals(3, leftOverSlices);
    assertEquals(20800, totalCost);
    }

}
