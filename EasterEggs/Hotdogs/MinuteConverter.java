import java.util.Scanner;

public class MinuteConverter {
 public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter Number of Minutes : ");
    int totalMinutes = input.nextInt();

    int year = totalMinutes / 525600;
    int days = (totalMinutes % 525600) / 1440  ;
    
    System.out.printf("%d minutes : %d year(s) and %d days \n", totalMinutes , year , days);
 }
}
