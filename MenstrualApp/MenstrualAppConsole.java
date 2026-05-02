import java.util.Scanner;

public class MenstrualAppConsole {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println();
        System.out.println("***** MENSTRUAL CALCULATOR APP *****");
        System.out.println("          Calendar Method           ");
        System.out.println("""                                      




                                                                """);
        System.out.println("Enter The Number of Days for  your last 6 cycles:");

        int[] cycles = new int[6];
        for(int index = 0; index < cycles.length; index++){
            System.out.print("Cycle "+ (index + 1) + " : ");
            cycles[index] = input.nextInt();
        }

        int unsafeStart = MenstrualApp.getFirstSafePeriod(cycles);
        int unsafeEnd = MenstrualApp.getSecondSafePeriod(cycles);
        int longest = MenstrualApp.getLongestOf(cycles);


        System.out.print("Fertile Days is from Day "+ unsafeStart +" Day "+ unsafeEnd);
        System.out.print("\nFirst Safe Days is from Day 1 to Day" + (unsafeStart - 1));
        System.out.print("\nSecond Safe Days is from Day "+ (unsafeEnd + 1) + " till next Cycle\n");

        System.out.print("\nOvulation Cycle: "+ MenstrualApp.calculateOvulationDays(longest)+ " days");
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

