public class LeapYearCounter {
    public static void main(String[] args){
    int count = 0;
    for(int leapYear = 2000; leapYear < 2100 ; leapYear += 4){
        System.out.print(leapYear + " ");
        count++;
        if (count == 10) System.out.println("");
        if (count == 20) System.out.println("");
    }
    }
}
