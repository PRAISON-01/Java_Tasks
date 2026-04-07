
import java.util.Scanner;

public class  MinutesCalc {
 public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter Number of Minutes : ");
    int minutes= input.nextInt();

    int days = minutes / 1440;
    int hours = (minutes % 1440) / 60;
    int minutes2 = minutes % 60;

    System.out.printf("%d Minutes is : %d days, %d hours and %d minutes\n", minutes, days, hours, minutes2);
 }
}
