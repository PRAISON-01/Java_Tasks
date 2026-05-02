import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MesntrualAppTest{
   

    @Test   
   public void testThatCycleListGivesFertileWindowStart() {
        int[] cycles = {28, 26, 30, 28, 29, 27};
        int actualStart = MenstrualApp.getLongestOf(cycles) - 18;
        int expectedStart = 12;
        assertEquals(expectedStart, actualStart);

    }

   @Test
    public void testThatCycleListGivesFertileWindowEnd() {
        int[] cycles = {28, 26, 30, 28, 29, 27};
        int actualEnd = MenstrualApp.getShortestOf(cycles) - 11;
        int expectedEnd = 15;
        assertEquals(expectedEnd, actualEnd);

    }


    @Test
    public void testFirstSafePeriod(){
        int[] cycles = {28, 26, 30, 28, 29, 27};
        int firstSafePeriod = 7;
        int actualStart = MenstrualApp.getFirstSafePeriod(cycles);
        assertTrue( firstSafePeriod < actualStart);

    }

    @Test
    public void testSecondSafePeriod(){
        int[] cycles = {28, 26, 30, 28, 29, 27};
        int secondSafePeriod = 20;
        int actualEnd = MenstrualApp.getSecondSafePeriod(cycles);
        assertTrue(secondSafePeriod > actualEnd);
    }

    @Test
    public void testThatCalculatesOvulationDays(){
        int cycleDays = 28;
        int expecedOvulationeDays = 14;
        int actualOvulationDays = MenstrualApp.calculateOvulationDays(cycleDays);
        assertEquals(expecedOvulationeDays, actualOvulationDays);
    }


}
/*
MesntrualAppTest.java

Step 1: Find your cycle data
*Find the list of your last six cycles

cycle 1: 28 days
cycle 2: 26 days
cycle 3: 30 days
cycle 4: 28 days
cycle 5: 29 days
cycle 6: 27 days

Step 2: Calculate the Unsafe(Fertile) Window
Using calender Method

subtract 18 from longest cycle (the result becomes the day the starting of the fertile days)
subtract 11 from shortest cycle(the reasult indicate the end of the fertile days)
the start and end is the days where there is high risk of pregnancy

Step: 3 Identify the safe periods

Any days outside the days of the fertile window are considered "safe" because an egg is likely not available for fertilisation

first safe periods: Day 1(start of periods) to day seven

Second safe periods: from day 20 until next period starts

Step 4: Ovulation usually occurs 14 days before the next period begins

for 28- day cycle: 28- 14 = day 14

for 30-day cycle: 30-14 = day 16


*/

