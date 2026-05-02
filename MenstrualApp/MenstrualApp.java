public class MenstrualApp{

    public static int getLongestOf(int[] cycles){

        int longestCycle = cycles[0];

        for(int index = 1; index < cycles.length; index++){
            if(cycles[index] > longestCycle){
                longestCycle = cycles[index];
            }
        }
        return longestCycle;
    }

    public static int getShortestOf(int[] cycles){

        int shortestCycle = cycles[0];

        for(int index = 1; index < cycles.length; index++){
            if(cycles[index] < shortestCycle){
                shortestCycle = cycles[index];
            }
}
        return shortestCycle;
    }

    public static int getFirstSafePeriod(int[] cycles){
        int fertileStart = getLongestOf(cycles)-18;
        return fertileStart;
    }

    public static int getSecondSafePeriod(int[] cycles){
        int fertileEnd = getShortestOf(cycles)-18;
        return fertileEnd;
    }

    public static int calculateOvulationDays(int cycleDays){
        int result = cycleDays - 14;
        return result;
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

